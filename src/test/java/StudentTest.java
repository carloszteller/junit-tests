import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class StudentTest {
    private Student s1;
    private Student s2;
    private Student s3;

    @Before
    public void createStudents() {
        s1 = new Student("S1");
        s2 = new Student("S2");
        s3 = new Student("S3");
    }

    @Test
    public void testGetId() {
        assertEquals("Expected ID of 1 for S1", 1, s1.getId());
        assertEquals("Expected ID of 2 for S2",2, s2.getId());
        assertEquals("Expected ID of 3 for S3",3, s3.getId());
    }

    @Test
    public void testGetName() {
        assertEquals("Expected name to be S1 for S1", "S1", s1.getName());
        assertEquals("Expected name to be S2 for S2", "S2", s2.getName());
        assertEquals("Expected name to be S3 for S3", "S3", s3.getName());
    }

    @Test
    public void testAddGrade() {
        s1.addGrade(75);
        s2.addGrade(80);
        s3.addGrade(85);

        assertTrue("Expected grades size to be greater than 0 for S1", s1.getGrades().size() > 0);
        assertTrue("Expected grades size to be greater than 0 for S2", s2.getGrades().size() > 0);
        assertTrue("Expected grades size to be greater than 0 for S3", s3.getGrades().size() > 0);
    }

    @Test
    public void testGetGradeAverage() {
        s1.addGrade(80);
        s2.addGrade(85);
        s3.addGrade(90);

        s1.addGrade(85);
        s2.addGrade(90);
        s3.addGrade(95);

        assertEquals("Expected average to be 82.5 for S1", 82.5, s1.getGradeAverage(s1.getGrades()), 0);
        assertEquals("Expected average to be 87.5 for S2", 87.5, s2.getGradeAverage(s2.getGrades()), 0);
        assertEquals("Expected average to be 92.5 for S3", 92.5, s3.getGradeAverage(s3.getGrades()), 0);
    }
}
