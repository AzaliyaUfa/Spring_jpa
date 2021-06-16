package ru.ibs.internship.spring.appCont.javaConfig;

import javax.annotation.PostConstruct;

public class AnotherComponentImplConfig implements AnotherComponentConfig {

    private SomeComponentConfig someComponentConfig;

    public AnotherComponentImplConfig(SomeComponentConfig someComponentConfig) {
        this.someComponentConfig = someComponentConfig;
    }

    public void setSomeComponent(SomeComponentConfig someComponentConfig) {
        this.someComponentConfig = someComponentConfig;
    }

    @PostConstruct
    private void postConstruct(){
        System.out.println(getClass() + " postConstruct");
    }

    public void init(){
        System.out.println(getClass() + " init");
    }

    private void destroy() {
        System.out.println(getClass() + " destroy");
    }
}
