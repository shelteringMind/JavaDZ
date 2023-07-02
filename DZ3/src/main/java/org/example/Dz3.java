package org.example;

import java.util.ArrayList;

//Пусть дан произвольный список целых чисел.
//1) Нужно удалить из него чётные числа
//2) Найти минимальное значение
//3) Найти максимальное значение
//4) Найти среднее значение
public class Dz3 {
    public static ArrayList<Integer> delEvenNum(ArrayList<Integer> arrList){
        arrList.removeIf(integer -> integer % 2 == 0);
        return arrList;
    }
    public static Integer searchMin(ArrayList<Integer> arrList) {
        Integer minValue = arrList.get(0);
        for (Integer itMin : arrList) {
            if (itMin < minValue) minValue = itMin;
        }
        return minValue;
    }

    public static Integer searchMax(ArrayList<Integer> arrList) {
        Integer maxValue = arrList.get(0);
        for (Integer itMax : arrList) {
            if (itMax > maxValue) maxValue = itMax;
        }
        return maxValue;
    }

    public static double calcAverVal(ArrayList<Integer> arrList) {
        Integer averValue = 0;
        int count = 0;
        double outVal;
        for (Integer integer : arrList) {
            averValue += integer;
            count++;
        }
        outVal = (double)averValue/(double)count;
        return outVal;
    }
}
