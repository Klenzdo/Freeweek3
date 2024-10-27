package SchoolManagement.model;

import SchoolManagement.enums.Gender;

public class Applicant {
    private String name;
    private String gender;
    private int age;
    private int phone;
    private String email;
    private boolean isAdmitted;

    public Applicant(String name, Gender gender, int age, int phone, String email) {
        this.name = name;
        this.gender = gender.name();
        this.age = age;
        this.phone = phone;
        this.email = email;
    }

    public Applicant() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public boolean isAdmitted() {
        return isAdmitted;
    }

    public void setAdmitted(boolean admitted) {
        isAdmitted = admitted;
    }
}

