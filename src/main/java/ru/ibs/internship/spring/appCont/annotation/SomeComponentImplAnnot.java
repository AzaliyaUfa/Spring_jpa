package ru.ibs.internship.spring.appCont.annotation;


import org.springframework.stereotype.Component;

@Component
public class SomeComponentImplAnnot implements SomeComponentAnnot {

    public void init(){
        System.out.println(getClass() + " init");
    }

    private void destroy() {
        System.out.println(getClass() + " destroy");
    }
}
