import java.util.ArrayList;

public class StringExercise {
    public static void main(String[] args) {
        String a = "We don't need no education";
        String b = "We don't need no thought control";
        String c = "Check \"this\" out!, \"s inside of \"s!";
        String d = "In windows, the main drive is usually C:\"";
        String e = "I can do backslashes \\, double backslashes \\\\,\n" +
                "and the amazing triple backslash \\\\\\!";
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);

        System.out.println();
//        Using an array list and input
        ArrayList<String> quotes = new ArrayList<>();
        quotes.add("We don't need no education");
        quotes.add("We don't need no thought control");
        quotes.add("Check \"this\" out!, \"s inside of \"s!");
        quotes.add("In windows, the main drive is usually C:\"");
        quotes.add("I can do backslashes , double backslashes, and triple backslashes");

        for (String i : quotes) {
            System.out.println(i);
        }


    }
}
