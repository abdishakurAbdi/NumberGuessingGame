import java.util.*;

public class GusessingGame {

    public static void main(String[] args) {

        // variable intialization
        Random random = new Random();
        int randomNumber = random.nextInt(100) + 1;
        String playAgain = "y";

        // creating scanner object
        Scanner scanner = new Scanner(System.in);

        //
        int guess = 0;
        while (playAgain.equalsIgnoreCase("y")) {
            while (guess != randomNumber) {
                System.out.println("Enter your guess (1-100): ");
                guess = scanner.nextInt();

                if (guess < randomNumber) {
                    System.out.println("Too Low, try again...");
                } else if (guess < randomNumber) {
                    System.out.println("Too high, try again...");
                } else {
                    System.out.println("Congrattulation!! You guessed right...");
                }

            }
            System.out.println("Do you want to play agian? (Y/N):");
            playAgain = scanner.nextLine();
        }
        scanner.close();
    }
}