package shapes;
import util.Input;
import java.util.Scanner;


public class CircleApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Create.createCircle(scanner);

    }

 public class Create {
    public static void createCircle(Scanner scanner) {
        Input createInput = new Input();
        System.out.println("Would you like to create a circle?");
        boolean userInput = createInput.yesNo();
        if(userInput){
            System.out.println("Enter radius of circle: ");
            Circle newCircle = new Circle(scanner.nextDouble());
            double area = newCircle.getArea();
            double circumference = newCircle.getCircumference();
            System.out.println("Your circle has an area of "+ area + "!");
            System.out.println("Your circle has a circumference of "+ circumference + "!");
            createCircle(scanner);
        } else
            System.out.println("No worries! Thank you!!");

    }

}

}
