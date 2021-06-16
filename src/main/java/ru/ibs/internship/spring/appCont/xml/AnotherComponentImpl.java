package ru.ibs.internship.spring.appCont.xml;

public class AnotherComponentImpl implements AnotherComponent {

    private SomeComponent someComponent;

    public AnotherComponentImpl(SomeComponent someComponent) {
        this.someComponent = someComponent;
    }

    public void setSomeComponent(SomeComponent someComponent) {
        this.someComponent = someComponent;
    }

    public void init(){
        System.out.println(getClass() + " init");
    }

    private void destroy() {
        System.out.println(getClass() + " destroy");
    }
}
