package com.agapovp.epam.fundamentals.ht2.ex3;

public class Notepad extends Item {
    private int pageNumber;

    public Notepad(int cost, int pageNumber) {
        super("Notepad", cost);
        this.pageNumber = pageNumber;
    }

    public int getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }
}
