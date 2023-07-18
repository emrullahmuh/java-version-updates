package org.cydeo.java12;

import java.util.*;
import java.util.stream.Collectors;

public class TeeingDemo {
    public static void main(String[] args) {
        List<Employe> employeList= Arrays.asList(
                new Employe(1,"a",100),
                new Employe(2,"B",200),
                new Employe(3,"C",300),
                new Employe(4,"D",400)
        );




  HashMap<String,Employe>result= employeList.stream().collect(Collectors.teeing(
         Collectors.maxBy(Comparator.comparing(Employe::getSalary)),
           Collectors.minBy(Comparator.comparing(Employe::getSalary)),
           (e1,e2)->{
               HashMap<String ,Employe>map=new HashMap<>();;
         map.put("max",e1.get());
         map.put("min",e2.get());
         return map;
           }
   ));

        System.out.println(result);
    }
}
