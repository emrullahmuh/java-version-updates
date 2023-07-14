package org.example;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import static java.util.Comparator.comparing;

public class appleTest {
    public static void main(String[] args) {
        List<apple> inventory=new ArrayList<>();
        inventory.add(new apple(230,color.RED));
        inventory.add(new apple(120,color.RED));
        inventory.add(new apple(250,color.RED));
        inventory.add(new apple(340,color.GREEN));
        inventory.add(new apple(160,color.GREEN));

        Comparator<apple>sortApple= comparing((apple apple) ->apple.getWeight() );
       inventory.sort(sortApple);
        System.out.println(inventory);

        Comparator<apple>sortApple2=Comparator.comparing((apple apple)->apple.getWeight());

        inventory.sort(Comparator.comparing((apple apple)->apple.getWeight())
);
        System.out.println(inventory);



        Comparator<apple>sortApple3=comparing(apple::getWeight);
        inventory.sort(comparing(apple::getWeight).reversed());
        System.out.println(inventory);

        Comparator<apple>sortApple_reverse=comparing(apple::getWeight);
        inventory.sort(comparing(apple::getWeight).reversed());
        System.out.println(inventory);

        Comparator<apple>sortApple_reverse_chain=comparing(apple::getWeight);
        inventory.sort(comparing(apple::getWeight).reversed().thenComparing(apple::getColor));
        System.out.println(inventory);
    }
}
