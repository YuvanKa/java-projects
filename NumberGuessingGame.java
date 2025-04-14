import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean playAgain = true;
        int totalRounds = 0;
        int totalAttempts = 0;

        while (playAgain) {
            totalRounds++;
            int attempts = playGame(scanner);

            if (attempts != -1) {
                totalAttempts += attempts;
            }

            System.out.print("Do you want to play again? (yes/no): ");
            playAgain = scanner.next().equalsIgnoreCase("yes");
        }

        if (totalRounds > 0) {
            double averageAttempts = (double) totalAttempts / totalRounds;
            System.out.printf("You played %d rounds with an average of %.2f attempts per round.%n", totalRounds, averageAttempts);
        } else {
            System.out.println("You did not play any rounds.");
        }

        scanner.close();
    }

    private static int playGame(Scanner scanner) {
        Random random = new Random();
        int numberToGuess = random.nextInt(100) + 1;
        int attempts = 0;
        int maxAttempts = 10;

        System.out.println("I'm thinking of a number between 1 and 100.");
        System.out.printf("You have %d attempts to guess it.%n", maxAttempts);

        while (attempts < maxAttempts) {
            attempts++;
            System.out.printf("Attempt %d: Enter your guess: ", attempts);
            int guess = scanner.nextInt();

            if (guess < numberToGuess) {
                System.out.println("Too low!");
            } else if (guess > numberToGuess) {
                System.out.println("Too high!");
            } else {
                System.out.printf("Congratulations! You guessed the number in %d attempts.%n", attempts);
                return attempts;
            }
        }

        System.out.printf("Sorry, you've used all %d attempts. The number was %d.%n", maxAttempts, numberToGuess);
        return -1;
    }
}
