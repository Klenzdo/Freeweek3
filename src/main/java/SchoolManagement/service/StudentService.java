package SchoolManagement.service;

import SchoolManagement.model.Course;
import SchoolManagement.model.Student;

import java.io.IOException;
import java.util.List;

public interface StudentService {
    String takeCourse(Course course, Student student);
    boolean isExpelled(Student student);
    boolean isSuspended (Student student);


    List<Student> getDetailsFromCsv() throws IOException;
}
