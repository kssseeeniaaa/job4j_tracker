package ru.job4j.tracker;

import java.time.format.DateTimeFormatter;

public class StartUI {
    public static void main(String[] args) {
        Item one = new Item();
        System.out.println(one.getCreated().format(DateTimeFormatter.ofPattern("dd-MMMM-EEEE-"
                + "yyyy HH:mm:ss")));
    }
}
