package org.example;

import java.util.*;

public class TelSpr{
    static Scanner scanner;
    public static void main(String[] args){
        scanner = new Scanner(System.in);
        ArrayList<String> surname = new ArrayList<>();
        ArrayList<String> name = new ArrayList<>();
        ArrayList<String> patronymic = new ArrayList<>();
        ArrayList<Integer> age = new ArrayList<>();
        ArrayList<Boolean> pol = new ArrayList<>();
        ArrayList<Integer> id = new ArrayList<>();
        ArrayList<ArrayList> baseList = new ArrayList<>();
        while (scanner.hasNextLine()) {
            System.out.println("Введите фамилию -> ");
            surname.add(scanner.nextLine());
            System.out.println("Введите имя -> ");
            name.add(scanner.nextLine());
            System.out.println("Введите отчество -> ");
            patronymic.add(scanner.nextLine());
            System.out.println("Введите возраст -> ");
            age.add(Integer.valueOf(scanner.nextLine()));
            System.out.println("Введите пол -> ");
            pol.add(scanner.nextLine().toLowerCase().contains("ж"));
            id.add(pol.size() - 1);
            System.out.println("Продолжить ввод да/нет? -> ");
            String tmp = scanner.nextLine();
            if(tmp.toLowerCase().contains("нет")) break;
        }
        baseList.add(id);         // 0
        baseList.add(surname);    // 1
        baseList.add(name);       // 2
        baseList.add(patronymic); // 3
        baseList.add(age);        // 4
        baseList.add(pol);        // 5

        for (int i = 0; i < id.size(); i++) {
            System.out.println(baseList.get(1).get(i)+ " "+ baseList.get(2).get(i).toString().toUpperCase().charAt(0)+"."
                               + baseList.get(3).get(i).toString().toUpperCase().charAt(0)+"."+" "+baseList.get(4).get(i)
                               +" "+ (baseList.get(5).get(i).equals(true)?"Ж":"М"));
        }

/*
        System.out.println("Сортировать по возрасту да/нет? -> ");
        String tmp = scanner.nextLine();
        if (tmp.toLowerCase().contains("да")){
            id.sort(Comparator.comparingInt(age::get));
            for (Integer integer : id) {
                System.out.println(surname.get(integer) + " " + name.get(integer).toUpperCase().charAt(0) + "."
                                   + patronymic.get(integer).toUpperCase().charAt(0) + "." + " " + age.get(integer)
                                   + " " + (pol.get(integer) ? "Ж" : "М"));
            }
        }
*/
        System.out.println("Сортировать по возрасту и полу да/нет? -> ");
        String tmp = scanner.nextLine();
        if (tmp.toLowerCase().contains("да")) {
            QS.quickSortBM(baseList, 4,0,id.size()-1);
            for (int i = 0; i < id.size(); i++) {
                if (baseList.get(5).get(i).equals(true)) {
                    System.out.println(baseList.get(1).get(i) + " " + baseList.get(2).get(i).toString().toUpperCase().charAt(0) + "."
                            + baseList.get(3).get(i).toString().toUpperCase().charAt(0) + "." + " " + baseList.get(4).get(i)
                            + " " + (baseList.get(5).get(i).equals(true) ? "Ж" : "М"));
                }
            }
            for (int i = 0; i < id.size(); i++) {
                if (baseList.get(5).get(i).equals(false)){
                    System.out.println(baseList.get(1).get(i) + " " + baseList.get(2).get(i).toString().toUpperCase().charAt(0) + "."
                            + baseList.get(3).get(i).toString().toUpperCase().charAt(0) + "." + " " + baseList.get(4).get(i)
                            + " " + (baseList.get(5).get(i).equals(true) ? "Ж" : "М"));
                }
            }
        }
    }
}