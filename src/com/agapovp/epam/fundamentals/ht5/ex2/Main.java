package com.agapovp.epam.fundamentals.ht5.ex2;

public class Main {
    public static void main(String[] args) {
        PropertyClass propertyClass = new PropertyClass(
                "src/com/agapovp/epam/fundamentals/ht5/ex2/resources/file.properties");

        try {
            System.out.println(propertyClass.getProperty("key1"));
            System.out.println(propertyClass.getProperty("key2"));
            System.out.println(propertyClass.getProperty("key3"));
            System.out.println(propertyClass.getProperty("key4"));
        } catch (PropertyNoSuchKeyException e) {
            System.out.println(e.getMessage() + e.getPropertyKey());
        }
    }
}
