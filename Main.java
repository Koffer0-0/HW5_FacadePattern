package com.company;

public class Main {

    private static Object Cocao;

    public static void main(String[] args) {

        Cocao cocao = new Cocao();
        Coffee coffee = new Coffee();
        Tea tea = new Tea();

        HotDrinksVending machine = new HotDrinksVending(cocao, coffee, tea);

        System.out.println("Preparing coffee without sugar");
        machine.prepareWithoutSugarCoffee();
        System.out.println("---------------");

        System.out.println("Preparing cocao");
        machine.prepareCocao();
        System.out.println("---------------");


        System.out.println("Preparing tea");
        machine.prepareTea();
        System.out.println("---------------");

        System.out.println("-DONE!-");

    }
}
