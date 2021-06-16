package ru.ibs.internship.spring.di;

public class GoodCar implements Car {

    private Engine engine;

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }


    public GoodCar(Engine engine) {
        this.engine = engine;
    }

    public GoodCar() {}

    @Override
    public void drive() {

    }
}
