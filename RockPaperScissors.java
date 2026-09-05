import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Enter your choice:");
        System.out.println("1. Rock");
        System.out.println("2. Paper");
        System.out.println("3. Scissors");

        int playerChoice = sc.nextInt();

        int computerChoice = random.nextInt(3) + 1;

        String player;
        String computer;

        // Convert player's choice to a word
        if (playerChoice == 1) {
            player = "Rock";
        } else if (playerChoice == 2) {
            player = "Paper";
        } else {
            player = "Scissors";
        }

        // Convert computer's choice to a word
        if (computerChoice == 1) {
            computer = "Rock";
        } else if (computerChoice == 2) {
            computer = "Paper";
        } else {
            computer = "Scissors";
        }

        System.out.println("\nPlayer chose: " + player);
        System.out.println("Computer chose: " + computer);

        // Check the result
        if (playerChoice == computerChoice) {
            System.out.println("Draw");
        }
        else if ((playerChoice == 1 && computerChoice == 3) ||
                 (playerChoice == 2 && computerChoice == 1) ||
                 (playerChoice == 3 && computerChoice == 2)) {

            System.out.println("Player wins");
        }
        else {
            System.out.println("Computer wins");
        }

        sc.close();
    }
}

