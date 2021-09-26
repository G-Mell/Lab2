package com.gmell.springlabone;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

//@Component("employeeBean")
public class Employee {


    @Value("20")
    private  String age;
    @Autowired
    @Qualifier("petBean")
    public Pet pet;
    @Autowired
    @Qualifier("carBean")
    public Car car;
    public  Employee(){
        System.out.println("Employee bean has created");
    }
    public  Employee(Pet pet, Car car){
        this.car = car;
        this.pet = pet;
        System.out.println("Employee bean has created");
    }

    @PostConstruct
    public void init() {
        System.out.println("Class Employee: init method");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("Class Employee: destroy method");
    }
    public void feedThePet(){
        pet.askForFood();
        System.out.println("na, kushoy");
    }
    public void goToWork(){
        car.drive();
        System.out.print("mchy na zavod");
    }

    public void setPet(Pet pet) {
        this.pet = pet;
        System.out.println("Class Employee: setPet method");



    }

    public void setCar(Car car) {
        this.car = car;
        System.out.println("Class Employee: setCar method");

    }
    public void startMyMorning(){
        feedThePet();
        goToWork();
    }
}

