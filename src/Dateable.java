import java.util.Scanner;

public class Dateable {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.println("Enter your age: ");
        int age = read.nextInt();

        int youngest = 7 + (age / 2);
        System.out.println(age + "-year olds should date somebody who is at least " + youngest + " years old.");

        read.close();
    }
}
