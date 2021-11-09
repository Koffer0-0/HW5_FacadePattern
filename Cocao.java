package com.company;

public class Cocao extends HotDrink {
    @Override
    void addBoiledWater() {
        super.addBoiledWater();
    }

    @Override
    void addSugar() {
        super.addSugar();
    }

    @Override
    void addSomeIngredient() {
        System.out.println("Cacao powder added!");
    }
}
