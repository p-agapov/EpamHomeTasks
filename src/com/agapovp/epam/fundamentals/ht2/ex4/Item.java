package com.agapovp.epam.fundamentals.ht2.ex4;

import java.util.Comparator;

public abstract class Item extends com.agapovp.epam.fundamentals.ht2.ex3.Item {
    public Item(String name, int cost) {
        super(name, cost);
    }

    public static final Comparator<Item> COMPARE_BY_COST = new Comparator<Item>() {
        public int compare(Item o1, Item o2) {
            return o1.getCost() - o2.getCost();
        }
    };

    public static final Comparator<Item> COMPARE_BY_NAME = new Comparator<Item>() {
        public int compare(Item o1, Item o2) {
            return String.CASE_INSENSITIVE_ORDER.compare(o1.getName(), o2.getName());
        }
    };
    public static final Comparator<Item> COMPARE_BY_COST_AND_NAME = new Comparator<Item>() {
        public int compare(Item o1, Item o2) {
            int costComp = o1.getCost() - o2.getCost();
            if(costComp == 0) return String.CASE_INSENSITIVE_ORDER.compare(o1.getName(), o2.getName());
            else return costComp;
        }
    };
}
