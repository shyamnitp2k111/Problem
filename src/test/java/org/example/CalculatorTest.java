package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculatorTest {

    @Test
    void testAdd() {
        Calculator calculator = new Calculator();

        assertEquals(15, calculator.add(10, 5));
    }

    @Test
    void testSub() {
        Calculator calculator = new Calculator();

        assertEquals(5, calculator.sub(10, 5));
    }
}