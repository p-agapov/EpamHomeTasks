package com.agapovp.epam.fundamentals.ht2.ex2;

public class Main {
    public static void main(String[] args) {
        Office office = new Office(666);
        office.getListOfEmployees().add(new Employee("Willie"));
        office.getListOfEmployees().add(new Employee("Peter"));
        office.getListOfEmployees().add(new Employee("Sasha"));

        office.getListOfEmployees().get(0).getListOfItems().add(new Item("Pen", 50));
        office.getListOfEmployees().get(0).getListOfItems().add(new Item("Notepad", 100));
        office.getListOfEmployees().get(0).getListOfItems().add(new Item("Pencil", 20));

        office.getListOfEmployees().get(1).getListOfItems().add(new Item("Notepad", 100));
        office.getListOfEmployees().get(1).getListOfItems().add(new Item("Pencil", 20));

        office.getListOfEmployees().get(2).getListOfItems().add(new Item("Pen", 50));
        office.getListOfEmployees().get(2).getListOfItems().add(new Item("Notepad", 100));

        office.totalCostOfAllItemsOfEmloyee(office
                .getListOfEmployees()
                .get(0));

        office.totalCostOfAllItemsOfEmloyee(office
                .getListOfEmployees()
                .get(1));

        office.totalCostOfAllItemsOfEmloyee(office
                .getListOfEmployees()
                .get(2));
    }
}
