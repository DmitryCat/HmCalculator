package com.example.calculator.CalculatorSeviseImplTest;

import com.example.calculator.Exception.DivisionByZeroException;
import com.example.calculator.service.impl.CalculatorServiceImpl;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class CalculatorServiceImplTest {

    private final CalculatorServiceImpl calculatorService = new CalculatorServiceImpl();

    @Test
    public void testPlus() {
        int num1 = 0, num2 = 0;
        int expectedResult = num1 + num2;
        int actualResult = calculatorService.plus(num1, num2);
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testMinus() {
        int num1 = 0, num2 = 0;
        int expectedResult = num1 - num2;
        int actualResult = calculatorService.minus(num1, num2);
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testMultiply() {
        int num1 = 1, num2 = 0;
        int expectedResult = num1 * num2;
        int actualResult = calculatorService.multiply(num1, num2);
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testDivide() {
        int num1 = 0, num2 = 1;
        double expectedResult = num1 / num2;
        double actualResult = calculatorService.divide(num1, num2);
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testDivideByZero() {
        DivisionByZeroException exception = assertThrows(DivisionByZeroException.class,
                () -> calculatorService.divide(10, 0));
        assertEquals("Деление на ноль недопустимо", exception.getMessage());
    }
}