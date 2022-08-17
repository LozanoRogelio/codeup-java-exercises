package grades;

import java.util.HashMap;
import java.util.Scanner;

public class GradesApplication {
    public static void main(String[] args) {
//        HashMap<String,Student> students = new HashMap<>();
//        students.put("Brian", bart);
//        students.put("Stewie", stewie);
//        students.put("Bart", bart);
//        students.put("Lisa", lisa);

        Student student1 = new Student("Brian");
        student1.addGrade(100);
        student1.addGrade(90);
        student1.addGrade(95);

        Student student2 = new Student("Bart");
        student2.addGrade(60);
        student2.addGrade(50);
        student2.addGrade(45);

        Student student3 = new Student("Bart");
        student3.addGrade(100);
        student3.addGrade(90);
        student3.addGrade(95);
        Student student4 = new Student("Lisa");
        student4.addGrade(100);
        student4.addGrade(90);
        student4.addGrade(95);

        HashMap<String, Student> students = new HashMap<>();
        students.put("Brianred", student1);
        students.put("Stewieblue", student2);
        students.put("Bartgreen", student3);
        students.put("Lisayellow", student4);
        System.out.println(students);

        Scanner sc = new Scanner(System.in);
        System.out.println("""
                Welcome!
                                
                Here are the GitHub usernames of our students:    
                """);
        for (String username : students.keySet()) {
            System.out.printf(" |%s| ", username);
        }

        String userConfirm;

        do {
            System.out.println("\nWhat student would you like to see more information on?");
            String userInput = sc.nextLine();
            if (!students.containsKey(userInput)) {
                System.out.println("Sorry, no student found with the GitHub username of " + userInput + "!");
            } else {
                Student student = (Student) students.get(userInput);
                System.out.println("Student Name: " + student.getStudentName());
                System.out.println("GitHub Username: " + userInput);
                System.out.println("Current Grade Average: " + student.getGradeAverage());
            }
            System.out.println("\n Would you like to see another student? Y/N?");
            userConfirm = sc.nextLine();
//            userConfirm.equalsIgnoreCase("y");
        } while (userConfirm.equalsIgnoreCase("y"));
        System.out.println("Thank you!");

    }


}
