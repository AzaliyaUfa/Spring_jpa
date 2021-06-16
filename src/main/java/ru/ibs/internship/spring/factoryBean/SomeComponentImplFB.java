package ru.ibs.internship.spring.factoryBean;


import org.springframework.stereotype.Component;


public class SomeComponentImplFB implements SomeComponentFB {

    public void init(){
        System.out.println(getClass() + " init");
    }

    private void destroy() {
        System.out.println(getClass() + " destroy");
    }
}
