package com.agapovp.epam.fundamentals.ht2.ex3;

public class Pencil extends Item {
    private boolean hasEraser;

    public Pencil(int cost, boolean hasEraser) {
        super("Pencil", cost);
        this.hasEraser = hasEraser;
    }

    public boolean isHasEraser() {
        return hasEraser;
    }

    public void setHasEraser(boolean hasEraser) {
        this.hasEraser = hasEraser;
    }
}
