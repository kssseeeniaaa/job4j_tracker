package ru.job4j.inheritance;

public class PizzaExtraCheese extends Pizza {
    private static final String topping = " extra cheese";

    @Override
    public String name() {
        return super.name() + topping;
    }
}
