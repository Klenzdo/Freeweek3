package SchoolManagement.model;

public class Student extends Person {
    private boolean isExpelled;
    private boolean isSuspended;

    // create a constructor matching super class
    public Student(String name, String gender, int age, int id) {
        super(name, gender, age, id, "STUDENT");
    }
    public Student (){

    }


    public void setExpelled(boolean expelled) {
        isExpelled = expelled;
    }

    public boolean isSuspended() {
        return isSuspended;
    }

    public void setSuspended(boolean suspended) {
        isSuspended = suspended;
    }

    public boolean isExpelled() {
        return isExpelled;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + super.getName() + '\'' +
                ", gender='" + super.getGender() + '\'' +
                ", age=" + super.getAge()+
                ", id=" + super.getId() +
                ", role='" + super.getRole() + '\'' +
                "isExpelled=" + isExpelled +
                ", isSuspended=" + isSuspended +
                '}';
    }
}

