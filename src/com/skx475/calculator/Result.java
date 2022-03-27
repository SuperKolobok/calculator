package com.skx475.calculator;

public class Result {

    int result;

    public Result() {
    }

    public int math(int firstOperand, String operator, int secondOperand) throws Exception{

        if (firstOperand < 1 || secondOperand < 1 || firstOperand > 10 || secondOperand > 10)
            throw new Exception("throws Exception //т.к. используются числа меньше 1 или больше 10");

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
