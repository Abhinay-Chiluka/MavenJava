package com.abhi;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AppTest {

    @Test
    public void testHelloWorld() {
        assertEquals("Hello World!", getMessage());
    }

    private String getMessage() {
        return "Hello World!";
    }
}