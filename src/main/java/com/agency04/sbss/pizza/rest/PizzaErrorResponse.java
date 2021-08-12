package com.agency04.sbss.pizza.rest;

public class PizzaErrorResponse {
    private int status;
    private String message;
    private long timeStamp;

    public PizzaErrorResponse(){}

    public PizzaErrorResponse(int status, String message, long timeStamp){
        this.status = status;
        this.message = message;
        this.timeStamp = timeStamp;
    }

    public int getStatus(){ return this.status; }
    public void setStatus(int status) { this.status = status;}

    public String getMessage(){ return this.message; }
    public void setMessage(String message) { this.message = message;}

    public long getTimeStamp(){ return this.timeStamp; }
    public void setTimeStamp(long username) { this.timeStamp= timeStamp;}
}
