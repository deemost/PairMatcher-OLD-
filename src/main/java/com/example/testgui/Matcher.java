package com.example.testgui;

import java.util.List;

public class Matcher{

    private int w1 = 25;
    private int w2 = 25;
    private int w3 = 50;

    public Matcher(int w1, int w2, int w3) {
        this.w1 = w1;
        this.w2 = w2;
        this.w3 = w3;
    }

    private double findDistance(Person p1, Person p2){
        return Math.sqrt(
                (w1*(p1.getAttribute1() - p2.getAttribute1()) * w1*(p1.getAttribute1() - p2.getAttribute1()))
                + (w2*(p1.getAttribute2() - p2.getAttribute2()) * w2*(p1.getAttribute2() - p2.getAttribute2()))
                + (w3*(p1.getAttribute3() - p2.getAttribute3()) * w3*(p1.getAttribute3() - p2.getAttribute3())));
    }

    private Tuple<Person, Person> findCompatibleWithFirst(List<Person> lp){
        Person comp = null;
        double min = Double.MAX_VALUE;
        for (int i = 1; i < lp.size(); i++){
            double dist = findDistance(lp.get(0), lp.get(i));
            if (dist <= min){
                min = dist;
                comp = lp.get(i);
            }
        }
        return new Tuple<>(lp.get(0), comp, min);
    }

    public void findCompatiblePairs(List<Person> lp, List<Tuple<Person,Person>> compatList){
        if (lp.size() == 0){
            return;
        }
        else {
            Tuple<Person, Person> pair = findCompatibleWithFirst(lp);
            compatList.add(pair);
            lp.remove(pair.getFirst());
            lp.remove(pair.getSecond());
            findCompatiblePairs(lp, compatList);
        }
    }
}

