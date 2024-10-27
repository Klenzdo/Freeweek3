package SchoolManagement.service.Impl;

import SchoolManagement.model.Applicant;
import SchoolManagement.service.PrincipalService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrincipalServiceImplTest {
    private PrincipalService principalService;
    @BeforeEach
    void init() {
        principalService = new PrincipalServiceImpl();

    }

    @Test
    void admitApplicant() {
        Applicant applicant = new Applicant();
        applicant.setName("Freedom");
        applicant.setAge(19);
        String result = principalService.admitApplicant(applicant);
        assertNotNull(result);
        assertEquals(result,"Congratulations!!! " + applicant.getName() + ", you have been offered provisional admission ");
        assertNull(applicant.getEmail());
    }
}