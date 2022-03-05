package com.santidev;

public class PayManager {

    private Pay payMethod;

    public PayManager(Pay payMethod){
        this.payMethod = payMethod;
    }

    public void doPay(double price){
        this.payMethod.pay(price);
    }
}
