package com.booking.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.NotBlank;



@Entity
@Table(name = "slots", uniqueConstraints = {
        @UniqueConstraint(columnNames = {
            "slotId"
        })
})

public class Slots {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long slotId;
	

	private Date startTime;
	private Date endTime;
	
	
	public Long getSlotId() {
		return slotId;
	}

	public void setSlotId(Long slotId) {
		this.slotId = slotId;
	}

	public Date getStartTime() {
		return startTime;
	}

	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public Date getEndTime() {
		return endTime;
	}

	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}



}
