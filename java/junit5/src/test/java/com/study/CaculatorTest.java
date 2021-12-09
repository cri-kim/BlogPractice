package com.study;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CaculatorTest {
    @Test
    public void calculatorTest(){
        Calculator ca = new Calculator();
        assertEquals("10",ca.calculator("2 + 3 * 4 / 2"));
    }
}
