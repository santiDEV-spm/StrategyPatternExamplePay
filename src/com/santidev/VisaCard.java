package com.santidev;

public class VisaCard extends Pay{
    @Override
    public void pay(double price) {
        System.out.println("Pay " + price +"$ by VisaCard");
    }
}
