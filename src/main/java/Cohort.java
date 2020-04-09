import java.util.ArrayList;
import java.util.List;

public class Cohort {
//
//    private List<Student> students;
//
//    public Cohort() {
//        this.students = new ArrayList<>();
//    }
//
//    public double getCohortAverage() {
//        double avg = 0;
//        for (Student student: this.getStudents()) {
//            avg += student.getGradeAverage();
//        }
//        return avg / this.getStudents().size();
//    }
//
//    public void addStudent(Student student){
//        students.add(student);
//    }
//
//    public List<Student> getStudents() {
//        return students;
//    }

    private List<Student> students;

    public Cohort() {
        this.students = new ArrayList<>();
    }

    public List<Student> getStudents() {
        return students;
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public double getCohortAverage() {
        double cohortAverageSum = 0;

        for(Student student : students) {
            cohortAverageSum += student.getGradeAverage();
        }

        return cohortAverageSum / getStudents().size();
    }
}