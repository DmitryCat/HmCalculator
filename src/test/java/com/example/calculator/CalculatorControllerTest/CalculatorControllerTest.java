package com.example.calculator.CalculatorControllerTest;

import com.example.calculator.CalculatorController.CalculatorController;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class CalculatorControllerTest {

    private CalculatorController calculatorController = new CalculatorController();

    @Test
    public void testDivide() {
        // Проверка деления
        assertEquals("10 / 2 = 5", calculatorController.divide(10, 2));
    }

    @Test
    public void testDivideByZero() {
        // Проверка деления на ноль
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class,
                () -> calculatorController.divide(10, 0));
        assertEquals("Деление на ноль недопустимо", exception.getMessage());
    }
}