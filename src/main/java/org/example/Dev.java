package org.example;

import org.springframework.stereotype.Component;

@Component
public class Dev {

    public Dev(){

        System.out.println("Dev constructor");

    }
    public void build(){

        System.out.println("working on Awesome Projects");

    }

}
