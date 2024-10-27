package SchoolManagement.service.Impl;

import SchoolManagement.model.Applicant;
import SchoolManagement.model.Student;
import SchoolManagement.service.PrincipalService;

public class PrincipalServiceImpl implements PrincipalService {

    public void expelStudent(Student student) {
        student.setExpelled(true);
        System.out.println("Student by name: " + student.getName() + " is expelled by the Principal" );
    }

    public void suspendStudent(Student student) {
        student.setSuspended(true);
        System.out.println("Student by name: " + student.getName() + " is suspended");

    }

    public void liftSuspension(Student student) {
        student.setSuspended(false);
        System.out.println( student.getName() + ", your suspension is lifted");
    }

    public String admitApplicant(Applicant applicant) {
        if (applicant.getAge() >= 17) {
            applicant.setAdmitted(true);
          return  "Congratulations!!! " + applicant.getName() + ", you have been offered provisional admission ";

        }
       return applicant.getName() + ", you are less than the required age to be admitted into our institution";

    }
}

