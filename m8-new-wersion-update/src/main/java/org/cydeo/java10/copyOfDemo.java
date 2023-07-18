package org.cydeo.java10;

import java.util.Arrays;
import java.util.List;

public class copyOfDemo {
    public static void main(String[] args) {
        List<Integer> number1 = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> number2 = List.of(1, 2, 3, 4);
        List<Integer> number3 = List.copyOf(number1);

    }
}
