package ru.job4j.oop;

public class DummyDic {

    public String engToRus(String eng) {
        return "Неизвестное слово. " + eng;
    }

    public static void main(String[] args) {
        DummyDic words = new DummyDic();
        String people = "First";
        String rsl = words.engToRus(people);
        System.out.println(rsl);
    }
}
