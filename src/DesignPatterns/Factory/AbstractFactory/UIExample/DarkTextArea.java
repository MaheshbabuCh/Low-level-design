package DesignPatterns.Factory.AbstractFactory.UIExample;

public class DarkTextArea implements TextArea{
    @Override
    public void render() {
        System.out.println("Rendering Dark Text area");
    }
}
