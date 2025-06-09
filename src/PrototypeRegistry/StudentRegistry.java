package PrototypeRegistry;

import java.util.HashMap;
import java.util.Map;

public class StudentRegistry {

    Map<String, Student> studentRegistry = new HashMap<>();

    public void setStudent(String name, Student student){
        studentRegistry.put(name, student);
    }

    public Student getStudent(String name){
        return studentRegistry.get(name);
    }
}
