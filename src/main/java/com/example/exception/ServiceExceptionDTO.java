package com.example.exception;

public class ServiceExceptionDTO {
    private int code;
    private String message;
    private String details;

    public ServiceExceptionDTO() {

    }

    public ServiceExceptionDTO(final ServiceException ex) {
        this.code = ex.getCode();
        this.message = ex.getMessage();
        this.details = ex.getDetails();

    }

    public ServiceExceptionDTO(int code, String message, String details) {
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
