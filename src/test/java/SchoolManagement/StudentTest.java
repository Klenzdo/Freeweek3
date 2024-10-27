package SchoolManagement;

import SchoolManagement.model.Course;
import SchoolManagement.model.Student;
import SchoolManagement.service.Impl.StudentServiceImpl;
import SchoolManagement.service.Impl.TeacherServiceImpl;
import SchoolManagement.service.StudentService;
import SchoolManagement.service.TeacherService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {
    private StudentService studentService;
    @BeforeEach
    void init(){
        studentService = new StudentServiceImpl();
    }

    @Test
    void takeCourse() {
        Course course = new Course();
        Student student = new Student();
        course.setCourseName("Geography");
        studentService.takeCourse(course, student);
        assertEquals(course.getCourseName(),"Geography");

    }

}