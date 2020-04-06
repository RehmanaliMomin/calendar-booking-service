package com.booking.message.request;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.*;

public class DefineSlotRequest {

	@JsonProperty
	private Long userId;

	@JsonCreator
	public DefineSlotRequest(@JsonProperty("userId") Long userId, @JsonProperty("slots") Slot[] slots) {
		this.userId = userId;
		this.slots = slots;
	}

	public DefineSlotRequest(){}

	@JsonProperty
	private Slot[] slots;
	
	
	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public Slot[] getSlots() {
		return slots;
	}

	public void setSlots(Slot[] slots) {
		this.slots = slots;
	}


}




