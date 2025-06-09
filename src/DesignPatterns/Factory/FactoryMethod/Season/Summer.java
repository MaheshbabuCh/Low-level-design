package DesignPatterns.Factory.FactoryMethod.Season;

import DesignPatterns.Factory.FactoryMethod.Bird.Bird;
import DesignPatterns.Factory.FactoryMethod.Bird.Crow;

public class Summer implements Season{
    @Override
    public Bird getHappiestBirdOfTheSeason() {
        return new Crow();
    }
}
