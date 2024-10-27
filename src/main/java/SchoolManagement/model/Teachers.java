package SchoolManagement.model;

public class Teachers extends Person {

    public Teachers(String name, String gender, int age, int id) {
        super(name, gender, age, id, "TEACHER");
    }


    public Teachers() {

    }

    @Override
    public String toString() {
        return "Teachers{" +
                "name='" + super.getName() + '\'' +
                ", gender='" + super.getGender() + '\'' +
                ", age=" + super.getAge()+
                ", id=" + super.getId() +
                ", role='" + super.getRole() + '\'' +
                '}';
    }
}
