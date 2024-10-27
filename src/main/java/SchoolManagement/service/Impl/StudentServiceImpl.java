package SchoolManagement.service.Impl;

import SchoolManagement.model.Course;
import SchoolManagement.model.Student;
import SchoolManagement.service.StudentService;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class StudentServiceImpl implements StudentService {
    @Override
    public String takeCourse(Course course, Student student) {
        return " Student by name:  " + student.getName() + " is taking course " + course.getCourseName();
    }

    @Override
    public boolean isExpelled(Student student) {
        return student.isExpelled();
    }

    @Override
    public boolean isSuspended(Student student) {
        return student.isSuspended();
    }
    @Override
    public List<Student> getDetailsFromCsv() throws IOException {
        String filePath = "src/main/resources/Student.csv";
        List<Student> studentList = new ArrayList<>();
        FileReader file = new FileReader(filePath);
        BufferedReader bfr = new BufferedReader(file);
        String line;
        bfr.readLine();
        while ((line = bfr.readLine()) != null) {
            //split the readLine into an array of single elements using the comma separator
            //["Ifeanyi", "Male", "32", "25"]
            String[] strAr = line.split(",");
            String name = strAr[0];
            String gender = strAr[1];
            int age = Integer.parseInt(strAr[2].trim());
            int id = Integer.parseInt(strAr[3].trim());

            Student student = new Student(name, gender, age, id);
            System.out.println(student);
            studentList.add(student);

        }
        bfr.close();
        System.out.println(studentList.size());
        return studentList;

    }
}