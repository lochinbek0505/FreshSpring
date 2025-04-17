package org.example;

import org.springframework.stereotype.Component;

@Component
public class Dev {
    private    Laptop laptop;

   private int age;
    public Dev(){

        System.out.println("Dev constructor");

    }

    public Dev(Laptop laptop) {
        this.laptop = laptop;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Laptop getLaptop() {
        return laptop;
    }

    public void setLaptop(Laptop laptop) {
        this.laptop = laptop;
    }

    public void build(){

        System.out.println("working on Awesome Projects");
        laptop.compile();
    }

}
