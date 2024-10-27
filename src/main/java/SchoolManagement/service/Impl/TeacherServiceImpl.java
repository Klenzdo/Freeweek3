package SchoolManagement.service.Impl;

import SchoolManagement.model.Course;
import SchoolManagement.model.Teachers;
import SchoolManagement.service.TeacherService;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class TeacherServiceImpl implements TeacherService {
    @Override
    public String teachCourse(Course course, Teachers teacher) {
        return "Mrs. " + teacher.getName() + " is teaching " +  course.getCourseName();

    }
    @Override
    public List<Teachers> getTeachersCsv() throws IOException {
        String filePath = "src/main/resources/Teacher.csv";
        List<Teachers> teacherList = new ArrayList<>();
        FileReader file = new FileReader(filePath);
        BufferedReader bfr = new BufferedReader(file);
        String line;
        bfr.readLine();
        while ((line = bfr.readLine()) != null) {
            String[] strAr = line.split(",");
            String name = strAr[0];
            String gender = strAr[1];
            int age = Integer.parseInt(strAr[2].trim());
            int id = Integer.parseInt(strAr[3].trim());

            Teachers teacher = new Teachers(name, gender, age, id);
            System.out.println(teacher);
            teacherList.add(teacher);
        }
        bfr.close();
        System.out.println(teacherList.size());
        return teacherList;
    }
}
