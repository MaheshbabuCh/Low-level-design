package DesignPatterns.Factory.AbstractFactory.UIExample;

public class LightTextArea implements TextArea {

    @Override
    public void render() {
        System.out.println("Light text area rendered");
    }
}
