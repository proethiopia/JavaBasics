package org.example;

import org.example.Bank;

public class BOA extends Bank {
    @Override
    int getInterestRate() {
        return 0;
    }

    public String investmentFeature(){
        return "STring";
    }
}
