package io.welldev.configuration.beans;

public class Waiter implements Employee{
    @Override
    public void doWork() {
        System.out.println("Everyone waits for the waiter and the waiter serves");
    }
}
