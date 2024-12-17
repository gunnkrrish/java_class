import java.util.Scanner;
import java.util.Random;

public class Game {
    public static void main(String[] args) {
        String[] rps = {"rock", "paper", "scissors"};
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        while (true) {
            System.out.println("Enter move (rock, paper, scissors). To exit the game, type exit: ");
            String userMove = scanner.nextLine();

            if (userMove.equals("exit")) {
                break;
            }

            if (!userMove.equals("rock") && !userMove.equals("paper") && !userMove.equals("scissors")) {
                System.out.println("Invalid move, please try again.");
                continue;
            }

            int compMoveIndex = random.nextInt(3);
            String compMove = rps[compMoveIndex];

            System.out.println("Computer move: " + compMove);

            if (userMove.equals(compMove)) {
                System.out.println("It's a tie!");
            } else if (userMove.equals("rock") && compMove.equals("scissors") ||
                       userMove.equals("paper") && compMove.equals("rock") ||
                       userMove.equals("scissors") && compMove.equals("paper")) {
                System.out.println("You win!");
            } else {
                System.out.println("You lose!");
            }
        }

        scanner.close();
    }
}

/*using random function  */


// import java.util.Random;
// import java.util.Scanner;

// public class Main {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         Random random = new Random();

//         String[] options = {"rock", "paper", "scissors"};
        
//         System.out.println("Welcome to Rock-Paper-Scissors!");
//         System.out.print("Enter your choice (rock, paper, scissors): ");
//         String userChoice = scanner.nextLine().toLowerCase();

//         // Generate computer's choice
//         String computerChoice = options[random.nextInt(options.length)];
//         System.out.println("Computer chose: " + computerChoice);

//         // Determine the winner
//         if (userChoice.equals(computerChoice)) {
//             System.out.println("It's a tie!");
//         } else if ((userChoice.equals("rock") && computerChoice.equals("scissors")) ||
//                    (userChoice.equals("paper") && computerChoice.equals("rock")) ||
//                    (userChoice.equals("scissors") && computerChoice.equals("paper"))) {
//             System.out.println("You win!");
//         } else {
//             System.out.println("You lose!");
//         }

//         // Close the scanner
//         scanner.close();
//     }
// }