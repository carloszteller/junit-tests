import java.util.ArrayList;

public class Student {
    private long id;
    private static long counter;
    private String name;
    private ArrayList<Integer> grades;

    public Student(String name) {
        counter++;
        this.id = counter;
        this.name = name;
        grades = new ArrayList<>();
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void addGrade(int grade) {
        grades.add(grade);
    }

    public ArrayList<Integer> getGrades() {
        return grades;
    }

    public double getGradeAverage(ArrayList<Integer> grades) {
        int sum = 0;

        for(int grade : grades) {
            sum += grade;
        }

        return (double) sum / grades.size();
    }
}
