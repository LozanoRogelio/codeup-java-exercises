import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class MethodsExercises {
    public static void main(String[] args) {

        int z = product(2, -20);
        System.out.println(z);

        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number between 1 and 100: ");
        int userInput = getInteger(1, 100, scanner);
        System.out.print(userInput);

        System.out.println();
        System.out.print("HEY!! Please enter a number between 1 and 100: ");
        factorial(scanner);

        System.out.println();
        System.out.println("Enter the number of sides in each of your 2 dice...then roll em!");
        rollDice(scanner.nextInt(), scanner.nextInt());




    }

    public static int add(int x, int y) {
        return x + y;
    }

    public static int sub(int x, int y) {
        return x - y;
    }

    public static int multiply(int x, int y) {
        return x * y;
    }

    public static int product(int x, int y) {
        if(y == 0) {
            return 0;
        }
        if(y>0) {
            return x + product(x, y - 1);
        }
        return -product(x,-y);
    }

    public static int divide(int x, int y) {
        return x / y;
    }

    public static int modulus(int x, int y) {
        return x % y;
    }

    public static int getInteger(int min, int max, Scanner scanner) {
        int userInput = scanner.nextInt();
        if (userInput < min || userInput > max) {
            System.out.println("Not within range, enter another number!");
            return getInteger(min, max, scanner);
        } else {
            System.out.println("You are within range!");
            return userInput;
        }

    }

    public static void factorial(Scanner scanner) {
        String empty = "";
        long factorialInput = getInteger(1,100,scanner);
        long total = 1;
        System.out.println(factorialInput);
        String yesOrNo = "y";
            for (int i = 1; i <= factorialInput; i++) {
                total *= i;
                if (i == factorialInput) {
                    empty += i + " ";
                } else {
                    empty += i + " x ";
                }
                System.out.println(i + "! = " + empty + " = " + total);
            }
            System.out.print("\nContinue? (y/n): ");
            yesOrNo = scanner.next();
            if(Objects.equals(yesOrNo, "y")) {
                System.out.print("Enter a number between 1 and 100 that you wish to continue too: ");
                factorial(scanner);
            } else if (Objects.equals(yesOrNo, "n")) {
                System.out.println("Thank you!");
            }

    }
    
    
    public static void rollDice(int firstDiceSides, int secondDiceSides) {
        Random random = new Random();

    int chance1 = random.nextInt(firstDiceSides);
    int chance2 = random.nextInt(secondDiceSides);
    int total = chance1 + chance2;


    System.out.println("You rolled: " + chance1 + " for the first dice." + "\n" + " You rolled " + chance2 + " for the second dice." + "\n" + "Total of " + total + "!");

    }







}
