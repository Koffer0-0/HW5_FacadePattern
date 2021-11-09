package com.company;

public class Tea extends HotDrink {
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
        System.out.println("Add tea pocket");
    }
}
