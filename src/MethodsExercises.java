import java.util.Scanner;

public class MethodsExercises {
    public static void main(String[] args) {

        int z = product(2, -20);
        System.out.println(z);

        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number between 1 and 10: ");
        int userInput = getInteger(1, 10, scanner);
        System.out.print(userInput);

        System.out.println();
        System.out.print("HEY!! Please enter a number between 1 and 10: ");
        long factorialInput = factorial( scanner);
        System.out.print(factorialInput);



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

    public static long factorial(Scanner scanner) {
        String empty = "";
        long factorialInput = getInteger(1,10,scanner);
        long total = 1;
        System.out.println(factorialInput);
        for (int i = 1; i < factorialInput; i++) {
             total *= i;
             if(i == factorialInput){
                empty
             }
        }

        return factorialInput;
    }



}
