package com.booking.message.request;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;

public class Slot{
    public Slot(Date startTime, Date endTime) {
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public Slot() {

    }

    @JsonProperty
    public Date startTime;

    @JsonProperty
    public Date endTime;
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