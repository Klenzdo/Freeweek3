package SchoolManagement;

public class Main {
    public static void main(String[] args) {
        Student ifeanyi = new Student("Ifeanyi", "Male", 18, 1 );
        Person ngozi = new Student("Ngozi", "Female", 17, 6);
        Principal principal = new Principal("Segun", "Male", 45, 2);
        principal.suspendStudent(ifeanyi);
        Course geography = new Course("Geography", "Geo 101", 12);
        Teachers annette = new Teachers("Annette", "Female", 35, 5);
        annette.teachCourse(geography);
        ifeanyi.takeCourse(geography);
        Applicant applicant = new Applicant("Charity","Female",16, +234, "freedoklenz@gmail.com" );
        System.out.println("Applicant by Name: " + applicant.getName());
        principal.admitApplicant(applicant);
        principal.expelStudent((Student) ngozi);

        System.out.println(ifeanyi.isSuspended());





    }
}
