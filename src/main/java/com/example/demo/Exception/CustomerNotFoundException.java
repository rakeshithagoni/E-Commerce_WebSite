package com.example.demo.Exception;

public class CustomerNotFoundException extends Exception{

    public CustomerNotFoundException(String message){
        super(message);
    }
}