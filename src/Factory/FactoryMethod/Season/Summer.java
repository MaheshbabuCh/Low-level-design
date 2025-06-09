package Factory.FactoryMethod.Season;

import Factory.FactoryMethod.Bird.Bird;
import Factory.FactoryMethod.Bird.Crow;

public class Summer implements Season{
    @Override
    public Bird getHappiestBirdOfTheSeason() {
        return new Crow();
    }
}
