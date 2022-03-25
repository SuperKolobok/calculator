package com.skx475.calculator;

public class Numbers {

    int operand;
    
    public int convert(String operand){
        switch (operand){
            case "1": this.operand = 1;
                break;
            case "I": this.operand = 1;
                break;
            case "2": this.operand = 2;
                break;
            case "II": this.operand = 2;
                break;
            case "3": this.operand = 3;
                break;
            case "III": this.operand = 3;
                break;
            case "4": this.operand = 4;
                break;
            case "IV": this.operand = 4;
                break;
            case "5": this.operand = 5;
                break;
            case "V": this.operand = 5;
                break;
            case "6": this.operand = 6;
                break;
            case "VI": this.operand = 6;
                break;
            case "7": this.operand = 7;
                break;
            case "VII": this.operand = 7;
                break;
            case "8": this.operand = 8;
                break;
            case "VIII": this.operand = 8;
                break;
            case "9": this.operand = 9;
                break;
            case "IX": this.operand = 9;
                break;
            case "10": this.operand = 10;
                break;
            case "X": this.operand = 10;
                break;
            default: this.operand = 0;
                break;
        }

        return this.operand;
    }
}
