package DesignPatterns.Factory.FactoryMethod.Season;

import DesignPatterns.Factory.FactoryMethod.Bird.Bird;
import DesignPatterns.Factory.FactoryMethod.Bird.Kiwi;

public class Winter implements Season{
    @Override
    public Bird getHappiestBirdOfTheSeason() {
        return new Kiwi();
    }
}
