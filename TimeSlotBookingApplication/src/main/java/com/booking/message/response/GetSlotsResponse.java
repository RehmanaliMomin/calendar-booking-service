package com.booking.message.response;

import java.util.List;

import com.booking.model.Slots;

public class GetSlotsResponse {

    public Long userId;

    public List<Slots> list;


    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public List<Slots> getList() {
        return list;
    }

    public void setList(List<Slots> list) {
        this.list = list;
    }
}
