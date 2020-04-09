import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.*;

public class CohortTest {
//
//    Cohort emptyCohort;
//    Cohort cohortWithOne;
//    Cohort cohortWithMany;
//
//    @Before
//    public void setup(){
//        emptyCohort = new Cohort();
//        cohortWithOne = new Cohort();
//        cohortWithMany = new Cohort();
//
//        Student fer = new Student(1, "Fer M");
//        fer.addGrade(90);
//
//        Student trant = new Student(2, "Trant B");
//        trant.addGrade(100);
//        trant.addGrade(100);
//        trant.addGrade(100);
//
//        cohortWithOne.addStudent(fer);
//        cohortWithMany.addStudent(fer);
//        cohortWithMany.addStudent(trant);
//    }
//
//    @Test
//    public void testAddStudentAndGetStudentsWork(){
//        assertEquals(0, emptyCohort.getStudents().size());
//        assertEquals(1, cohortWithOne.getStudents().size());
////        assertEquals(1, cohortWithOne.getStudents().get(0).getId());
//    }
//
//    @Test
//    public void testIfAvgIsCorrect(){
//        assertEquals(95.0, cohortWithMany.getCohortAverage(), 0);
//    }

    private Cohort fortuna;

    @Before
    public void setUp() {
        fortuna = new Cohort();

        Student s1 = new Student(1, "S1");
        Student s2 = new Student(1, "S2");
        Student s3 = new Student(1, "S3");

        fortuna.addStudent(s1);
        fortuna.addStudent(s2);
        fortuna.addStudent(s3);

        s1.addGrade(75);
        s1.addGrade(85);

        s1.addGrade(80);
        s1.addGrade(90);

        s1.addGrade(85);
        s1.addGrade(95);
    }

    @Test
    public void testCohortNotEmpty() {
        assertFalse("Expected cohort not to be empty.", fortuna.getStudents().isEmpty());
    }

    @Test
    public void testGetCohortAverage() {
        assertEquals("Expected corhort average to be 85.0", 85.0, fortuna.getCohortAverage(), 0);
    }
}