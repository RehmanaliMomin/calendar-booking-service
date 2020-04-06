package com.booking.repository;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.booking.model.*;

@Repository
public interface UserBookingRepository extends JpaRepository<UserBooking, Long> {

    List<UserBooking> findByUserIdAndIsBooked(Long userId, boolean isBooked);

    List<UserBooking> findByUserIdAndSlotId(Long userId, long slotId);
	
}
