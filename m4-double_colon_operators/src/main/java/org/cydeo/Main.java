package org.cydeo;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {

        calculate findsum = (x, y) -> System.out.println(x + y);

        calculate findsum2 = (x, y) -> calculator.findsum(x, y);

        //Reference to static method
        calculate findsum3 = calculator::findsum;

        findsum3.calculateala(1, 4);

        //reference to an instance method
        calculator obj = new calculator();
        calculate findmul = obj::findMultiply;
        BiFunction<String, Integer, String> func = (str, i) -> str.substring(i);
        BiFunction<String, Integer, String> func2 = String::substring;
//if your method is static you can call directly whith className+method name (String::substring;)
        Function<Integer, Double> dob = new myclass()::method;
        //if your methods is not static first create an object whith class name after call methods (new myclass()::method;)
        BiFunction<myclass, Integer, Double> dob2 = myclass::method;
//                 ******* <- diffrent in bettewen

        Consumer<Integer> display = i -> System.out.println(i);
        Consumer<Integer> display2 = System.out::println;


    }
}