package ru.job4j.oop;

public class Error {
    private boolean active;
    private int status;
    private String message;

    public Error() {
    }

    public Error(boolean active, int status, String message) {
        this.active = active;
        this.status = status;
        this.message = message;
    }

    public void printInfo() {
        System.out.println("active " + active);
        System.out.println("status " + status);
        System.out.println("message " + message);
    }

    public static void main(String[] args) {
        Error err = new Error();
        Error error1 = new Error(false, 9, "Завтрак");
        Error error2 = new Error(true, 13, "Обед");
        Error error3 = new Error(true, 17, "Ужин");
        err.printInfo();
        error1.printInfo();
        error2.printInfo();
        error3.printInfo();


    }
}
