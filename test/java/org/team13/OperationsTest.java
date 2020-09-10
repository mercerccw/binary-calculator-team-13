package org.team13;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OperationsTest {

    @Test
    void findSqrt() {
        assertEquals(Operations.findSqrt("1100100"), 10.0);
        assertEquals(Operations.findSqrt("11001"), 5.0);
        assertEquals(Operations.findSqrt("10010000"), 12.0);
    }

    @Test
    void convertBinaryOrDecimal() {
        assertEquals(Operations.convertBinaryOrDecimal("1100100", true), Integer.toString(100));
        assertEquals(Operations.convertBinaryOrDecimal("11001", true), Integer.toString(25));
        assertEquals(Operations.convertBinaryOrDecimal("10010000", true), Integer.toString(144));
    }

    @Test
    void findSquare() {
        assertEquals(Operations.findSquare("1010"), "100");
        assertEquals(Operations.findSquare("101"), "25");
        assertEquals(Operations.findSquare("1100"), "144");
    }
}