package org.cydeo;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

public class carTest {
    public static void main(String[] args) {
        //zero argument constructure

        Supplier<Car>c1=()->new Car();
        System.out.println(c1.get().getMake());

        Supplier<Car>c2=Car::new;
        System.out.println(c1.get().getMake());
//one argument constructure
        Function<String,Car>f1=model->new Car(model);
        Function<String,Car>f2=Car::new;
// constructure call with new cay word


        // two arg constructur
        BiFunction<String ,String,Car>d1=(model,make)->new Car(model,make);
        BiFunction<String ,String,Car>d2=Car::new;


      Car honda=  d2.apply("nissan ","prado");
        System.out.println(honda.getMake()+" "+honda.getModel());

    }
}
