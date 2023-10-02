package Oasis;
import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int lowerBound = 1;
        int upperBound = 100;
        int targetNumber = random.nextInt(upperBound - lowerBound + 1) + lowerBound;
        int attempts = 0;
        int maxAttempts = 10; 
        int score = 0;
        boolean hasGuessedCorrectly = false;

        System.out.println("Welcome to Guess the Number!");
        System.out.println("I have selected a random number between " + lowerBound + " and " + upperBound + ". Try to guess it.");

        while (attempts < maxAttempts) {
            System.out.print("Enter your guess: ");
            int userGuess = scanner.nextInt();
            attempts++;

            if (userGuess == targetNumber) {
                hasGuessedCorrectly = true;
                score += maxAttempts - attempts + 1; 
                break;
            } else if (userGuess < targetNumber) {
                System.out.println("The target number is higher.");
            } else {
                System.out.println("The target number is lower.");
            }
        }

        if (hasGuessedCorrectly) {
            System.out.println("Congratulations! You've guessed the number correctly.");
            System.out.println("Your score is: " + score);
        } else {
            System.out.println("Sorry, you've run out of attempts. The correct number was: " + targetNumber);
        }

        scanner.close();
    }
}

