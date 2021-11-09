package com.company;

public class Coffee extends HotDrink {
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
        System.out.println("Add espresso");
    }
}
