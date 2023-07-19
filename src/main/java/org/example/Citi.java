package org.example;

import org.example.Bank;

import java.util.Objects;

public class Citi extends Bank {




    int val = 1;
    String representation = "";
    @Override
    int getInterestRate() {
        return 7;
    }

   @Override
    public String investmentFeature(){
        return "City Strubg";
    }


    public int exampleCiti() {
        val = val +1;
        return val;
    }

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Citi citi = (Citi) o;
        return val == citi.val && representation.equals(citi.representation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(val);
    }

    @Override
public String toString() {
    return "Citi{" +
            "val=" + val +
            '}';
}
}
