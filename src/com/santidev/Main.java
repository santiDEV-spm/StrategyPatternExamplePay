package com.santidev;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("You need to pay $24 for mobile phone");
        System.out.println("Please select payment method 1:MasterCard, 2:VisaCard, 3:PayPal");

        int payMethodCode = in.nextInt();
        PayManager payManager = null;

        if(payMethodCode == 1){
            payManager = new PayManager(new MasterCard());
        }else if(payMethodCode == 2){
            payManager = new PayManager(new VisaCard());
        }else if(payMethodCode == 3){
            payManager = new PayManager(new PayPal());
        }else {
            System.out.println("Select a valid option");
        }
        payManager.doPay(25);
    }
}
