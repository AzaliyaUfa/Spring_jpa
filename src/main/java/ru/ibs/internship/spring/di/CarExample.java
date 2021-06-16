package ru.ibs.internship.spring.di;

public class CarExample {

    public static void main(String[] args) {

        Car badCar = new BadCarImpl();

        Car goodCar1 = new GoodCar(new PetrolEngineImpl());

        Car goodCar2 = new GoodCar();
        goodCar2.setEngine(new ElectricEngineImpl());

        new GoodCar(new ElectricEngineImpl());
    }
}
