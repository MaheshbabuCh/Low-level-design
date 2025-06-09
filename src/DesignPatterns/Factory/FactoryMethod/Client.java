package DesignPatterns.Factory.FactoryMethod;


import DesignPatterns.Factory.FactoryMethod.Bird.Bird;
import DesignPatterns.Factory.FactoryMethod.Season.Season;
import DesignPatterns.Factory.FactoryMethod.Season.Winter;

public class Client {

    public static void main(String[] args) {


        /* Now with DesignPatterns.Factory method pattern */

        // String input = "Kiwi";

       Season s = new Winter();

        Bird b = s.getHappiestBirdOfTheSeason();
        b.fly();
        b.eat();
    }
}
