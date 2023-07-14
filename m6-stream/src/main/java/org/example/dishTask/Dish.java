package org.example.dishTask;

import java.lang.reflect.Type;

public class Dish {
    private String name;
    private boolean vegaterian;

    private int calories;
    private Types types;

    public Dish(String name, boolean vegaterian, int calories, Types type) {
        this.name = name;
        this.vegaterian = vegaterian;
        this.calories = calories;
        this.types = type;
    }

    public String getName() {
        return name;
    }

    public boolean isVegaterian() {
        return vegaterian;
    }

    public int getCalories() {
        return calories;
    }

    public Types getTypes() {
        return types;
    }

    @Override
    public String toString() {
        return "Dish{" +
                "name='" + name + '\'' +
                ", vegaterian=" + vegaterian +
                ", calories=" + calories +
                ", types=" + types +
                '}';
    }
}
