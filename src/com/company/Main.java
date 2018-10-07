package com.company;

public class Main {

    public static void main(String[] args) {
//int[] dividor = (2; 3; 4; 5; 6);

        for (int counter = 2; counter <= 10; counter++) {
            int a = 0;
            for (int i = 2; i <= counter; i++) {

                if (i != counter && counter % i == 0) {
                    a = a + 1;
                }
            }
            if (a > 0) {
                System.out.println(counter + "is a not prime number");
            } else {
                System.out.println(counter + "is a  prime number");
            }

        }
    }
    //

}


