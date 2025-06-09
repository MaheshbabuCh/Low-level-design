package Factory.FactoryMethod.Season;

import Factory.FactoryMethod.Bird.Bird;
import Factory.FactoryMethod.Bird.Sparrow;

public class Rainy implements Season{
    @Override
    public Bird getHappiestBirdOfTheSeason() {
        return new Sparrow();
    }
}
