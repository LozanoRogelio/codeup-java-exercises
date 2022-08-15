package grades;

import java.util.ArrayList;

public class StudentTest {
    public static void main(String[] args) {
//        Get grades
        Student roger = new Student("Roger");
        roger.addGrade(50);
        roger.addGrade(80);
        roger.addGrade(90);
        roger.addGrade(20);
        System.out.println(roger.getGrades());


        Student mat = new Student("Mat");
        mat.addGrade(50);
        mat.addGrade(80);
        mat.addGrade(90);
        mat.addGrade(20);
        System.out.println(mat.getGradeAverage());
    }

}

