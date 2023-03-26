package com.example.demo.Exception;


public class ProductNotFoundException extends Exception{

    public ProductNotFoundException(String message){
        super(message);
    }
}