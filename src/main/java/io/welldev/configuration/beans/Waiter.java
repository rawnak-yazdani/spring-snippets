package io.welldev.configuration.beans;

public class Waiter implements Employee{

    private int anInt;

    public int getAnInt() {
        return anInt;
    }

    @Override
    public String toString() {
        return "Waiter{" +
                "anInt=" + anInt +
                '}';
    }

    public void setAnInt(int anInt) {
        this.anInt = anInt;
    }

    @Override
    public void doWork() {
        System.out.println("Everyone waits for the waiter and the waiter serves");
    }
}
