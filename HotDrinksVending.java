package com.company;

public class HotDrinksVending {
    Cocao cocao;
    Coffee coffee;
    Tea tea;

    public HotDrinksVending(Cocao cocao, Coffee coffee, Tea tea) {
        this.cocao = cocao;
        this.coffee = coffee;
        this.tea = tea;
    }

    public void prepareCocao() {
        cocao.addBoiledWater();
        cocao.addSomeIngredient();
        cocao.addSugar();

    }

    public void prepareWithoutSugarCoffee() {
        coffee.addBoiledWater();
        coffee.addSomeIngredient();
    }

    public void prepareTea() {
        cocao.addBoiledWater();
        cocao.addSomeIngredient();
        cocao.addSugar();
    }
}
