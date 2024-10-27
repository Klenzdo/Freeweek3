package SchoolManagement.model;

public abstract class Person{
    private String name;
    private String gender;
    private int age;
    private int id;
    private String role;
    public Person(){

    }

    public Person(String name, String gender, int age, int id, String role) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.id = id;
        this.role=role;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                ", id=" + id +
                ", role='" + role + '\'' +
                '}';
    }
}



