package org.example;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        List<Integer>number= Arrays.asList(2,4,6,8,56);

      // empty() isPresent()
        Optional<String>empty=Optional.empty();
        System.out.println(empty);
        System.out.println(empty.isPresent());

        System.out.println(Optional.of(number).isPresent());

        //ifPresent
Optional<Integer> bignumber=number.stream().filter(x->x>100).findAny();
bignumber.ifPresent(System.out::println);

//get()
        System.out.println(bignumber.get());



  //orElse()
        System.out.println(bignumber.orElse(5));
    }
}