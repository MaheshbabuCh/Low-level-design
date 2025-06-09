package DesignPatterns.Factory.FactoryMethod.Season;

import DesignPatterns.Factory.FactoryMethod.Bird.Bird;
import DesignPatterns.Factory.FactoryMethod.Bird.Peacock;

public class Spring implements Season{
    @Override
    public Bird getHappiestBirdOfTheSeason() {
        return new Peacock();
    }
}
