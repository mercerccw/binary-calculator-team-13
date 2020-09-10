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
    static String findSquare(String number) {
        String convertedNumber = convertBinaryOrDecimal(number, true);
        return Integer.toString(Integer.parseInt(convertedNumber) * Integer.parseInt(convertedNumber));
    }
    static String addNums(String number1, String number2){
        String convertedNumber1 = convertBinaryOrDecimal(number1, true);
        String convertedNumber2 = convertBinaryOrDecimal(number2,true);
        return Integer.toString(Integer.parseInt(convertedNumber1) + Integer.parseInt(convertedNumber2));
    }
    static String subtractNums(String number1, String number2){
        String convertedNumber1 = convertBinaryOrDecimal(number1, true);
        String convertedNumber2 = convertBinaryOrDecimal(number2,true);
        return Integer.toString(Integer.parseInt(convertedNumber1) - Integer.parseInt(convertedNumber2));
    }
    static String divideNums(String number1, String number2){
        String convertedNumber1 = convertBinaryOrDecimal(number1, true);
        String convertedNumber2 = convertBinaryOrDecimal(number2,true);
        return Integer.toString(Integer.parseInt(convertedNumber1) / Integer.parseInt(convertedNumber2));
    }
    static String multiplyNums(String number1, String number2){
        String convertedNumber1 = convertBinaryOrDecimal(number1, true);
        String convertedNumber2 = convertBinaryOrDecimal(number2,true);
        return Integer.toString(Integer.parseInt(convertedNumber1) * Integer.parseInt(convertedNumber2));
    }

}
