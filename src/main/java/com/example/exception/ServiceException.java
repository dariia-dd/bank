package com.example.exception;

public class ServiceException extends RuntimeException{
    private int code;
    private String message;
    private String details;

    public ServiceException()
    {

    }
    public ServiceException( final String message, final Throwable cause, int code,final String details,final String message1) {
        super(message,cause);
        this.code = code;
        this.message = message1;
        this.details = details;
    }



    public ServiceException(int code, String message, String details) {
        super();
        this.code = code;
        this.message = message;
        this.details = details;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }



}
