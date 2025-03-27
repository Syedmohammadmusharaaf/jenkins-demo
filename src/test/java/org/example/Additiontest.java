package org.example;

import org.testng.annotations.Test;

public class Additiontest {

    @Test
    void addTest(){
        int a =5,b=9;
        System.out.println(Addition.add(a, b));
    }

    @Test
    void addTest1(){
        int a =-5,b=9;
        System.out.println(Addition.add(a, b));
    }
}
