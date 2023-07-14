package org.example;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer>list= Arrays.asList(2,1,43,1,2,7,5,6,5);
        System.out.println(list);

       //ascending
        Collections.sort(list);
        System.out.println(list);

    //discending

    Collections.sort(list,new myCompraterClaaa());
        System.out.println(list);


    Collections.sort(list,new myCompraterClaaa()::compare);
        System.out.println(list);

  //ascending
        list.sort(((o1, o2) -> o1.compareTo(o2)));

    }


}