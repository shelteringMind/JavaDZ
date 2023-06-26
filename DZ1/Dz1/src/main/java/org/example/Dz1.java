package org.example;
import java.util.Random;
import java.lang.Math;

public class Dz1 {
    //1. Выбросить случайное целое число в диапазоне от 0 до 2000 и сохранить в i
    public static int randomOut(int maxRandom) {
        Random outNum = new Random();
        return outNum.nextInt(maxRandom);
    }

    //2. Посчитать и сохранить в n номер старшего значащего бита выпавшего числа

    public static int calcMSb(int num,int maxInput){
        double log2num = Math.log(maxInput) / Math.log(2);
        int rightShift = (int)log2num;
        return num >> rightShift;
    }
}
