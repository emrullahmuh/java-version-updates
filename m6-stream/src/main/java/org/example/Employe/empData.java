package org.example.Employe;

import java.util.Arrays;
import java.util.stream.Stream;

public class empData {
    public static Stream<Employe>readAll(){
        return Stream.of(

                new Employe(100,"ahmed","ahmet@gmail.com", Arrays.asList("12312323","23442434")),
        new Employe(101,"maliyamu","aml@gmail.com", Arrays.asList("12312323","23446896786")),
        new Employe(102,"fadima","ma@gmail.com", Arrays.asList("124979323","2474575634"))


        );
    }
}
