package org.example;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;
import java.lang.Math;
import java.lang.Short;

public class Dz1 {

    //1. Выбросить случайное целое число в диапазоне от 0 до 2000 и сохранить в i

    public static int randomOut(int maxRandom) {
        Random outNum = new Random();
        return outNum.nextInt(maxRandom);
    }

    //2. Посчитать и сохранить в n номер старшего значащего бита выпавшего числа

    public static int calcMSb(int num){
        double log2num = Math.log(num) / Math.log(2);
        return (int)log2num;
    }

    //3. Найти все кратные n числа в диапазоне от i до Short.MAX_VALUE сохранить в массив m1

    public static LinkedList<Short> sMaxValue(int i, int n){
        int j = 0;
        LinkedList<Short> massiv = new LinkedList<>();
        for(;i<=Short.MAX_VALUE; i++) {
            if(i%n==0) {
                massiv.add((short)i);
            }
        }

        return massiv;
    }

    //4. Найти все некратные n числа в диапазоне от Short.MIN_VALUE до i и сохранить в массив m2

    public static LinkedList<Short> sMinValue(int i, int n){
        int j = 0;
        LinkedList<Short> massiv = new LinkedList<>();
        for(;i>=Short.MIN_VALUE; i--) {
            if(i%n==0) {
                massiv.add((short)i);
            }
        }

        return massiv;
    }
}
