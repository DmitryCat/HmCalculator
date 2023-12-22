package com.example.calculator.Exception;

public class DivisionByZeroException extends IllegalArgumentException{

    public DivisionByZeroException(String s) {
        super(s);
    }
}
