package org.example;

public abstract class Bank extends FederalBank {
    abstract int getInterestRate();


    int fedInterstRate() {
        return calculateFedIntestrateRate(2);
    }

    private int calculateFedIntestrateRate(int number) {

        //go to this website find the current interanation interstant rate and divide by 1.5

        return number;
    }

    public String investmentFeature(){
        return "STring";
    }


    public String exampleBank() {
        return "";
    }



}
