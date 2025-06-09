package DesignPatterns.Builder.BuilderPatternGeneric;

public class Client {

    public static void main(String[] args) throws Exception {

        Builder b = new Builder();
        b.setAge(20);
        b.setName("Kufli");
        b.setCountry("India");
        b.setPhone("9000096000");

        Student s;

        if(b.validate()) {
            s = new Student(b);
        }else {
            throw new Exception("Object cannot be created");
        }

        System.out.println(s.getName());
        System.out.println(s.getAge());
        System.out.println(s.getCountry());
        System.out.println(s.getPhone());
        System.out.println(s.getAddress());

    }
}
