package util;

import java.util.Scanner;

public class Input {

    private Scanner scanner;

    public Input() {
        this.scanner = new Scanner(System.in);

    }

    public String getString(){
      return scanner.nextLine();
    }

    public boolean yesNo() {
        String response = scanner.nextLine();
        if (response.equalsIgnoreCase("y") || response.equalsIgnoreCase("yes")) {
            return true;
        }
            else
                return false;
        }

    public int getInt(int min, int max) {
        System.out.println("Enter an integer between " + min + " and " + max);
        int userInput = scanner.nextInt();
        if (userInput < min || userInput > max) {
            System.out.println("Not within range, enter another number!");
            return getInt(min, max);
        } else {
            System.out.println("You are within range!");
            return userInput;
        }

//    public double getDouble(double min, double max) {
//            System.out.println("Enter an integer between " + min + " and " + max);
//            double doubleInput = scanner.nextDouble();
//            if (doubleInput < min || doubleInput > max) {
//                System.out.println("Not within range, enter another number!");
//                return getDouble(min, max);
//            } else {
//                System.out.println("You are within range!");
//                return doubleInput;
//            }
//
//
//        }
    }


    public Input(Scanner scanner) {
        this.scanner = scanner;
    }
}
