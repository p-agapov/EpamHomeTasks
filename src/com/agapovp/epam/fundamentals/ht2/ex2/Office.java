package com.agapovp.epam.fundamentals.ht2.ex2;

import java.util.ArrayList;
import java.util.List;

public class Office {

    private int officeNumber;
    private List<Employee> listOfEmployees;

    public Office(int officeNumber) {
        this.officeNumber = officeNumber;
        this.listOfEmployees = new ArrayList<>();
    }

    public int getOfficeNumber() {
        return officeNumber;
    }

    public void setOfficeNumber(int officeNumber) {
        this.officeNumber = officeNumber;
    }

    public List<Employee> getListOfEmployees() {
        return listOfEmployees;
    }

    public void totalCostOfAllItemsOfEmloyee(Employee employee) {
        int sum = 0;
        for (Item item: employee.getListOfItems()) {
            sum += item.getCost();
        }

        System.out.println(String.format("Total cost of %s's(id:%d) items: %d",
                employee.getName(), employee.getId(), sum));
    }
}
