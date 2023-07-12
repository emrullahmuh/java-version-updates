package com.cydeo.tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class sawapValue2 { public static void main(String[] args) {
    Integer[] a={1,2,3,4,5};

    System.out.println( swap(a,2,3));
}

    private static String swap(Integer[] arr, int a, int b) {
        List<Integer> swapa=new ArrayList<>();
        for (int i = 0; i<arr.length ; i++) {
            swapa.add(arr[i]);

        }
        Collections.swap(swapa,a,b);
        for (int i=0;i<swapa.size();i++){
            arr[i]=swapa.get(i);
        }
        return Arrays.toString(arr);  }

}
