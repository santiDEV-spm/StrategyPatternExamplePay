package com.santidev;

public class PayPal extends Pay{
    @Override
    public void pay(double price) {
        System.out.println("Pay " + price +"$ by PayPal");
    }
}
