package com.example.testgui;

import java.util.List;

class Person {
    private String name;
    private List<String> loa;
    private int attribute1;
    private int attribute2;
    private int attribute3;

    public Person(String name, List<String> loa, int attribute1, int attribute2, int attribute3) {
        this.name = name;
        this.loa = loa;
        this.attribute1 = attribute1;
        this.attribute2 = attribute2;
        this.attribute3 = attribute3;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getLoa() {
        return loa;
    }

    public void setLoa(List<String> loa) {
        this.loa = loa;
    }

    public int getAttribute1() {
        return attribute1;
    }

    public void setAttribute1(int attribute1) {
        this.attribute1 = attribute1;
    }

    public int getAttribute2() {
        return attribute2;
    }

    public void setAttribute2(int attribute2) {
        this.attribute2 = attribute2;
    }

    public int getAttribute3() {
        return attribute3;
    }

    public void setAttribute3(int attribute3) {
        this.attribute3 = attribute3;
    }

    @Override
    public String toString() {
        return "Person:" +
                "name = '" + name  + "'," +
                loa.get(0) + " = " + attribute1 + "," +
                loa.get(1) + " = " + attribute2 + "," +
                loa.get(2) + " = " + attribute3;
    }
}
