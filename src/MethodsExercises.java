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
//        long factorialInput = factorial( scanner);
        factorial(scanner);



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
        do {
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
            System.out.print("Enter a number between 1 and 100 that you wish to continue too: ");
            factorial(scanner);
        } while("y".equalsIgnoreCase(yesOrNo));

    }



}
