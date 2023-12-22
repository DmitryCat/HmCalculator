package com.example.calculator.CalculatorSeviseImplTest;

import com.example.calculator.service.impl.CalculatorServiceImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class CalculatorServiceImplParameterizedTest {
    private final CalculatorServiceImpl calculatorService = new CalculatorServiceImpl();

    private static Stream<Arguments> provideNumbersForCalculator() {
        return Stream.of(
                Arguments.of(10, 12),
                Arguments.of(1, 14),
                Arguments.of(0, -12),
                Arguments.of(1, 1111),
                Arguments.of(-2, -2)
        );
    }

    @ParameterizedTest
    @MethodSource("provideNumbersForCalculator")
    public void testPlus(int num1, int num2) {
        int expectedResult = num1 + num2;
        int actualResult = calculatorService.plus(num1, num2);
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @ParameterizedTest
    @MethodSource("provideNumbersForCalculator")
    public void testMinus(int num1, int num2) {
        int expectedResult = num1 - num2;
        int actualResult = calculatorService.plus(num1, num2);
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @ParameterizedTest
    @MethodSource("provideNumbersForCalculator")
    public void testMultiply(int num1, int num2) {
        int expectedResult = num1 * num2;
        int actualResult = calculatorService.plus(num1, num2);
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @ParameterizedTest
    @MethodSource("provideNumbersForCalculator")
    public void testDivide(int num1, int num2) {
        int expectedResult = num1 / num2;
        int actualResult = calculatorService.plus(num1, num2);
        Assertions.assertEquals(expectedResult, actualResult);
    }
}
