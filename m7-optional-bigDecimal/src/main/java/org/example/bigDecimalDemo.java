package org.example;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class bigDecimalDemo {
    public static void main(String[] args) {
        double amount1=237.56;
        double amount2=237.34;
        System.out.println(amount1-amount2);

        BigDecimal b1=new BigDecimal("237.56");
        BigDecimal b2=new BigDecimal("237.34");
        System.out.println(b1.subtract(b2));



        BigDecimal b3= BigDecimal.valueOf(237.34);
        System.out.println(b1.add(BigDecimal.TEN));
        System.out.println(b1.multiply(new BigDecimal("12.23")));
        System.out.println(b1.multiply(BigDecimal.valueOf(12.23)));

   //Scaling
BigDecimal number1=new BigDecimal("12.34");
        System.out.println(number1.setScale(1, RoundingMode.CEILING));
        System.out.println(number1.setScale(1, RoundingMode.CEILING));
        System.out.println(number1.setScale(1, RoundingMode.DOWN));


        // do not use equals() , use compare to
        System.out.println(new BigDecimal("2").compareTo(new BigDecimal("2")));
        System.out.println(BigDecimal.valueOf(3).compareTo(BigDecimal.valueOf(2)));
        System.out.println(BigDecimal.valueOf(1).compareTo(new BigDecimal("3")));
        System.out.println("tttttttt");

        number1.add(BigDecimal.valueOf(2));
int a=1;
        System.out.println(number1);

        a++;

    }

}
