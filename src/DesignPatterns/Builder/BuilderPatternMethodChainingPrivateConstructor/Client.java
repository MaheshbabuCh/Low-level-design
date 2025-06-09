package DesignPatterns.Builder.BuilderPatternMethodChainingPrivateConstructor;

public class Client {

    public static void main(String[] args) {

        Student s = Student.getBuilder()
                .setAge(25)
                .setCountry("India")
                .setName("Kufli2")
                .setPhone("99009900990")
                .Build();

        //Student s2 = new Student(null); // Now throws compile time error


        System.out.println(s.getName());
        System.out.println(s.getAge());
        System.out.println(s.getPhone());
        System.out.println(s.getCountry());
        System.out.println(s.getCity());

       // System.out.println(s2);
    }
}
