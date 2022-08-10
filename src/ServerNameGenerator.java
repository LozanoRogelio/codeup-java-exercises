import java.util.Random;

public class ServerNameGenerator {


    public static void main(String[] args) {
        String[]  adjectives;
        adjectives = new String[]{"brave", "nice","fierce","wonderful","grumpy","defeated","evil","silly","funny","infamous"};

        String[] nouns;
        nouns = new String[]{"pizza", "spoon", "compass", "machine", "stove", "duck", "monkey", "shoe", "cup", "goose"};

        randomNameGenerator(adjectives, nouns);

    }

    public static String randomNameGenerator(String[] adjectives, String[] nouns) {
        Random random1 = new Random();
        Random random2 = new Random();
        int randomAdj = random1.nextInt(adjectives.length);
        int randomNoun = random2.nextInt(nouns.length);
        System.out.println("Here is your server name:\n" + adjectives[randomAdj]+"-"+nouns[randomNoun]);
        return  "";

    }

}
