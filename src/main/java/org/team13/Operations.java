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
    static String[] sanitize(String input){
        String[] string = input.split("\\+|-|/|\\*");
        char operand = input.charAt(string[0].length());
        String[] result = new String[3];
        result[0] = string[0];
        result[1] = Character.toString(operand);
        result[2] = string[1];
        return result;
    }
    static String evaluate(String[] parts){
        String LHS = parts[0];
        String RHS = parts[2];
        String result = "";
        switch (parts[1]){
            case("\\+"):
                result = addNums(LHS,RHS);
                break;
            case("\\-"):
                result = subtractNums(LHS,RHS);
                break;
            case("\\*"):
                result = multiplyNums(LHS,RHS);
                break;
            case("\\/"):
                result = divideNums(LHS,RHS);
                break;
        }
        return result;
    }

}
