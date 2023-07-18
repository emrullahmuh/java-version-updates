package org.cydeo.java11;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class predicateNotDemo {
    public static void main(String[] args) {
        List<Integer>list= Arrays.asList(1,2,3,4,5,7,8,9);

        Predicate<Integer>even=i->i%2==0;
       // Predicate<Integer>odd=i->i%2!=0;
        Predicate<Integer>odd=Predicate.not(even);
        List<Integer>evenNumber=list.stream()
                .filter(even)
                .collect(Collectors.toList());
    }
}
