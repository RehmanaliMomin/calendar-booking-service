package com.booking.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.booking.model.BookingDetails;

@Repository
public interface BookingDetailsRepository extends JpaRepository<BookingDetails, Long> {


}
