package DesignPatterns.Factory.AbstractFactory.UIExample;

public class Application {

    Button button;
    TextArea textArea;

    public Application(GUIFactory factory){
        this.button = factory.createButton();
        this.textArea = factory.createTextArea();
    }

    public void render(){
        button.render();
        textArea.render();
    }

}
