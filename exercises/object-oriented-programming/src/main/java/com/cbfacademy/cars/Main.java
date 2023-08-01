package com.cbfacademy.cars;

public class Main {
    public static void main(String[] args) {
        Car carOne = new Car("Volvo", "V40", 2012);
        Car carTwo = new Car("Porsche", "Panamera", 2009);
        Car carThree = new Car("Audi", "A3", 2018);

        System.out.println(carOne.getYear());
        System.out.println(carOne.getModel());
        carOne.updateModel("V60");
        System.out.println(carOne.getModel());
    }
}
