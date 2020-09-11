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
    void subtractNums() {
        assertEquals(Operations.subtractNums("1000","0001"),"7");
        assertEquals(Operations.subtractNums("1100","1111"),"-3");
        assertEquals(Operations.subtractNums("11111","11100"),"3");
    }

    @Test
    void divideNums() {
        assertEquals(Operations.divideNums("1110","0110"),"2");
        assertEquals(Operations.divideNums("11111","100"),"7");
        assertEquals(Operations.divideNums("101010","1110"),"3");
    }

    @Test
    void multiplyNums() {
        assertEquals(Operations.multiplyNums("1010","1010"),"100");
        assertEquals(Operations.multiplyNums("1000","0010"),"16");
        assertEquals(Operations.multiplyNums("1100","1111"),"180");
    }

    @Test
    void sanitize(){
        String expectedAddition = "+";
        assertEquals(Operations.sanitize("0101+0010")[1],expectedAddition);
    }

    @Test
    void evaluate(){
        String[] addition = {"0101","+","0010"};
        String result = "7";
        assertEquals(Operations.evaluate(addition),result);
    }
}