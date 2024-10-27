package SchoolManagement.service;

import SchoolManagement.model.Applicant;
import SchoolManagement.model.Student;

public interface PrincipalService {

    void expelStudent(Student student);
    void suspendStudent(Student student);
    void liftSuspension(Student student);
    String admitApplicant(Applicant applicant);

}

