package SchoolManagement.model;

public class Course {

    private String courseName;
    private String courseCode;
    private int courseId;
    public Course (){

    }


    public Course(String courseName, String courseCode, int courseId){
        this.courseName=courseName;
        this.courseCode=courseCode;
        this.courseId=courseId;


    }


    public void setCourseName(String courseName) {
        this.courseName = courseName;

    }

    public String getCourseName() {
        return courseName;

    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }
}
