package com.example.helloworld.ThrowAndThrows;

public class CustomException extends Exception{
    private String error;

    public CustomException(String error) {
        this.error = error;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }
}
