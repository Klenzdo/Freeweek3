package SchoolManagement;

public class Student extends Person{
    private boolean isExpelled;
    private boolean isSuspended;
// create a constructor matching super class
    public Student(String name, String gender, int age, int id) {
        super(name, gender, age, id,"STUDENT");
    }

    public void takeCourse(Course course){
        System.out.println(" Student by name:  " + this.getName() + " is taking course " + course.getCourseName());

    }

    public boolean isExpelled() {
        return isExpelled;
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



    }

