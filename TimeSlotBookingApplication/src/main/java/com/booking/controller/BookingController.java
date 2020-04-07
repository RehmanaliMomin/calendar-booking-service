package com.booking.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.booking.manager.TimeSlotBookingManager;
import com.booking.message.request.BookSlotRequest;
import com.booking.message.request.DefineSlotRequest;
import com.booking.message.response.GetSlotsResponse;
import com.booking.message.response.Response;

@RestController
public class BookingController {

	@Autowired
	TimeSlotBookingManager timeSlotBooingManager;

	@PostMapping(value = "/api/defineSlots", headers = "Accept=application/json")
	@PreAuthorize("hasRole('USER')")
	public ResponseEntity<Response> defineSlots(@RequestBody DefineSlotRequest request) {
		System.out.println("define slots");
		Response response = new Response();
		timeSlotBooingManager.defineSlots(request);
		response.setStatus(true);
		return new ResponseEntity<Response>(response, HttpStatus.OK);
	}

	@GetMapping(value = "/api/auth/getSlotsOfUser/{userId}", headers = "Accept=application/json")
	public ResponseEntity<Response> getSlotsOfUser(@PathVariable Long userId) {
		System.out.println("get slots");
		Response response = new Response();
		GetSlotsResponse responseObj = timeSlotBooingManager.getSlotsOfUser(userId);
		response.setStatus(true);
		response.setResponseObject(responseObj);
		return new ResponseEntity<Response>(response, HttpStatus.OK);
	}

	@PostMapping(value = "/api/auth/bookSlot", headers = "Accept=application/json")
	public ResponseEntity<Response> bookSlot(@RequestBody BookSlotRequest request) {
		System.out.println("book slot");
		Response response = new Response();
		timeSlotBooingManager.bookSlots(request);
		response.setStatus(true);
		return new ResponseEntity<Response>(response, HttpStatus.OK);
	}

}