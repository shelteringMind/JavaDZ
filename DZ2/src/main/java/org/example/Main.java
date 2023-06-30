package org.example;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Dz2.fillFields(Dz2.listFilter);
        StringBuilder wm = Dz2.whereMethod("country");
        System.out.println(wm);

        Dz2.addJson(Dz2.fileJsonWrite,Dz2.students);
        Dz2.jsonParse(Dz2.fileJsonRead);
    }
}