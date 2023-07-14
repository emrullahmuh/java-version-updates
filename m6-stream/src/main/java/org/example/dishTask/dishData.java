package org.example.dishTask;

import java.util.Arrays;
import java.util.List;

public class dishData {
    public static List<Dish>getAll(){
        return   Arrays.asList(
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
        );
    }
}
