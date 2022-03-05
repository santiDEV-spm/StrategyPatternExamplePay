package com.santidev;

public class MasterCard extends Pay{
    @Override
    public void pay(double price) {
        System.out.println("Pay " + price +"$ by MasterCard");
    }
}
