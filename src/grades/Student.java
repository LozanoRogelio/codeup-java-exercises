package grades;

import java.util.ArrayList;


public class Student {
    private String studentName;
    private ArrayList<Double> grades;;


    public Student(String studentName) {
        this.studentName = studentName;
        this.grades = new ArrayList<>();
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void addGrade(double grade) {
        grades.add(grade);
    }

    public double getGradeAverage () {
        double sum = 0;

        for (Double grade : grades) {
            sum += grade;
        }

        return sum / grades.size();
    }

    public ArrayList<Double> getGrades() {
        return grades;
    }
}
