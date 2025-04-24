import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;

public class MovieTicketBookingSystem extends Exception  {
    private static List<String> availableMovies = new ArrayList<>();

    // method that loads a file from the database
    public static void loadMovieSchedule(String filePath) throws FileNotFoundException{
        File file = new File(filePath);

        // simulation: if the file would be missing we launch FileNotFoundException
//        if (!file.exists()){
//            throw new FileNotFoundException("The movie file  " + filePath + " has not been founded");
//        }
        // simulating that the file would exist, we would read it and would fill the list
        availableMovies = Arrays.asList("Top Gun", "Pretty Woman", "American Beauty");

    }

    // method to book tickets
    public static void bookTicket(String movieName) throws MovieNotAvailableException {
        // Exception not verified
        if (movieName == null || movieName.trim().isEmpty()){
            throw new IllegalArgumentException("THe name of the movie can be null or be an empty string ");
        }

        // Personalized exception
        if (!availableMovies.contains(movieName)){
            throw new MovieNotAvailableException("The movie " + movieName + " is not currently available ");
        }
        System.out.println("The ticket was successfully booked for " + movieName);
    }



}
