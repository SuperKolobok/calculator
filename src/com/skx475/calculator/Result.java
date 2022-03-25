package com.skx475.calculator;

public class Result {

    int result;

    public Result() {
    }

    public int math(int firstOperand, String operator, int secondOperand){
        switch (operator){
            case "+": result = firstOperand + secondOperand;
                break;
            case "-": result = firstOperand - secondOperand;
                break;
            case "*": result = firstOperand * secondOperand;
                break;
            case "/": result = firstOperand / secondOperand;
                break;
        }

        return this.result;
    }
}
