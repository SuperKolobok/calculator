package com.skx475.calculator;

public class RomeToIntConvert {

    int operand;

    public int convert(String operand) throws Exception {
        switch (operand) {
            case "I":
                return 1;
            case "II":
                return 2;
            case "III":
                return 3;
            case "IV":
                return 4;
            case "V":
                return 5;
            case "VI":
                return 6;
            case "VII":
                return 7;
            case "VIII":
                return 8;
            case "IX":
                return 9;
            case "X":
                return 10;
            default: throw new Exception("throws Exception //т.к. используются римские числа больше 10 или неправильные римские чсила");
        }
    }
}
