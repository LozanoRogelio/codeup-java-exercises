package util;

import java.util.Scanner;

public class Input {

//    private Scanner scanner;

    private final Scanner scanner = new Scanner(System.in);


//    public Input() {
//        this.scanner = new Scanner(System.in);
//
//    }

    public String getString(){
        return scanner.nextLine();
    }

    public boolean yesNo() {
        System.out.println("Enter Y/N: ");
        String response = scanner.nextLine();
        return response.equalsIgnoreCase("y") || response.equalsIgnoreCase("yes");
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
    }

    public int getInt() {
        return scanner.nextInt();
    }

    public double getDouble(double min, double max) {
            System.out.println("Enter an integer between " + min + " and " + max);
            double doubleInput = scanner.nextDouble();
            if (doubleInput < min || doubleInput > max) {
                System.out.println("Not within range, enter another number!");
                return getDouble(min, max);
            } else {
                System.out.println("You are within range!");
                return doubleInput;
            }


        }

    public double getDouble() {
        System.out.println("Please enter a decimal number: ");
        return scanner.nextDouble();
    }



}
