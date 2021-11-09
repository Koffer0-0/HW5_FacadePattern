package com.company;

public abstract class HotDrink {
    void addBoiledWater() {
        System.out.println("Boiled water added!");
    }

    void addSugar() {
        System.out.println("Sugar added!");
    }

    abstract void addSomeIngredient();
}