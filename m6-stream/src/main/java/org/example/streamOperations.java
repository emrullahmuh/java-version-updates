package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class streamOperations {
    public static void main(String[] args) {
List<Integer> list= Arrays.asList(1,2,4,6,8,3,4,5);
list.forEach( System.out::println);


//filter
        System.out.println("filter");
        list.stream()
                .filter(i->i%2==0)
                .forEach(System.out::println);


  //distinct
        System.out.println(" distinct");

      Stream<Integer>STR= list.stream()
                .filter(i->i%2==0)
                .distinct();
      STR.forEach(System.out::println);//STREAM CLOSED HERE

//limit
        System.out.println("limit");
        list.stream()
                .filter(i->i%2==0)
                .limit(1)
                .forEach(System.out::println);
        //skip
        System.out.println("skip");
        list.stream()
                .filter(i->i%2==0)
                .skip(1)
                .forEach(System.out::println);

 //map
        System.out.println("map");
        list.stream()
                .filter(i->i%2==0)
                .map(i->i*2+3)
                .forEach(System.out::println);

        List<String >words=Arrays.asList("java","lambda","manuel");
        words.stream().forEach(p-> System.out.println(p +" ="+p.length()));


    }
}
