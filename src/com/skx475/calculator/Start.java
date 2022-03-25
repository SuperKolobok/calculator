package com.skx475.calculator;

import java.util.Scanner;

public class Start {
    public static void main(String[] args) throws Exception {
        System.out.print("Enter a string - First Operand + Second Operand: ");
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();

        String[] split = inputString.split(" ");
        if (split.length == 1)
            throw new Exception("throws Exception //т.к. строка не является математической операцией");
        if (split.length != 3)
            throw new Exception("throws Exception //т.к. формат математической операции не удовлетворяет заданию - два операнда и один оператор (+, -, /, *)");

        Result result = new Result();

        CheckNumbers checkNumbers = new CheckNumbers();

        boolean firstOperand = checkNumbers.isIntOrString(split[0]);
        boolean secondOperand = checkNumbers.isIntOrString(split[2]);

        if (firstOperand != secondOperand)
            throw new Exception("throws Exception //т.к. используются одновременно разные системы счисления");
        // both operands are int
        else if (firstOperand && secondOperand == true)
            System.out.println("Result = " + result.math(Integer.parseInt(split[0]), split[1], Integer.parseInt(split[2])));
        // both operands are rome
        else if (!firstOperand && secondOperand == false) {
            RomeToIntConvert romeToIntConvert = new RomeToIntConvert();
            int romeResult = result.math(romeToIntConvert.convert(split[0]), split[1], romeToIntConvert.convert(split[2]));
            if (romeResult < 0)
                throw new Exception("throws Exception //т.к. в римской системе нет отрицательных чисел");
            IntToRomeConvert intToRomeConvert = new IntToRomeConvert();
            System.out.println("Result = " + intToRomeConvert.convert(romeResult));
        }
    }
}
