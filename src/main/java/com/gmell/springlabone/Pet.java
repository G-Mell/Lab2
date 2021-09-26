package com.gmell.springlabone;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

//@Component("petBean")
public class Pet {
    public Pet(){
        System.out.println("Pet bean has created");
    }
    public void askForFood(){
        System.out.println("meowm");
    }
    @PostConstruct
    public void init() {
        System.out.println("Class Employee: init method");
    }
    @PreDestroy
    public void destroy() {
        System.out.println("Class Employee: destroy method");
    }
}
