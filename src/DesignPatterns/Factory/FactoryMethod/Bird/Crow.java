package DesignPatterns.Factory.FactoryMethod.Bird;

public class Crow implements Bird{
    @Override
    public void eat() {
        System.out.println("Crow eats");
    }

    @Override
    public void fly() {
        System.out.println("Crow fly");
    }


}
