package com.example.testgui;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Game {
    public static void main(String[] args) {
        List<String> loa = Arrays.asList("age", "speed", "height");
        Person ricky = new Person("Ricky", loa, 8, 6, 6);
        Person jake = new Person("Jake", loa, 7, 7, 7);
        Person ryan = new Person("ryan", loa, 2, 3, 2);
        Person dave = new Person("dave", loa, 3, 3, 4);
        Person george = new Person("George", loa, 2, 8, 10);
        Person dan = new Person("Dan", loa, 2, 8, 10);

        ArrayList<Person> lp = new ArrayList<>();
        lp.add(jake);
        lp.add(ryan);
        lp.add(george);
        lp.add(dave);
        lp.add(dan);
        lp.add(ricky);

        Matcher matcher = new Matcher(25, 25, 50);

        List<Tuple<Person,Person>> compatList = new ArrayList<>();
        matcher.findCompatiblePairs(lp, compatList);
        System.out.println(compatList);
    }
}
