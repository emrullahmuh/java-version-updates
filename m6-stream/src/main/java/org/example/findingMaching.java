package org.example;

import org.example.dishTask.Dish;
import org.example.dishTask.dishData;
import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.IntStream;

public class findingMaching {
    public static void main(String[] args) {
        //All match ->
boolean ishealty=dishData.getAll().stream().allMatch(dish -> dish.getCalories()<1000);
        System.out.println(ishealty);
        //ANY MATCH
        if (dishData.getAll().stream().anyMatch(dish -> dish.isVegaterian())){
            System.out.println("the menu is vegetarian friendly ");
        }
        //nonmatch
        boolean ishealt2y=dishData.getAll().stream().noneMatch(dish->dish.getCalories()>1000);
        System.out.println(ishealt2y);

        //find any

       Optional<Dish>dish= dishData.getAll().stream().filter(Dish::isVegaterian).findAny();
        System.out.println(dish.get());


  //find first
        Optional<Dish>dish2= dishData.getAll().stream().filter(Dish::isVegaterian).findAny();
        System.out.println(dish.get());


        System.out.println(IntStream.range(0,100).parallel().findAny());
        System.out.println(IntStream.range(0,100).parallel().findFirst());


        List<String> list1= Arrays.asList("ahmet","david","manuel","manromale","asmali","cira","davud");
        List<String> list2= Arrays.asList("ahmet","david","manuel","manromale","asmali","cira","davud");





        Optional<String > findfirst=list1.parallelStream().filter(p->p.startsWith("d")).findFirst();
        Optional<String > findany=list1.parallelStream().filter(p->p.startsWith("a")).findAny();
        System.out.println(findfirst.get());
        System.out.println(findany.get());



        //min
        Optional<Dish>dmin=dishData.getAll().stream().min(Comparator.comparing(Dish::getCalories));
        System.out.println(dmin.get());
    //max
        Optional<Dish>dmax=dishData.getAll().stream().max(Comparator.comparing(Dish::getCalories));
        System.out.println(dmax);

//reduce

   int caltotal=     dishData.getAll().stream()
                .map(Dish::getCalories)
                .reduce((a,b)->a+b).get();
        System.out.println(caltotal);

        Optional<Integer>min=dishData.getAll().stream().map(Dish::getCalories).reduce(Integer::min);
        Optional<Integer>max=dishData.getAll().stream().map(Dish::getCalories).reduce(Integer::max);
        Integer sum=dishData.getAll().stream().map(Dish::getCalories).reduce(Integer::sum).get();
        System.out.println("min "+min);
        System.out.println("max"+ max);
        System.out.println("sum"+sum);


  //count
long count=  dishData.getAll().stream().count();
        System.out.println(count);
    }
    }






