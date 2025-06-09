package DesignPatterns.Factory.FactoryMethod.Bird;

public class Sparrow implements Bird {


    @Override
    public void eat() {
        System.out.println("Sparrow eat");
    }

    @Override
    public void fly() {
        System.out.println("Sparrow fly");
    }

}
