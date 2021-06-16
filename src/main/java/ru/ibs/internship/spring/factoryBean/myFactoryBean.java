package ru.ibs.internship.spring.factoryBean;

import org.springframework.beans.factory.FactoryBean;

public class myFactoryBean implements FactoryBean<SomeComponentFB> {


    @Override
    public SomeComponentFB getObject() throws Exception {
        return new SomeComponentImplFB();
    }

    @Override
    public Class<?> getObjectType() {
        return SomeComponentImplFB.class;
    }
}
