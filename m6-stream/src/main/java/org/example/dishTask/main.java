package org.example.dishTask;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import static java.util.Comparator.comparing;

public class main {
    public static void main(String[] args) {
      /*  List<Dish> menu= Arrays.asList(
                new Dish("pork",false,800,Types.MEAT),
                new Dish("pork",false,800,Types.MEAT),
                new Dish("beef",false,700,Types.MEAT),
                new Dish("chicken",false,400,Types.MEAT),
                new Dish("fries",true,530,Types.OTHER),
                new Dish("rice",true,350,Types.OTHER),
                new Dish("fruit",true,120,Types.OTHER),
                new Dish("pizza",true,550,Types.OTHER),
                new Dish("prawns",false,300,Types.FISH),
                new Dish("salmon",false,450,Types.FISH)
        );*/

//print all dishes name that has less tan 400 calories
        System.out.println("less 400");
        dishData.getAll().stream()
                .filter(p->p.getCalories()<400)
                .forEach(System.out::println);
  //print the length of the name of each dish
        System.out.println("all name");
        dishData.getAll().stream()
        .map(p->p.getName())
        .forEach(System.out::println);
        //print three hight caloric dish name

        System.out.println("hight");
        dishData.getAll().stream()
                .filter(p->p.getCalories()>300)
                .map(Dish::getName)
                .limit(3)
        .forEach(System.out::println);
  //print all dish name below 400 cal in sort
        System.out.println("less 400 sort");
        dishData.getAll().stream()
                .filter(p->p.getCalories()<400)
                .sorted(Comparator.comparing(Dish::getCalories))
                .map(Dish::getName)

                .forEach(System.out::println);


    }
    }

