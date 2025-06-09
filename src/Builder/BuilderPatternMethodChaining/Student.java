package Builder.BuilderPatternMethodChaining;

public class Student {

    private String name;
    private int age;
    private String gender;
    private String major;
    private String course;
    private String phone;
    private String email;
    private String address;
    private String city;
    private String state;
    private String country;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String getMajor() {
        return major;
    }

    public String getCourse() {
        return course;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    public String getAddress() {
        return address;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getCountry() {
        return country;
    }

    public static Builder getBuilder(){
        return new Builder();
    }



    public Student(Builder b){

        this.age = b.getAge();
        this.name = b.getName();
        this.country=b.getCountry();
        this.phone = b.getPhone();

    }

}
