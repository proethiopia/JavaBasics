package org.review;

public class Loops {
    public static void main(String[] args) {



        // for (variable initialization; variable limitation; incrementation)
        // Can start at any number and stops at any number defined by you
        // incrementation can happen by 1 or a different value defined by you
        for (int i = 0; i < 10; i++) {


            // This specific for loop will loop through all the number value from 0 to 10
            // increment by 1 at each step of the loop
            System.out.println("The looping index: " + i);
        }
        String[] strArray = {"what", "is", "this", "array"};

        // used to iterate through a data structure without using index values
        // for (datatype of what is in the data structure with its contents: data structure)
        for (String value: strArray) {
            // value is the string inside the strArray not the index/location of the values
            System.out.println("The value inside array: " + value);
        }


        // while(conditional statement)
        // while loop must go from true to false.
        // true conditional will start the loop and a false
        // conditional will exit and stop the loop
        // if the conditional doesn't become false after it was true
        // then the loop will never stop and infinitely run until you stop it
        int idx = 0;
        while (idx <= 10) {
            System.out.println("The conditional idx is: " + idx);
            idx++;
        }


    }
}
