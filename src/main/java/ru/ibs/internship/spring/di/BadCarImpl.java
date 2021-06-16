package ru.ibs.internship.spring.di;

public class BadCarImpl implements Car {

    private Engine engine;

    public BadCarImpl() {
        this.engine = new PetrolEngineImpl(); // так делать не стоит, потому что мы намертво привязываем
                                              // объекты класс BadCarImpl конкретно с бензиновому двигателю
    }

    @Override
    public void drive() {

    }

    @Override
    public Engine getEngine() {
        return null;
    }

    @Override
    public void setEngine(Engine engine) {

    }
}
