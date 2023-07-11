package org.example;

// Реализуйте структуру телефонной книги с помощью HashMap.
// Программа также должна учитывать, что во входной структуре будут
// повторяющиеся имена с разными телефонами,
// их необходимо считать, как одного человека с разными телефонами.
//Вывод должен быть отсортирован по убыванию числа телефонов.

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Comparator;
import java.util.Map;
import java.util.stream.Collectors;


public class Main {
    public static void main(String[] args) throws IOException {
        String path = "src/file.txt";
        String val = "Петров";
        Map<String,Long> map = countsOfRec(path);
        sorterValue(val,map);
    }

    public static Map<String,Long> countsOfRec(String path) throws IOException {
        Map<String,Long> map = Files
                .lines(Paths.get(path), StandardCharsets.UTF_8)
                .filter(line -> line.contains(":"))
                .collect(Collectors.groupingBy(s -> s.split(":")[1],
                        Collectors.counting()))
                .entrySet().stream()
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
        return map;
    }

    public static void sorterValue(String val, Map<String,Long> map) throws IOException {
        map
                .entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .forEach(System.out::println);
        System.out.printf("%s имеет в телефонной книге %d записи(-ей).",val,map.get(val));
    }
}