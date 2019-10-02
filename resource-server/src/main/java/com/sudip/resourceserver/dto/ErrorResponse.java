package com.sudip.resourceserver.dto;

public class ErrorResponse {

    private String message;
    private String calledUrl;
    private String cause;

    public ErrorResponse(String message, String calledUrl, String cause) {
        this.message = message;
        this.calledUrl = calledUrl;
        this.cause = cause;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getCalledUrl() {
        return calledUrl;
    }

    public void setCalledUrl(String calledUrl) {
        this.calledUrl = calledUrl;
    }

    public String getCause() {
        return cause;
    }

    public void setCause(String cause) {
        this.cause = cause;
    }

    @Override
    public String toString() {
        return "ErrorResponse{" +
                "message='" + message + '\'' +
                ", calledUrl='" + calledUrl + '\'' +
                ", cause='" + cause + '\'' +
                '}';
    }
}
