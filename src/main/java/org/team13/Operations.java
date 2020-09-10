package org.team13;

import java.lang.*;

public interface Operations {
    static double findSqrt(String number) {
        String convertedNumber = convertBinaryOrDecimal(number, true);
        return Math.sqrt(Double.parseDouble(convertedNumber));
    }
    static String convertBinaryOrDecimal(String number, Boolean isBinary){
        if(isBinary){
            return Integer.toString(Integer.parseInt(number, 2));
        }
        return Integer.toBinaryString(Integer.parseInt(number));
    }
}
