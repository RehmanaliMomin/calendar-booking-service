package com.booking.message.request;

public class BookSlotRequest {
	
	public long userId;
	public long slotId;
	
	public String candidateEmail;
	public String candidatePhone;
	public long getUserId() {
		return userId;
	}
	public void setUserId(long userId) {
		this.userId = userId;
	}
	public long getSlotId() {
		return slotId;
	}
	public void setSlotId(long slotId) {
		this.slotId = slotId;
	}
	public String getCandidateEmail() {
		return candidateEmail;
	}
	public void setCandidateEmail(String candidateEmail) {
		this.candidateEmail = candidateEmail;
	}
	public String getCandidatePhone() {
		return candidatePhone;
	}
	public void setCandidatePhone(String candidatePhone) {
		this.candidatePhone = candidatePhone;
	}
	
	
	

}
