package Factory.FactoryMethod.Season;

import Factory.FactoryMethod.Bird.Bird;
import Factory.FactoryMethod.Bird.Kiwi;

public class Winter implements Season{
    @Override
    public Bird getHappiestBirdOfTheSeason() {
        return new Kiwi();
    }
}
