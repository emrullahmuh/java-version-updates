package org.cydeo.java9;

import java.lang.reflect.MalformedParameterizedTypeException;
import java.util.*;

public class FactoryMethodDemo {
    public static void main(String[] args) {
        //creating unmodifiable list before java9
        List<String>courses= Collections.unmodifiableList(Arrays.asList("java","spring","agilea"));
        courses.add("ts");
        System.out.println(courses);

//creating unmodifiable list after java9
List<String>mycourses=List.of("java","spring","agile");

   //creating unmodifiable set after java9
        Set<String>myset=Set.of("milk","mana","zanam");

        //creating unmodifiable map after java 9

        Map<String ,Integer>mycart=Map.ofEntries(
                Map.entry("samsung ",1),
                Map.entry("chair",3),
                Map.entry("psp",2)

        );

    }
}
