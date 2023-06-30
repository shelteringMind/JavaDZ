package org.example;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.io.*;
import com.google.gson.*;

/*
Задание

1) Дана строка sql-запроса "select * from students where ".
Сформируйте часть WHERE этого запроса, используя StringBuilder или String.
Данные для фильтрации приведены ниже в виде json-строки.
Если значение null, то параметр не должен попадать в запрос.
Параметры для фильтрации: {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}

Дополнительные задания

2) Дана json-строка (можно сохранить в файл и читать из файла)
[{"фамилия":"Иванов","оценка":"5","предмет":"Математика"},{"фамилия":"Петрова","оценка":"4","предмет":"Информатика"},
{"фамилия":"Краснов","оценка":"5","предмет":"Физика"}]
Написать метод(ы), который распарсит json и, используя StringBuilder, создаст строки вида:
Студент [фамилия] получил [оценка] по предмету [предмет].
Пример вывода:
Студент Иванов получил 5 по предмету Математика.
Студент Петрова получил 4 по предмету Информатика.
Студент Краснов получил 5 по предмету Физика.
 */
public class Dz2 {
    static HashMap<String, String> listFilter = new HashMap<>();
    static FileWriter fileJsonWrite;
    static String fileJsonRead = "file.json";

    static {
        try {
            fileJsonWrite = new FileWriter("file.json");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    static Student[] students = new Student[]{new Student("Иванов","5","Математика"),
                                              new Student("Петрова","4","Информатика"),
                                              new Student("Краснов","5","Физика")
                                             };

    public static void fillFields(HashMap<String, String> hm){
        hm.put("name", "Ivanov");
        hm.put("country", "Russia");
        hm.put("city", "Moscow");
        hm.put("age", "null");
    }
    public static StringBuilder whereMethod(String key){
        StringBuilder strQuery = new StringBuilder("select * from students where ");
        strQuery.append(key);
        strQuery.append(" = ");
        String query = listFilter.get(key);
        if(!query.equals("null"))
            strQuery.append(query);
        else
            strQuery.replace(0,strQuery.length(),"Запрос имеет null значение");
        return strQuery;
    }

    public static void addJson(FileWriter file, Student[] stud) throws IOException {
        Gson jsonSpace= new Gson();
        jsonSpace.toJson(stud, file);
        file.close();
    }

    public static void jsonParse(String file) throws IOException {
        Gson gson = new Gson();
        Reader reader = Files.newBufferedReader(Paths.get(file));
        Student[] st = gson.fromJson(reader, Student[].class);
        for(Student student:st) {
            System.out.println(student.toString());
        }
        reader.close();
    }
}
