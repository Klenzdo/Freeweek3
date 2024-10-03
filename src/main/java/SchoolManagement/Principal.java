package SchoolManagement;

public class Principal extends Person {


    public Principal(String name, String gender, int age, int id) {
        super(name, gender, age, id,"PRINCIPAL") ;
    }
    public void expelStudent(Student student){
        student.setExpelled(true);
        System.out.println("Student by name: " + student.getName() + " is expelled");
    }
    public void suspendStudent(Student student){
        student.setSuspended(true);
        System.out.println("Student by name: " + student.getName() + " is suspended");

    }
    public void liftSuspension(Student student){
        student.setSuspended(false);
        System.out.println("Student by name: " + student.getName() + " suspended is lifted");
    }
    public void admitApplicant(Applicant applicant){
        if(applicant.getAge()>=17){
            applicant.setAdmitted(true);
            System.out.println("Applicant " + applicant.getName()+ " successfully admitted");
            return;
        }
        System.out.println("Applicant's age is less than the required age");

    }




    }

