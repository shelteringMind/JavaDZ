package org.example;

//Разработать программу, имитирующую поведение коллекции HashSet.
//В программе содать метод add добавляющий элемент,
//метод toString возвращающий строку с элементами множества
//*и метод позволяющий читать элементы по индексу.*Реализовать все методы из семинара.
//Формат данных Integer.

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        PseudoSet<Integer> ps = new PseudoSet<>();
        System.out.println(ps.addEl(5));
        System.out.println(ps.addEl(7));
        System.out.println(ps.toStringCol());
        //System.out.println(ps.removeEl(7));
        Iterator<Integer> iterat = ps.iterator();
        while (iterat.hasNext()){
            System.out.println(iterat.next());
        }
        System.out.println(ps.getByIndex(1));
    }
}