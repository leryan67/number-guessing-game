import java.util.Scanner;

public class GuessingGame {
    private static int bestGuessCount = Integer.MAX_VALUE;
    public static void main(String[] args) {
        boolean isPlaying = true;
        Scanner input = new Scanner(System.in);
        System.out.println("Number Guessing Game");
        System.out.println("--------------------");

        while (isPlaying) {           
            boolean isGuessing = true;
            int guessCounter = 0;
            int computerGuess = (int)(Math.random() * 100) + 1;

            while (isGuessing) {
                System.out.print("Guess a number between 1-100: ");
                int num = input.nextInt();
                guessCounter++;

                if (num < 1 || num > 100) {
                    System.out.println("This guess is out of the range. Guess again.");
                }
                else if (num < computerGuess) {
                    System.out.println("Guess higher than " + num + ".");
                }
                else if (num > computerGuess) {
                    System.out.println("Guess lower than " + num + ".");
                }
                else {
                    System.out.println("Congrats! You guessed the number " + num + " in " + guessCounter + " attempts!");
                
                    if (bestGuessCount == Integer.MAX_VALUE) {
                        System.out.println("Your new high score is " + guessCounter + " guesses!");
                        bestGuessCount = guessCounter;
                    }
                    else if (guessCounter < bestGuessCount) {
                        System.out.println("Wow, you beat your previous record of " + bestGuessCount + " guesses!");
                        bestGuessCount = guessCounter;
                    }
                    else if (guessCounter == bestGuessCount) {
                        System.out.println("Unfortunate! You tied your best score of " + bestGuessCount + " guesses.");
                    }
                    else {
                        System.out.println("Nice try. Your best score so far is " + bestGuessCount + " guesses.");
                    }
                
                    isGuessing = false;
                }
            }

            System.out.println("\nWould you like to play again? (yes/no): ");
            input.nextLine();
            String choice = input.nextLine();
            if (choice.equals("yes")) {
                System.out.println("\nStarting a new game!\n");
            }
            else {
                isPlaying = false;
                System.out.println("Thanks for playing! Goodbye.");
            }
        }
        
        input.close();
    }
    
}