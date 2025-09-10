// import Scanner for user input
import java.util.Scanner;

// define Dateable class
public class Dateable {
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
            // calculates minimum dating age for user
            int youngest = 7 + (age / 2);

            // outputs user's age and calculated minimum dating age
            System.out.println(age + "-year olds should date somebody who is at least " + youngest + " years old.");
        } else {
            // displays error message for invalid input
            System.out.println("Please enter a valid age integer");
        }
        // closes scanner to prevent resource leaks
        scanner.close();
    }
}
