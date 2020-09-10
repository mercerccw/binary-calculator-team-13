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

    @Test
    void addNums() {
        assertEquals(Operations.addNums("1000","1000"),"16");
        assertEquals(Operations.addNums("1001","1101"),"22");
        assertEquals(Operations.addNums("10111101","1011100001"),"926");
    }

    @Test
    void multiplyNums() {
        assertEquals(Operations.multiplyNums("1010","1010"),"100");
        assertEquals(Operations.multiplyNums("1000","0010"),"16");
        assertEquals(Operations.multiplyNums("1100","1111"),"180");
    }
}