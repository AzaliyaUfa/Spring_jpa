package ru.ibs.internship.spring.appCont.xml;

public class SomeComponentImpl implements SomeComponent {



    public void init(){
        System.out.println(getClass() + " init");
    }

    private void destroy() {
        System.out.println(getClass() + " destroy");
    }
}
