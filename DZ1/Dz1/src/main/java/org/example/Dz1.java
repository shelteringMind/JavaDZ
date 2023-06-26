package org.example;
import java.util.Random;

public class Dz1 {
    //1. Выбросить случайное целое число в диапазоне от 0 до 2000 и сохранить в i
    public static int randomOut(int maxRandom) {
        Random outNum = new Random();
        int outer = outNum.nextInt(maxRandom);
        System.out.println(outer);
        return outer;
    }
}
