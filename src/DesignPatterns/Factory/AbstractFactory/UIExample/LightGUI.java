package DesignPatterns.Factory.AbstractFactory.UIExample;

public class LightGUI implements GUIFactory{
    @Override
    public Button createButton() {
        return new LightButton();
    }

    @Override
    public TextArea createTextArea() {
        return new LightTextArea();
    }
}
