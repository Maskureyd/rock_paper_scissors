import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Rock Paper Scissors!");
        System.out.print("Please enter your name:  ");
        String name = scanner.nextLine();

        Player player1 = new Player(name);
        Player player2 = new Player("Computer");

        while (true) {
            System.out.print(player1.getName() + ", please enter your move (rock, paper or scissors) : ");
            String move1 = scanner.nextLine();

            player1.makeMove(move1);

            String move2 = player2.makeRandomMove();

            String result = setResult(move1, move2);
            System.out.println("You: " + move1);
            System.out.println("Computer: " + move2);
            System.out.println(result);

            System.out.print("Do you want to play again? (YES/NO): ");
            String playAgain = scanner.nextLine();

            if (playAgain.equalsIgnoreCase("NO")) {
                break;
            }
        }
        System.out.println("The game is over, we are waiting for you again!");
    }

    private static String setResult(String move1, String move2) {
        if (move1.equals(move2)) {
            return "Draw!";
        } else if (move1.equals("rock")) {
            if (move2.equals("paper")) {
                return "Unfortunately, the paper wraps the stone, you lost!";
            } else {
                return "Congratulations, rock shears, you win!";
            }
        } else if (move1.equals("paper")) {
            if (move2.equals("scissors")) {
                return "Sorry, scissors cut the paper, you lost!";
            } else {
                return "Congratulations, the paper wraps the stone, you win!";
            }
        } else if (move1.equals("scissors")) {
            if (move2.equals("rock")) {
                return "Unfortunately, stone breaks scissors, you lost!";
            } else {
                return "Congratulations, scissors cut paper, you win!";
            }
        } else {
            return "Invalid move! Please enter 'rock', 'paper' or 'scissors'.";
        }
    }
}
