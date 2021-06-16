package ru.ibs.internship.spring.appCont.javaConfig;

public class SomeComponentImplConfig implements SomeComponentConfig {

    public void init(){
        System.out.println(getClass() + " init");
    }

    private void destroy() {
        System.out.println(getClass() + " destroy");
    }
}
