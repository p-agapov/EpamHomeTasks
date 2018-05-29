package com.agapovp.epam.fundamentals.ht2.ex3;

import java.util.ArrayList;
import java.util.List;

public class EquipmentForNewbie {
    private static List<Item> listOfItems = new ArrayList<>();

    static {
        listOfItems.add(new Pen(50, Color.BLUE));
        listOfItems.add(new Pencil(20, true));
        listOfItems.add(new Notepad(150, 150));
    }

    private EquipmentForNewbie() {
    }

    public static List<Item> getListOfItems() {
        return listOfItems;
    }
}
