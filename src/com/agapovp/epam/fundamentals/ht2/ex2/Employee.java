package com.agapovp.epam.fundamentals.ht2.ex2;

import java.util.ArrayList;
import java.util.List;

public class Employee {
    private static int counter = 0;

    private int id;
    private String name;
    private List<Item> listOfItems;

    public Employee(String name) {
        this.id = id = ++counter;
        this.name = name;
        this.listOfItems = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Item> getListOfItems() {
        return listOfItems;
    }
}
