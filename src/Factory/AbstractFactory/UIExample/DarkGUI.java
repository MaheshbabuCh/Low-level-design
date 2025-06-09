package Factory.AbstractFactory.UIExample;

public class DarkGUI implements GUIFactory{
    @Override
    public Button createButton() {
        return new DarkButton();
    }

    @Override
    public TextArea createTextArea() {
        return new DarkTextArea();
    }
}
