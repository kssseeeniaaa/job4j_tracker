package ru.job4j.max;

public class Reduce {
    private int[] array;

    public void to(int[] val) {
        array = val;
    }

    public void print() {
        for (int arrays : array) {
            System.out.println(arrays);
        }
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3};
        Reduce reduce = new Reduce();
        reduce.to(array);
        reduce.print();
    }
}