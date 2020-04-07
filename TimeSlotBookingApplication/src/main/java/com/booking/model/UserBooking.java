package com.booking.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.NotBlank;


@Entity
@Table(name = "userbooking", uniqueConstraints = {
        @UniqueConstraint(columnNames = {
            "userBookingId"
        })
})


public class UserBooking {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userBookingId;
	
	private Long userId;
	
	private Long slotId;
	
	private boolean isBooked;

	public Long getUserBookingId() {
		return userBookingId;
	}

	public void setUserBookingId(Long userBookingId) {
		this.userBookingId = userBookingId;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public Long getSlotId() {
		return slotId;
	}

	public void setSlotId(Long slotId) {
		this.slotId = slotId;
	}

	public boolean isBooked() {
		return isBooked;
	}

	public void setBooked(boolean isBooked) {
		this.isBooked = isBooked;
	}
	
	

}
