package Factory.FactoryMethod.Season;

import Factory.FactoryMethod.Bird.Bird;
import Factory.FactoryMethod.Bird.Peacock;

public class Spring implements Season{
    @Override
    public Bird getHappiestBirdOfTheSeason() {
        return new Peacock();
    }
}
