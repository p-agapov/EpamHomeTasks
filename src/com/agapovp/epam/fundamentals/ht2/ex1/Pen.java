package com.agapovp.epam.fundamentals.ht2.ex1;

import java.util.Objects;

public class Pen {
    private String manufacturer;
    private Color color;
    private int costInRubbles;

    {
        manufacturer = "Unknown";
        color = Color.BLUE;
        costInRubbles = 0;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getCostInRubbles() {
        return costInRubbles;
    }

    public void setCostInRubbles(int costInRubbles) {
        this.costInRubbles = costInRubbles;
    }

    @Override
    public String toString() {
        return String.format("Manufacturer: %s; Color: %s; Cost: %d rubbles."
                , manufacturer, color, costInRubbles);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Pen)) return false;
        Pen pen = (Pen) o;
        return costInRubbles == pen.costInRubbles &&
                Objects.equals(manufacturer, pen.manufacturer) &&
                color == pen.color;
    }

    @Override
    public int hashCode() {

        return Objects.hash(manufacturer, color, costInRubbles);
    }

    public static void main(String[] args) {
        Pen pen = new Pen();
        System.out.println(pen);

    }
}
