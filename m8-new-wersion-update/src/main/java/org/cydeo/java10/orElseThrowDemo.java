package org.cydeo.java10;

import java.util.Optional;

public class orElseThrowDemo {
    public static void main(String[] args) {
        Optional<String>str=Optional.empty();
        System.out.println(str.get());


   if (str.isPresent()){
       System.out.println(str.get());
   }else {
        System.out.println(str.orElseThrow(()->new RuntimeException()));
   }
        System.out.println(str.orElseThrow());


       //
    }
}
