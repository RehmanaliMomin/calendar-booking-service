package com.booking.message.response;

public class Response {

    boolean status;
    String errorMessage;
    Object responseObject;
    public boolean isStatus() {
        return status;
    }
    public void setStatus(boolean status) {
        this.status = status;
    }
    public String getErrorMessage() {
        return errorMessage;
    }
    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }
    public Object getResponseObject() {
        return responseObject;
    }
    public void setResponseObject(Object responseObject) {
        this.responseObject = responseObject;
    }
    @Override
    public String toString() {
        return "Response [status=" + status + ", errorMessage=" + errorMessage + ", responseObject=" + responseObject
                + "]";
    }


}



