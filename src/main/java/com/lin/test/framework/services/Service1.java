package com.lin.test.framework.services;

import org.springframework.stereotype.Component;

@Component
public class Service1 {
    private String a;
    private String b;

    public Service1() {
    }


    public String getB() {
        return b;
    }

    public void setB(String b) {
        this.b = b;
    }

    public String getA() {
        return a;
    }

    public void setA(String a) {
        this.a = a;
    }
}
