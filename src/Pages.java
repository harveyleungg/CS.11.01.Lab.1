import java.util.Scanner;

public class Pages {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.println("Enter your age: ");
        int age = read.nextInt();
        int pages;

        if (age > 100) {
            pages = 0;
        } else {
            pages = 100 - age;
        }

        System.out.println(age + "-year olds should read at least " + pages + " pages before giving up on a book.");

        read.close();
    }
}
