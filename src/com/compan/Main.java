package com.compan;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.println ("Enter numbers:");
        double x= in.nextDouble ();
        double y = in.nextDouble ();
        P p = new P(x,y);


    }
}
   class P {
    public static double x, y;

    public P(double x,double y) {

        double S = 2 * x + 3 / y;
        System.out.println ("Result: " + S);
    }

}