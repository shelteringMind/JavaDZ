package org.example;

public class Student {
    private String surname;
    private String grade;
    private String lesson;

    public Student(String surname, String grade, String lesson) {
            this.surname = surname;
            this.grade = grade;
            this.lesson = lesson;
    }

    public Student(String surname, String lesson) {
        this(surname,null,lesson);
    }
    public String toString() {
        StringBuilder strOut = new StringBuilder("Студент ");
        strOut.append(surname);
        strOut.append(" получил ");
        strOut.append(grade);
        strOut.append(" по предмету ");
        strOut.append(lesson);
        strOut.append(".");
        return  strOut.toString();
    }
}
