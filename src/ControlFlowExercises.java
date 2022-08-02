import java.util.Scanner;


public class ControlFlowExercises {
    public static void main(String[] args) {


        //        5-15 Part 1
        int i = 5;
        while (i <= 15) {
            System.out.println(i);
            i++;
        }

        System.out.println();
//        100-(-15) Part 2
        int c = 100;
        do {
            System.out.println(c);
            c-=5;
        } while (c >= -10);

        System.out.println();
//        2-65536
        long a = 2;
        do {
            System.out.println(a);
            a*=a;
        } while (a < 1000000);

        System.out.println();

//        Part 1 Rewrite For Loop
        for(int z = 5; z <= 15; z++) {
            System.out.println(z);
        }

        System.out.println();

//        Part 2 Rewrite For Loop
        for(long z = 2; z < 1000000; z*=z) {
            System.out.println(z);
        }

//        FizzBuzz
        for(int g = 1; g < 100; g++) {
            if (((g % 3) == 0) && ((g % 5) == 0)) {
                System.out.println("FizzBuzz");
            } else if (g % 3 == 0) {
                System.out.println("Fizz");
            } else if (g % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(g);

            }
        }

//        Table of Powers
        Scanner scanner = new Scanner(System.in);
        String choice = "y";
        do {
            System.out.print("Enter an integer: ");
            int input = scanner.nextInt();
            System.out.println("Here is your Table of Powers!");
            System.out.println("Number" + " " + "Squared" + " " + "Cubed");
            System.out.println("------" + " " + "-------" + " " + "-----");

            for (i = 1; i <= input; i++) {
                System.out.println(i + "      | " + (i * i) + "       |" + "  " + (i * i * i));
            }
            System.out.print("\nContinue? (y/n): ");
            choice = scanner.next();
            System.out.println();
        }
        while (!choice.equalsIgnoreCase("n"));


    }
}
