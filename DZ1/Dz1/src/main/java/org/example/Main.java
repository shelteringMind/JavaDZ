package org.example;

public class Main {
    public static void main(String[] args) {
        int maxInput = 2001;
        int outRan = Dz1.randomOut(maxInput);
        int msb = Dz1.calcMSb(outRan,maxInput);
        System.out.println(outRan);
        System.out.println(msb);
    }
}