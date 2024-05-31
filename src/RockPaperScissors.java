import java.util.Random; //Import Random for computer option
import java.util.Scanner; //Import Scanner for User move and While loop rematch

public class RockPaperScissors{
    public static void main(String[] args) {
        //Scanner will be used only for User move and rematch
        Scanner scanner = new Scanner(System.in);

        while (true) {
            //Randomize computer, r=rock, p=paper, s=scissors
            String[] rps = {"rock", "paper", "scissor"};
            //String for computer to choose a random from String rps
            String computerMove = rps[new Random().nextInt(rps.length)];
            //String will capture users move
            String playerMove;
            //This is a while loop to play again
            while(true) {
                //We request user to enter the move
                System.out.println("Please enter your move (rock, paper, or scissor)");
                playerMove = scanner.nextLine();

                //We are going to validate the entrance from the user move
                if (playerMove.equals("rock") || playerMove.equals("paper") || playerMove.equals("scissor")) {
                    break;
                }
                //User invalid move
                System.out.println(playerMove + " is not an invalid move.");
            }
            //This is what computer chose (random move)
            System.out.println("Computer played: " + computerMove);
            //We are gonna check if its a tie
            if (playerMove.equals(computerMove)) {
                System.out.println("Tie!");
            }
            //Validate that computer chose P and user R (computer wins)
            else if (playerMove.equals("rock")) {
                if (computerMove.equals("paper")) {
                    System.out.println("Computer Wins!");
                //Validate that usar chose S (User wins)
                } else if (computerMove.equals("scissor")) {
                    System.out.println("You win!");
                }
            }
            //Validate that computer chose R and user P (User wins)
            else if (playerMove.equals("paper")) {
                if (computerMove.equals("rock")) {
                    System.out.println("You win!");
                //Validate that computer chose S and user P (computer wins)
                } else if (computerMove.equals("scissor")) {
                    System.out.println("You lose!");
                }
            }
            //Validate that computer chose P and user S (User wins)
            else if (playerMove.equals("scissor")) {
                if (computerMove.equals("paper")) {
                    System.out.println("You win!");
                //Validate that computer chose R and user S (computer wins)
                } else if (computerMove.equals("rock")) {
                    System.out.println("You lose!");
                }
            }
            //Computer ask user for a rematch
            System.out.println("Rematch? (yes/no)");
            //We capture answer
            String playAgain = scanner.nextLine();
            //Anser equal yes while loop starts again
            if (!playAgain.equals("yes")) {
                break;
            }
        }
        scanner.close();
    }
}