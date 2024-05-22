import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int numberToGuess = random.nextInt(100) + 1; // Generate a random number between 1 and 100
        int attempts = 0;
        int score = 100; // Start with a perfect score

        System.out.println("I'm thinking of a number between 1 and 100. You have 5 attempts to guess it.");

        while (attempts < 5) {
            System.out.print("Enter your guess: ");
            int guess = scanner.nextInt();
            attempts++;

            if (guess < numberToGuess) {
                System.out.println("Too low! Try again.");
                score -= 10; // Penalize for incorrect guess
            } else if (guess > numberToGuess) {
                System.out.println("Too high! Try again.");
                score -= 10; // Penalize for incorrect guess
            } else {
                System.out.println("Congratulations! You guessed the number in " + attempts + " attempts.");
                System.out.println("Your score is: " + score);
                return;
            }
        }

        System.out.println("Sorry, you didn't guess the number. The number was " + numberToGuess);
    }
}



