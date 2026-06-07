import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {
        boolean isGuessing = true;
        int guessCounter = 0;
        int computerGuess = (int)(Math.random() * 100) + 1;
        Scanner userGuess = new Scanner(System.in);
        System.out.println("Number Guessing Game");
        System.out.println("--------------------");

        while (isGuessing) {
            System.out.print("Guess a number between 1-100: ");
            int num = userGuess.nextInt();
        }
    }
    
}