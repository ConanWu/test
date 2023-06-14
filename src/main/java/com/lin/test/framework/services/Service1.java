package com.lin.test.framework.services;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Service1 {
    @Value("aaaaa1")
    private String a;
    private String b;

    public Service1() {
        setA("adfaf");
        setB("33333");
    }

    public Service1(String a) {
        setA("11111");
        setB("2222");
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
