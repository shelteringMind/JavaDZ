package org.example;

import java.util.ArrayList;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> intList = new ArrayList<>();
        for(int i = 0; i < 10; i++) intList.add(new Random().nextInt(1,10));
        System.out.printf("Исходный список: %s\n", intList);
        System.out.printf("Минимальное значение: %s\n", Dz3.searchMin(intList));
        System.out.printf("Максимальное значение: %s\n", Dz3.searchMax(intList));
        System.out.printf("Среднее значение: %s\n", Dz3.calcAverVal(intList));
        System.out.printf("Список после удаления из него четных чисел: %s\n", Dz3.delEvenNum(intList));
    }
}