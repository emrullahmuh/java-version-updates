package com.cydeo.cydeo;

import java.util.ArrayList;
import java.util.Objects;

public class main {
    public static void main(String[] args) {
        ArrayList<Integer > items=new ArrayList<>();

        items.add(1);
        items.add(2);
        items.add(3);
        items.add(4);
      //  items.add("apple");
        printdoubled(items);
    }

    private static void printdoubled(ArrayList<Integer> items) {

        for (Integer each: items){
            System.out.println( each*2);
        }
    }
}
