package com.compan;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.println ("Enter numbers:");
        double x = in.nextDouble ();
        double y = in.nextDouble ();
        P p = P.getP ();
        p.setP (x, y);
        p.displayp ();
        P p1 = P.getP ();
        if (p.hashCode () == p1.hashCode ()) {
            System.out.println ("ok");
        } else {
            System.out.println ("ERROR");
        }
    }

    static class P {
        public static double x, y;
        static P p = new P (x, y);
        private static Object P;

        P(double x, double y) {
            this.x =x;
            this.y =y;
        }

        public static P getP() {
            return p;
        }


        public void setP(double x, double y) {
            this.x = x;
            this.y = y;
        }


        public double getX() {
            return x;
        }


        public double getY() {
            return y;
        }

        public static Object getInstance() {
            return P;
        }

        public void displayp() {
            double S = 2 * x + 3 / y;
            System.out.println ("Result:"+S);
        }
    }
}

