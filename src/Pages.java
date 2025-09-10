// import Scanner for user input
import java.util.Scanner;

// define Dateable class
public class Pages {
    // main - entry point of program
    public static void main(String[] args) {
        // create Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // prompt user to enter age
        System.out.println("Enter your age: ");

        // checks if input is a valid integer
        if (scanner.hasNextInt()) {
            // stores user input as an integer
            int age = scanner.nextInt();
            // initiates variable for number of pages
            int pages;
            // ensures pages won't end up being negative
            if (age > 100) {
                // if age is over 100 then pages will be 0
                pages = 0;
            } else {
                // calculates minimum pages user should read based on age
                pages = 100 - age;
            }

            // displays error message for invalid input
            System.out.println(age + "-year olds should read at least " + pages + " pages before giving up on a book.");
        } else {
            // displays error message for invalid input
            System.out.println("Please enter a valid age integer");
            }

        // closes scanner to prevent resource leaks
        scanner.close();
    }
}
