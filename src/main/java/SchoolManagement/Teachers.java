package SchoolManagement;

public class Teachers extends Person {

    public Teachers(String name, String gender, int age, int id) {
        super(name,gender, age, id, "TEACHER");
    }
    public void teachCourse(Course course){
        System.out.println(this.getName() + " Is teaching " +  course.getCourseName());
    }



    }
