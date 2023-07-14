package org.example;

import java.util.Comparator;

public class myCompraterClaaa implements Comparator <Integer>{



    public int compare(Integer o1, Integer o2) {
        return (o1>o2)?-1:(o1<o2)?1:0;
    }
}
