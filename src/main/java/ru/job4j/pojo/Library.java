package ru.job4j.pojo;

import java.util.Objects;

public class Library {
    public static void main(String[] args) {
        Book first = new Book("First book", 100);
        Book second = new Book("Clean code", 200);
        Book third = new Book("Clean code", 300);
        Book fourth = new Book("Fourth book", 400);
        Book[] lib = new Book[4];
        lib[0] = first;
        lib[1] = second;
        lib[2] = third;
        lib[3] = fourth;
        for (Book rsl : lib) {
            System.out.println(rsl.getName() + " - " + rsl.getPage() + " page");
        }
        System.out.println();
        for (int index = 0; index < lib.length; index++) {
            if (index == 0) {
                Book rsl = lib[0];
                lib[0] = lib[3];
                lib[3] = rsl;
            }
            Book rsl = lib[index];
            System.out.println(rsl.getName() + " - " + rsl.getPage() + " page");
        }
        System.out.println();
        for (Book rsl : lib) {
            if (Objects.equals(rsl.getName(), "Clean code")) {
                System.out.println(rsl.getName() + " - " + rsl.getPage() + " page");
            }
        }
    }
}