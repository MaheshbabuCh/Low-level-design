package PrototypeRegistry;

public class IntelligentStudent extends Student {

    private int iq;

    public void setIq(int iq) {
        this.iq = iq;
    }


    public int getIq() {
        return this.iq;
    }


    public IntelligentStudent(String name, int age, String gender, int iq) {
        super(name, age, gender);
        this.iq = iq;
    }

    public IntelligentStudent(IntelligentStudent otherIntelligentStudent) {
        super(otherIntelligentStudent);
        this.iq = otherIntelligentStudent.iq;
    }

    @Override
    public String toString() {
        return "IntelligentStudent{" +
                "iq=" + iq + "," + super.toString() +
                '}';
    }

    @Override
    public IntelligentStudent copy() {
        return new IntelligentStudent(this);
    }
}
