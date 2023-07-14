package org.example;

import java.util.Arrays;
import java.util.List;

public class charStreamTask {
    public static void main(String[] args) {

        List<String > words= Arrays.asList("java","lambda","manuel");
        words.stream().forEach(p-> System.out.println(p +" ="+p.length()));

 words.stream()
         .map(p->p.length())
         .forEach(System.out::println);
    }
}
