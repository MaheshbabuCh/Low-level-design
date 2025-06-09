package DesignPatterns.PrototypeRegistry;

public class Client {

    public static void main(String[] args) {

      /*  Student s = new Student("Student", 22, "Male");

        IntelligentStudent is =  new IntelligentStudent("Inte Student", 22, "Male", 200);
        IntelligentStudent is2 = new IntelligentStudent(is);

        System.out.println(is);
        System.out.println(is2);

        IntelligentStudent is3 = is2.copy();

        Student s1 = s.copy();
        Student s2 = is3.copy();

        System.out.println(s1 + " " + s2); */

        Student avgStudent = new Student("Jaffa", 22, "Male");
        Student intstu = new IntelligentStudent("Int student", 25, "female", 150);

        StudentRegistry studentRegistry = new StudentRegistry();

        studentRegistry.setStudent("avgStd", avgStudent);
        studentRegistry.setStudent("Intelli Student", intstu);

        Student temp = studentRegistry.getStudent("avgStd").copy();
        Student temp2 = studentRegistry.getStudent("avgStd").copy();
        temp2.setAge(30);
        System.out.println(temp2);

        IntelligentStudent registryIntstu = (IntelligentStudent) studentRegistry.getStudent("Intelli Student").copy();
        registryIntstu.setIq(200);







    }


}
