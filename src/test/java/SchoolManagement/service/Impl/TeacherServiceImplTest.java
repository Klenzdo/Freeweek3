package SchoolManagement.service.Impl;

import SchoolManagement.model.Course;
import SchoolManagement.model.Teachers;
import SchoolManagement.service.StudentService;
import SchoolManagement.service.TeacherService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TeacherServiceImplTest {

    private  TeacherService teacherService;
    @BeforeEach
    void init(){
        teacherService = new TeacherServiceImpl();
    }

    @Test
    void teachCourse() {
    Teachers teachers = getTeachers();
    Course course = new Course();
    course.setCourseName("Geopgraphy");
    teacherService.teachCourse(course, teachers);
    assertEquals(teachers.getName(),"Anette");
    }





    private Teachers getTeachers (){
        Teachers teachers = new Teachers();
        teachers.setName("Anette");
        return teachers;
    }
}