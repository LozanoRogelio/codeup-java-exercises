package movies;


// TODO: change this to wherever your Input class is located
import util.Input;

public class MoviesApplication {
    public static final int INVALID_CHOICE = -1;
    public static final int EXIT_CHOICE = 0;

    private static Movie[] movies;

    public static void main(String[] args) {
//        go out and grab all movies
        movies = MoviesArray.findAll();

        Input input = new Input();

        // loop until the user says he/she does not wish to continue
        int choice = INVALID_CHOICE;
        while (choice != EXIT_CHOICE) {
            printMenu();

            choice = input.getInt(0, 5);

            doChoice(choice);

        }
    }

    private static void printMenu() {
        System.out.print("""
                What would you like to do?
                                
                0 - exit
                1 - view all movies
                2 - view movies in the animated category
                3 - view movies in the drama category
                4 - view movies in the horror category
                5 - view movies in the scifi category
                            
                """);
    }

    private static void doChoice(int choice) {
        // TODO: call your functions based on whatever the user's choice is
        switch (choice) {
            case 1:
                // TODO: view all movies
                printAllMovies();
                break;
            case 2:
                // TODO: view movies in the musical category
                printMoviesByCategory("animated");
                break;
            case 3:
                // TODO: view movies in the drama category
                printMoviesByCategory("drama");
                break;
            case 4:
                // TODO: view movies in the horror category
                printMoviesByCategory("horror");
                break;
            case 5:
                // TODO: view movies in the scifi category
                printMoviesByCategory("scifi");
                break;
        }
    }

    private static void printMoviesByCategory(String category) {
        for (Movie movie: movies) {
            if(movie.getCategory().equals(category)) {
                System.out.println(movie);
            }
        }
    }

    private static void printAllMovies() {
//        loop through the movies and print them all out
        for (Movie movie: movies) {
            System.out.println(movie);
        }
    }
}

