package DesignPatterns.Builder.BuilderPatternMethodChaining;

public class Builder {

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

    public Student Build(){
        return new Student(this);
    }

    public Builder setName(String name) {
        this.name = name;
        return this;

    }

    public Builder setAge(int age) {
        this.age = age;
        return this;
    }

    public Builder setGender(String gender) {
        this.gender = gender;
        return this;
    }

    public Builder setMajor(String major) {
        this.major = major;
        return this;
    }

    public Builder setCourse(String course) {
        this.course = course;
        return this;
    }

    public Builder setPhone(String phone) {
        this.phone = phone;
        return this;
    }

    public Builder setEmail(String email) {
        this.email = email;
        return this;
    }

    public Builder setAddress(String address) {
        this.address = address;
        return this;
    }

    public Builder setCity(String city) {
        this.city = city;
        return this;
    }

    public Builder setState(String state) {
        this.state = state;
        return this;
    }

    public Builder setCountry(String country) {
        this.country = country;
        return this;
    }

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
}
