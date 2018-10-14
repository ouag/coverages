package com.ouag.poc.coverages;


import lombok.Data;

@Data
public class PojoSample {

    private String attribute1;
    private String attribute2;


    public void method1(){
        System.out.println("Hello Method1");
    }
}
