package org.team13;

import java.lang.*;

public interface Operations {
    static int findSqrt(String number) {
        String convertedNumber = convertBinaryOrDecimal(number, true);
        return (int) Math.sqrt(Integer.parseInt(convertedNumber));
    }
    static String convertBinaryOrDecimal(String number, Boolean isBinary){
        if(isBinary){
            return Integer.toString(Integer.parseInt(number, 2));
        }
        return Integer.toBinaryString(Integer.parseInt(number));
    }
    static String findSquare(String number) {
        String convertedNumber = convertBinaryOrDecimal(number, true);
        return Integer.toString(Integer.parseInt(convertedNumber) * Integer.parseInt(convertedNumber));
    }
}
