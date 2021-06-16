package ru.ibs.internship.spring.appCont.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import javax.annotation.PostConstruct;


@Component
public class AnotherComponentImplAnnot implements AnotherComponentAnnot {

    @Autowired
    private SomeComponentAnnot someComponentAnnot;

    /*public AnotherComponentImplAnnot(SomeComponentAnnot someComponentAnnot) {
        this.someComponentAnnot = someComponentAnnot;
    }

    public void setSomeComponent(SomeComponentAnnot someComponentAnnot) {
        this.someComponentAnnot = someComponentAnnot;
    }*/

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
