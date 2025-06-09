package DesignPatterns.Factory.PracticalFactory;

public class Kiwi implements Bird{
    @Override
    public void eat() {
        System.out.println("Kiwi is eating");
    }

    @Override
    public void fly() {
        System.out.println("Kiwi is flying");
    }
}
