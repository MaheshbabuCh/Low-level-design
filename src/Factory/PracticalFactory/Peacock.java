package Factory.PracticalFactory;

public class Peacock implements Bird{
    @Override
    public void eat() {
        System.out.println("Peacock eat");
    }

    @Override
    public void fly() {
        System.out.println("Peacock fly");
    }
}
