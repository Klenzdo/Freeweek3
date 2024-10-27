package SchoolManagement.service;

import SchoolManagement.model.Course;
import SchoolManagement.model.Teachers;

import java.io.IOException;
import java.util.List;

public interface TeacherService {
    String teachCourse(Course course, Teachers teacher);

    List<Teachers> getTeachersCsv() throws IOException;
}
