package com.cydeo;

import java.io.BufferedReader;

public class Main {
    public static void main(String[] args) {
        System.out.println("how to access a constant");
        Currency c=Currency.PENNY;
        System.out.println(c);
        System.out.println("how to access all constant");
      Currency[] currency=  Currency.values();
        for (Currency each : currency) {
            System.out.println(each);
        }



        calculator(12,23,Operations.CARPI);

        System.out.println("how to retrieve the constant value");
        System.out.println(Currency.ADEM.getValue());
        System.out.println(Currency.PENNY.getValue());
        System.out.println(Currency.PENNY.ordinal());// index number odf constant
    }


public static void calculator(double x,double y,Operations operations){
switch (operations){
    case ATRI:
        System.out.println(x+y);
        break;
    case EKSI:
        System.out.println(x-y);
        break;
    case CARPI:
        System.out.println(x*y);
    break;
        case BOLME:
        System.out.println(x/y);
break;

}
}

}
