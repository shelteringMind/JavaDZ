package org.example;

import java.util.ArrayList;

public class QS {

    public static void quickSortBM(ArrayList<ArrayList> arr, Integer parSort, Integer lo, Integer hi) {
        if (lo >= hi) return;
        ArrayList<Integer> part = part(arr, parSort, lo, hi);
        quickSortBM(arr, parSort, lo, part.get(0));
        quickSortBM(arr, parSort, part.get(1), hi);
    }
    public static ArrayList<Integer> part(ArrayList<ArrayList> arr,Integer parSort, int lo, int hi) {
        int i = lo + 1;
        int p = lo;
        int j = hi;
        int g = hi + 1;
        int supEl = (int) arr.get(parSort).get(lo);

        while(true){
            while(i < hi && (int) arr.get(parSort).get(i) < supEl) i++;
            while((int) arr.get(parSort).get(j) > supEl) j--;
            if (i >= j) {
                if(i == j && arr.get(parSort).get(i).equals(supEl)) obmen(arr, i, ++p);
                break;
            }
            obmen(arr, i, j);
            if (arr.get(parSort).get(i).equals(supEl)) obmen(arr, i, ++p);
            if (arr.get(parSort).get(j).equals(supEl)) obmen(arr, j, --g);
            i++;
            j--;
        }
        for (int k = lo; k <= p; k++) obmen(arr, k, j--);
        for (int k = hi; k >= g; k--) obmen(arr, k, i++);
        ArrayList<Integer> outer = new ArrayList<>();
        outer.add(j);
        outer.add(i);
        return outer;
    }

    private static void obmen(ArrayList<ArrayList> arr, int i, int j) {
        for (int k = 0; k < 6; k++) {
            Object temp = arr.get(k).get(i);
            arr.get(k).set(i, arr.get(k).get(j));
            arr.get(k).set(j, temp);
        }
    }
}
