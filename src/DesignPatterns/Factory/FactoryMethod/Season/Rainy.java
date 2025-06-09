package DesignPatterns.Factory.FactoryMethod.Season;

import DesignPatterns.Factory.FactoryMethod.Bird.Bird;
import DesignPatterns.Factory.FactoryMethod.Bird.Sparrow;

public class Rainy implements Season{
    @Override
    public Bird getHappiestBirdOfTheSeason() {
        return new Sparrow();
    }
}
