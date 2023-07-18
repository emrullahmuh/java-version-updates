package org.cydeo.java10;

import java.util.Arrays;
import java.util.List;

public class locaVaribleDemo {
    public static void main(String[] args) {

        String s;
        s = "onar";  // it is work

        //    var b;
        //    b="onar";// it is not work


        String str = "cydeo";
        var str2 = "aloha";
        int number = 12;
        var number2 = 12;

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
        var numbers2 = Arrays.asList(1, 2, 3, 4, 5, 6);




       var d=0;
        for (Integer integer : numbers2) {
            d=d+integer;
        }
        System.out.println(d);

    }
}
