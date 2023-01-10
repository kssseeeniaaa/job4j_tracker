package ru.job4j.pojo;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setLastName("Korobeinikov");
        student.setNumberClass("IKT-412");
        student.setDate("1.09.2014");
        System.out.println("Фамилия: " + student.getLastName() + ", группа: " + student.getNumberClass() + ", дата поступления: " + student.getDate());
    }
}
