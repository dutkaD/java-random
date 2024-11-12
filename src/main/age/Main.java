package main.age;


import java.util.Scanner;

// TODO 1: Ask a user to enter their age in the terminal, check if they are older than 18, if yes write "come in", otherwise "denied"
// TODO 2: Improve by asking again and again, until the user enters the age above 18
// TODO 3: what happens if the user enters a text "abc"? Can you improve the code?
public class Main {

    public static void main(String[] args) {
        boolean above18 = false;
        Scanner scanner = new Scanner(System.in);

        while (!above18) {
            System.out.print("Please enter your age: ");

            if (scanner.hasNextInt()) {
                int age = scanner.nextInt();
                if (age >= 18) {
                    above18 = true;
                    System.out.println("come in!");
                    scanner.close();
                } else {
                    System.out.println("denied!");
                }
            } else {
                System.out.println("Enter a number please");
                scanner.next();  // Consume the invalid input to avoid an infinite loop
            }
        }
    }
}
