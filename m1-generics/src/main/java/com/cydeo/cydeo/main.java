package com.cydeo.cydeo;

import java.util.ArrayList;
import java.util.Objects;

public class main {
    public static void main(String[] args) {
        ArrayList<Integer > items=new ArrayList<>();

        items.add(1);
        items.add(2);
        items.add(3);
        items.add(4);
      //  items.add("apple");
        printdoubled(items);
        System.out.println("8888888888888888888888888");
   footballplayer joe=new footballplayer("joe");
   baseballplayer pat=new baseballplayer("pat");
   soccerplayer dembele=new soccerplayer("dembele");
    team <soccerplayer>intel=new team("intel");
        team<baseballplayer> marano=new team("marano");
    team<footballplayer>bull=new team<>("bull");

    intel.addplayer(dembele);

    }

    private static void printdoubled(ArrayList<Integer> items) {

        for (Integer each: items){
            System.out.println( each*2);
        }







    }
}
