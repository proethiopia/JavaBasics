package org.example;

import java.util.ArrayList;
import java.util.List;

public class Wrapper {


    public static void main(String[] args) {


        // wrapper class to primitive is unboxing
        // primitive to wrapper class is autoboxing
        int sum = 0;
        List<Integer> list = new ArrayList<>();

        for (Integer i: list) {
            if (i.intValue() % 2 == 0) {
                sum += i.intValue(); //unboxing
            }
        }

        for (int i = 0; i < 10; i++) {
            list.add(Integer.valueOf(i));  //autoboxing
        }

    }
}
