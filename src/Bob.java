
import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Say something to Bob!");
        String userInput = scanner.nextLine();
            if (userInput.toUpperCase().endsWith("?")) {
                System.out.println("Sure");
            } else if (userInput.toUpperCase().endsWith("!")) {
                System.out.println("Whoa, chill out!");
            } else if (userInput.equals("")) {
                System.out.println("Fine. Be that way!");
            } else {
                System.out.println("Whatever");
            }

        }


}
