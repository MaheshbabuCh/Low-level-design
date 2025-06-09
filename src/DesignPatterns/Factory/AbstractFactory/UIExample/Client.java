package DesignPatterns.Factory.AbstractFactory.UIExample;

public class Client {

    public static void main(String[] args) {

        GUIFactory factory = null;

        String input = "LIGHT";

        if(Theme.DARK.toString().equals(input)){
            factory = new DarkGUI();
        } else if (Theme.LIGHT.toString().equals(input)) {
            factory = new LightGUI();
        }


        Application app = new Application(factory);

        app.render();
    }
}
