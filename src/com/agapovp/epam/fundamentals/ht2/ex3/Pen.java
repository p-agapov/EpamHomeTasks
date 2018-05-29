package com.agapovp.epam.fundamentals.ht2.ex3;

public class Pen extends Item {
    private Color color;

    public Pen(int cost, Color codeOfColor) {
        super("Pen", cost);
        this.color = codeOfColor;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}
