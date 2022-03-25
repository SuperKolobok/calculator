package com.skx475.calculator;

public class CheckNumbers {

    boolean isIntOrString(String split) {
        try {
            int operand = Integer.parseInt(split);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
