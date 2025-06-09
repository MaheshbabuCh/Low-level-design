package DesignPatterns.Factory.AbstractFactory.UIExample;

public class LightButton implements Button{
    @Override
    public void render() {
        System.out.println("Light Button rendered");
    }
}
