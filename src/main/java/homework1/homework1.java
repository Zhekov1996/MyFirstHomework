package homework1;

import java.util.Scanner;

public class homework1 {

    public static void main(String[] args) {
        System.out.println("Please enter your first and Last name");
        Scanner scanner = new Scanner(System.in);

        String firstName = scanner.next();
        String lastName = scanner.next();

        System.out.println("Please enter your age");
        int userAge = scanner.nextInt();

        System.out.println("What is your hobby?");
        String hobby = scanner.next();

        System.out.println(" Your name is " + firstName + "  " + lastName + " you are " + userAge + " and your hobby is: " + hobby);


    }
}
