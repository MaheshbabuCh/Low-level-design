package Factory.PracticalFactory;


public class Client {

    public static void main(String[] args) {

       /*
       This contradicts OCP and SRP cause every a new bird is added we need to modify the class
       and also violates SRP by having multiple reesponsibilities in a single file

       String input = "Kiwi";
        Bird b = null;
        if(input.equals("Sparrow")){
            b = new Sparrow();
        }else if(input.equals("Peacock")){
            b = new Peacock();
        } else if (input.equals("Kiwi")) {
            b = new Kiwi();
        }
        b.eat();
        b.fly(); */

        /* Now with Practical factory */

        // String input = "Kiwi";
        Enum input = BirdType.SPARROW;
        Bird b = BirdFactory.getBird(input);
        b.fly();
        b.eat();
    }
}
