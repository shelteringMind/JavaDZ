package org.example;

import java.util.Arrays;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        int maxInput = 2001;
        int outRan = Dz1.randomOut(maxInput);
        int msb = Dz1.calcMSb(outRan);
        LinkedList<Short> m1 = new LinkedList<>();
        LinkedList<Short> m2 = new LinkedList<>();
        m1 = Dz1.sMaxValue(outRan,msb);
        m2 = Dz1.sMinValue(outRan,msb);
        System.out.printf("Случайное целое число в диапазоне от 0 до %s: %s\n",maxInput-1,outRan);
        System.out.printf("Старший значащий бит(0..n): %s\n",msb);
        System.out.printf("Массив элементов, кратных %s, в диапазоне от %s до %s:\n %s\n",msb,outRan,Short.MAX_VALUE,m1);
        System.out.printf("Массив элементов, кратных %s, в диапазоне от %s до %s:\n %s\n",msb,outRan,Short.MIN_VALUE,m2);
    }
}