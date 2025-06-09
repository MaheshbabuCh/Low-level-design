package Factory.FactoryMethod;


import Factory.FactoryMethod.Bird.Bird;
import Factory.FactoryMethod.Bird.Crow;
import Factory.FactoryMethod.Bird.Kiwi;
import Factory.FactoryMethod.Season.Season;
import Factory.FactoryMethod.Season.Summer;
import Factory.FactoryMethod.Season.Winter;

public class Client {

    public static void main(String[] args) {


        /* Now with Factory method pattern */

        // String input = "Kiwi";

       Season s = new Winter();

        Bird b = s.getHappiestBirdOfTheSeason();
        b.fly();
        b.eat();
    }
}
