package org.example;

import org.example.dishTask.Dish;
import org.example.dishTask.Types;
import org.w3c.dom.ls.LSOutput;

import java.lang.reflect.Type;
import java.util.*;
import java.util.stream.Collectors;
import org.example.dishTask.dishData;
public class collectorsDemo {
    public static void main(String[] args) {
    List<Integer> numbers= Arrays.asList(3,4,6,7,6,0,8);

    //toCollection(supplier): is used to create collection using collector

  List<Integer>numberlist= numbers.stream()
           .filter(i -> i%2==0)
           .collect(Collectors.toCollection(ArrayList::new));
        System.out.println(numberlist);
//toSet():RETURN A COLLECTOR INTERFACE THAT GATHERS THE INPUT DATA INTO ANEW SET
        Set<Integer>numbersset=numbers.stream()
                .filter(x->x%2!=0)
                .collect(Collectors.toSet());

        System.out.println(numbersset);

        //toList() :RETURNS A COLLECTORS INTERFACE THAT GATHERS THE INPUT DATA INTO A LIST
  List<Integer> numbersset2= numbers.stream()
           .filter(i->i%3==0)
           .collect(Collectors.toList());

        System.out.println(numbersset2);




  //toMap(Function,function) RETURNS A COLLECTORS INTERFACE THAT GATHERS THE INPUT DATA INTO A MAP


        Map<String ,Integer>nameCal =dishData.getAll().stream().collect(Collectors.toMap(Dish::getName,Dish::getCalories));
//summingInt(ToIntFunction) :returns a collector that produces the sum of an Integer value func
        Integer SUM=dishData.getAll().stream()
                .collect(Collectors.summingInt(Dish::getCalories));
        System.out.println(SUM);
//counting() returns a collector that count the number of the elements

        Long evencount =numbers
                .stream().filter(i->i%2==0)
                .collect(Collectors.counting());

    //averageInt(Tofunction) : returns the average of the integer passed values

        dishData.getAll().stream()
                .collect(Collectors.averagingInt(Dish::getCalories));

        //joining () : is used to join various elements of a charecter or string array into a single object
        List<String>course=Arrays.asList("java","mala","ndsaa");
        course.stream().collect(Collectors.joining(","));
        System.out.println(course);

        //partitioningBy(): is used to partitioning a stream of objects (or a set of elements) based on a given prdicate
 Map<Boolean,List<Dish>>isvageterian=  dishData.getAll().stream()
           .collect(Collectors.partitioningBy(Dish::isVegaterian));
   //groupingBy (); is used for grouping objects by some property and storing results in a map instance


        Map<Types,List<Dish>>dishtype=dishData.getAll().stream()
        .collect(Collectors.groupingBy(Dish::getTypes));


    }

}
