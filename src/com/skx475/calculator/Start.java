package com.skx475.calculator;

import java.util.Scanner;

public class Start {
    public static void main(String[] args) {
        System.out.println("Enter a string - First Operand + Second Operand: ");
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();

        String[] split = inputString.split(" ");

        int firstOperand;
        int secondOperand;
        int result;

        Numbers numbers = new Numbers();

        firstOperand = numbers.convert(split[0]);
        secondOperand = numbers.convert(split[2]);

        result = firstOperand + secondOperand;

        System.out.println("Result: " + result);


    }
}
