package org.review;

public class Conditionals {

    enum MONTH {
        JAN, FEB, MARCH
    }

    public static void main(String[] args) {
        int idx = 2;

        // each if section that has a conditional is executed in
        // order else gets executed last
        // if(conditional statement)
        if (idx == 2) {
            System.out.println("Number is 2");
        } else if (idx == 4) {
            System.out.println("Number is 4");
        } else {
            System.out.println("Unsure what number idx is");
        }

        int month = 2;
        // another way to do if statements.
        // break is needed in each case to exit the switch statement
        switch (month) {
            case 1:
                System.out.println("Month of January");
                break;
            case 2:
                System.out.println("Month of February");
                break;
            case 3:
            case 4:
                System.out.println("Months of Spring");
                break;
            default:
                System.out.println("Unsure what Month it is");

        }


    }


    public static int changeNumber(int number) {
        return number + 1;
    }
}
