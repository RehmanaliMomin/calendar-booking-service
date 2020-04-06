package com.booking.manager;

import java.util.*;
import java.util.Map;

import com.booking.message.request.BookSlotRequest;
import com.booking.message.request.DefineSlotRequest;
import com.booking.message.request.Slot;
import com.booking.message.response.GetSlotsResponse;
import com.booking.model.BookingDetails;
import com.booking.model.Slots;
import com.booking.model.UserBooking;
import com.booking.repository.BookingDetailsRepository;
import com.booking.repository.SlotsRepository;
import com.booking.repository.UserBookingRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TimeSlotBookingManager {

	@Autowired
	UserBookingRepository userBookingRepository;

	@Autowired
	SlotsRepository slotsRepository;

	@Autowired
	BookingDetailsRepository bookingDetailsRepository;


	public void defineSlots(DefineSlotRequest slotRequest) {
		
		long userId = slotRequest.getUserId();
		Slot[] slots = slotRequest.getSlots();
		
		List<Slots> slotsList = null;
		List<Long> slotIds = new ArrayList<>();
		
		

		for(int i=0;i<slots.length;i++) {
			Date startTime = slots[i].startTime;
			Date endTime = slots[i].endTime;
			slotsList = slotsRepository.findByStartTimeAndEndTime(startTime,endTime);

			if(!slotsList.isEmpty()){
				slotIds.add(slotsList.get(0).getSlotId());

			}
			else{

				Slots s = new Slots();
				s.setStartTime(startTime);
				s.setEndTime(endTime);
				Slots ss = slotsRepository.save(s);
				slotIds.add(ss.getSlotId());
			}
		}
		
		for(long s : slotIds){
			//add in UserBooking table with userId,s slots,isBooked false
			UserBooking obj = new UserBooking();
			obj.setBooked(false);
			obj.setSlotId(s);
			obj.setUserId(userId);
			userBookingRepository.save(obj);
		}
	}
	

	public GetSlotsResponse getSlotsOfUser(Long userId) {

		GetSlotsResponse response = new GetSlotsResponse();
		List<Slots> slots = new ArrayList<>();
		response.setUserId(userId);

		List<UserBooking> list = userBookingRepository.findByUserIdAndIsBooked(userId,false);

		for(UserBooking u : list){
			Slots slot = slotsRepository.findById(u.getSlotId()).get();
			slots.add(slot);
		}
		//Find from UserBooking Table whose userId = userId and isbooked=false;
		//save the slots in response.setslots() and return
		response.setList(slots);
		return response;
	}

	public void bookSlots(BookSlotRequest request) {
		long userId = request.getUserId();
		long slotId = request.getSlotId();
		
		String candidateEmail = request.getCandidateEmail();
		String candidatePhone = request.getCandidatePhone();

		UserBooking ub = userBookingRepository.findByUserIdAndSlotId(userId,slotId).get(0);
		ub.setBooked(true);

		//get Entry From UserBooking Table with the help of UserId and slotId and make the isBooking as true,
		// also take that userBookingId and make new entry in bookedDetails with that userBookingId, candidatePhone and candidateEmail.
		long userBookingId = ub.getUserBookingId();

		BookingDetails bookingDetails = new BookingDetails();
		bookingDetails.setUserBookingId(userBookingId);
		bookingDetails.setCandidateEmailId(candidateEmail);
		bookingDetails.setCandidatePhone(candidatePhone);

		bookingDetailsRepository.save(bookingDetails);



		
	}
	
	

}
