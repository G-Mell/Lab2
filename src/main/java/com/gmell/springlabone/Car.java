package com.gmell.springlabone;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

//@Component("carBean")
//@Scope("singleton")
public class Car {
    public void drive(){
        System.out.println("wroom");
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
