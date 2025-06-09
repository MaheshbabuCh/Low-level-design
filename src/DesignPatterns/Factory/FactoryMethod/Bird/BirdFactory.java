package DesignPatterns.Factory.FactoryMethod.Bird;

public class BirdFactory {

    public static Bird getBird(String birdType) {
        return switch (birdType) {
            case "Sparrow" -> new Sparrow();
            case "Kiwi" -> new Kiwi();
            case "Peacock" -> new Peacock();
            case "Crow" -> new Crow();
            default -> null;
        };
    }

    public static Bird getBird(Enum birdType) {
        return switch (birdType) {
            case BirdType.SPARROW -> new Sparrow();
            case BirdType.KIWI -> new Kiwi();
            case BirdType.PEACOCK -> new Peacock();
            case BirdType.CROW -> new Crow();
            default -> null;
        };
    }
}
