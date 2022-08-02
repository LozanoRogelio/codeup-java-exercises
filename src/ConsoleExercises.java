import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
        double pi = 3.14159;
        System.out.printf("The value of pi is approximately %.2f", pi);
//        System.out.format("%.2f%n", pi);

        System.out.println();

        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter("\n");

        System.out.print("Enter an integer: ");
        int userInput = scanner.nextInt();

        System.out.printf("You entered: --> %s", userInput);

//        3 Words
        scanner.nextLine();
        System.out.print("Enter 3 words: ");
        String inputOne = scanner.next();
        String inputTwo = scanner.next();
        String inputThree = scanner.next();
        System.out.printf("%s\n%s\n%s\n", inputOne, inputTwo, inputThree);

//        Full Sentence
        scanner.nextLine();
        System.out.print("Enter a full sentence: ");
        String fullSentence = scanner.nextLine();
        System.out.println("You sentence: --> " + fullSentence);

//        Original
        scanner.nextLine();
        System.out.print("Enter length of classroom: ");
        String length  = scanner.nextLine();
        int length2 = Integer.parseInt(length);
        System.out.print("Enter width of classroom: ");
        String width = scanner.nextLine();
        int width2 = Integer.parseInt(width);
        System.out.print("Enter height of classroom: ");
        String height = scanner.nextLine();
        int height2 = Integer.parseInt(width);
        System.out.println("The area of the classroom is " + (length2 * width2) + " the perimeter is " + ((length2*2)+(width2*2)) + " and the volume is " + (length2*width2*height2) );

//        Rewrite
        System.out.print("Enter length of classroom: ");
        float length5  = scanner.nextFloat();
        System.out.print("Enter width of classroom: ");
        float width5 = scanner.nextFloat();
        System.out.print("Enter height of classroom: ");
        float height5 = scanner.nextFloat();

        System.out.println("The area of the classroom is " + (length5 * width5) + " the perimeter is " + ((length5*2)+(width5*2)) + " and the volume is " + (length5*width5*height5) );




        scanner.close();

    }
}
