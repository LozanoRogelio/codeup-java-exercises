import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class HighLow {
    public static void main(String[] args) {

        Random randomNum = new Random();
        int randomInt = randomNum.nextInt(100) + 1;

        Scanner scanner = new Scanner(System.in);
        System.out.println(HighLow(randomInt, scanner));




    }

    public static String HighLow(int randomInt, Scanner scanner){

        System.out.println("Thinking of a number from 1-100. Guess it!?");
        int userGuess = scanner.nextInt();
        if (userGuess == randomInt) {
            System.out.println("GOOD GUESS");
            return ("Good Guess! It took you  tries.");
        } else if (userGuess < randomInt) {
            System.out.println("HIGHER");
            return HighLow(randomInt, scanner);
        } else {
            System.out.println("Lower");
            return HighLow(randomInt, scanner);
        }

    }
}
