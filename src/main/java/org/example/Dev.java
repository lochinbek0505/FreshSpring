package org.example;

import org.springframework.stereotype.Component;

@Component
public class Dev {

    private Computer computer;

   private int age;
    public Dev(){

        System.out.println("Dev constructor");

    }


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Computer getComputer() {
        return computer;
    }

    public void setComputer(Computer computer) {
        this.computer = computer;
    }

    public void build(){

        System.out.println("working on Awesome Projects");
        laptop.compile();
    }

}
