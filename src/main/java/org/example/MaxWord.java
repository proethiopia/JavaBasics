package org.example;

public class MaxWord {
    public static void main(String[] args) {
        for (int x = 1; x < 100; x++) {
            if  (x % 5 == 0 && x % 3 == 0) {
                System.out.println("buzzfizz");
            } else if (x % 5 == 0) {
                System.out.println("buzz");
            } else if (x % 3 == 0) {
                System.out.println("fizz");
            } else {
                System.out.println(x + " this number");
            }
        }
    }

}
