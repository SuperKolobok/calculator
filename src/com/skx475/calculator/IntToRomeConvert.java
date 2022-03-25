package com.skx475.calculator;

public class IntToRomeConvert {

    public String convert(int operand) {

        int units = operand % 10;
        String unitsSting = "";
        System.out.println("Units " + units);

        int tens = (operand / 10) % 10;
        String tensString = "";
        System.out.println("Tens " + tens);

        int hundreds = (operand / 100) % 10;
        String hundredsString = "";
        System.out.println("Hundreds " + hundreds);

        switch (units) {
            case 1:
                unitsSting = "I";
                break;
            case 2:
                unitsSting = "II";
                break;
            case 3:
                unitsSting = "III";
                break;
            case 4:
                unitsSting = "IV";
                break;
            case 5:
                unitsSting = "V";
                break;
            case 6:
                unitsSting = "VI";
                break;
            case 7:
                unitsSting = "VII";
                break;
            case 8:
                unitsSting = "VIII";
                break;
            case 9:
                unitsSting = "IX";
                break;
        }

        switch (tens) {
            case 1:
                tensString = "X";
                break;
            case 2:
                tensString = "XX";
                break;
            case 3:
                tensString = "XXX";
                break;
            case 4:
                tensString = "XL";
                break;
            case 5:
                tensString = "L";
                break;
            case 6:
                tensString = "LX";
                break;
            case 7:
                tensString = "LXX";
                break;
            case 8:
                tensString = "LXXX";
                break;
            case 9:
                tensString = "XC";
                break;
        }

        switch (hundreds) {
            case 1:
                tensString = "C";
                break;
        }

        return hundredsString + tensString + unitsSting;
    }
}
