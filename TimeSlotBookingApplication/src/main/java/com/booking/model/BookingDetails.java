package com.booking.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.NotBlank;



@Entity
@Table(name = "bookingDetails", uniqueConstraints = {
        @UniqueConstraint(columnNames = {
            "bookingDetailsId"
        })
})


public class BookingDetails {
	
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long bookingDetailsId;

	private Long userBookingId;
	
	private String candidateEmailId;
	
	private String candidatePhone;

	public Long getBookingDetailsId() {
		return bookingDetailsId;
	}

	public void setBookingDetailsId(Long bookingDetailsId) {
		this.bookingDetailsId = bookingDetailsId;
	}

	public Long getUserBookingId() {
		return userBookingId;
	}

	public void setUserBookingId(Long userBookingId) {
		this.userBookingId = userBookingId;
	}

	public String getCandidateEmailId() {
		return candidateEmailId;
	}

	public void setCandidateEmailId(String candidateEmailId) {
		this.candidateEmailId = candidateEmailId;
	}

	public String getCandidatePhone() {
		return candidatePhone;
	}

	public void setCandidatePhone(String candidatePhone) {
		this.candidatePhone = candidatePhone;
	}
	
	
	
	
	
	
	

}
