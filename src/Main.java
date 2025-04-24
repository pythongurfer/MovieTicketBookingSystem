import java.util.Scanner;
import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;


public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        try{
            System.out.println("Loading the movies...");
            MovieTicketBookingSystem.loadMovieSchedule("movies.txt");
            System.out.println("enter the movie name for your booking");
            String movieName = sc.nextLine();
            MovieTicketBookingSystem.bookTicket(movieName);
        } catch (FileNotFoundException e){
            System.out.println("Error: "+e.getMessage());
        } catch (IllegalArgumentException e){
            System.out.println("Input error: " + e.getMessage());
        } catch (MovieNotAvailableException e){
            System.out.println("Mistake in the availability: " + e.getMessage());
        } finally {
            System.out.println("Thanks for using our booking system! ");
        }
        sc.close();


    }
}
