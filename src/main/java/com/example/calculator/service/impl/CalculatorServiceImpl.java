package com.example.calculator.service.impl;

import com.example.calculator.Exception.DivisionByZeroException;
import com.example.calculator.service.CalculatorService;
import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService {

    @Override
    public int plus(int num1, int num2) {
        return num1+num2;
    }

    @Override
    public int minus(int num1, int num2) {
        return num1-num2;
    }

    @Override
    public int multiply(int num1, int num2) {
        return num1 * num2;
    }

    @Override
    public double divide(int num1, int num2) {
        if (num2 == 0) {
            throw new DivisionByZeroException("Деление на ноль недопустимо");
        }
        return (double) num1/num2;
    }
}
