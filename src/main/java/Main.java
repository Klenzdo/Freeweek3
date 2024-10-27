import SchoolManagement.enums.Gender;
import SchoolManagement.model.*;
import SchoolManagement.service.Impl.PrincipalServiceImpl;
import SchoolManagement.service.Impl.StudentServiceImpl;
import SchoolManagement.service.Impl.TeacherServiceImpl;
import SchoolManagement.service.PrincipalService;
import SchoolManagement.service.StudentService;
import SchoolManagement.service.TeacherService;

import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {


        TeacherService teacherService = new TeacherServiceImpl();
        List<Teachers> teachers = teacherService.getTeachersCsv();

        StudentService studentService = new StudentServiceImpl();
        List<Student> students = studentService.getDetailsFromCsv();

        Student ifeanyi = students.get(0);
        Person ngozi =  students.get(2);
        Principal principal = new Principal("Gerald Amadi", "Male", 45, 2);
        PrincipalService principalService= new PrincipalServiceImpl();
        principalService.suspendStudent(ifeanyi);
        Course geography = new Course("Geography", "Geo 101", 12);

        Teachers annette = teachers.get(1);

        teacherService.teachCourse(geography, annette);
        System.out.println(studentService.takeCourse(geography, ifeanyi));

        System.out.println(students.get(1).getName());
        Applicant applicant = new Applicant("Charity Uba", Gender.FEMALE, 16, +234, "charity01@gmail.com");
        Applicant applicant2 = new Applicant("Stanley Okeke", Gender.MALE, 19, +234, "stanleyokeke@gmail.com");

        System.out.println( principalService.admitApplicant(applicant));
        System.out.println( principalService.admitApplicant(applicant2));

        principalService.expelStudent((Student) ngozi);
        System.out.println(ifeanyi.isSuspended());


    }
//        studentService.getDetailsFromCsv();







}
// Factory method (a method that returns a new instance of an object).
//        public static TeacherService teacherService(){
//            return new TeacherServiceImpl();
//        }
//        public static StudentService studentService(){
//            return new StudentServiceImpl();
//        }
//        public static PrincipalService principalService(){
//            return new PrincipalServiceImpl();
//        }
//    }



