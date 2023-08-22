import java.util.*;
public class RockPaperScissorsGame {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    while(true) {
        String[] availableMoves = {"ROCK", "PAPER", "SCISSORS"};
    
      String computerMove = availableMoves[new Random().nextInt(availableMoves.length)];

      System.out.println("Computer has chosen it's move.");
      System.out.println();
      System.out.println("Now it's your turn to make your choice. Best of Luck ! ");
      System.out.println();
    
      String userMove;
      while(true) {
        System.out.println("Please choose your move from these available moves : 'ROCK' 'PAPER' 'SCISSORS' ");
        System.out.println("Enter your move : ");
        userMove = sc.nextLine();

        if (userMove.equals("ROCK") || userMove.equals("PAPER") || userMove.equals("SCISSORS")) {
            System.out.println();
            break;
        }
        
            System.out.println();
            System.out.println("Invalid Move!! Please enter available moves only !");
            System.out.println();
        }
        System.out.println("Computer chose : " + computerMove);
		
			if(userMove.equals(computerMove)) {
				System.out.println("Its a tie!");
			}
		    else if(userMove.equals("ROCK")) {
			
				if(computerMove.equals("PAPER")) {
					System.out.println("Computer won!");
					System.out.println("Better luck next time!");
				} 
				else if(computerMove.equals("SCISSORS")) {
					System.out.println("You won!");
					System.out.println("Congratulations!");
				}
			}
		
			else if(userMove.equals("PAPER")) {
			
				if(computerMove.equals("ROCK")) {
					System.out.println("You won!");
					System.out.println("Congratulations!");
				} 
				else if(computerMove.equals("SCISSORS")) {
					System.out.println("Computer won!");
					System.out.println("Better luck next time!");
				}
			}
		
			else if(userMove.equals("SCISSORS")) {
			
				if(computerMove.equals("PAPER")) {
					System.out.println("You won!");
					System.out.println("Congratulations!");
				} 
				else if(computerMove.equals("ROCK")) {
					System.out.println("Computer won!");
					System.out.println("Better luck next time!");
				}
			}
			
			System.out.println();
			String playAgain;
			System.out.println("Do you want to play again? ");
			
			while(true) {
				
				System.out.println("Type 'yes' or 'no' ");
				playAgain = sc.nextLine();
				
				if(playAgain.equals("yes") || playAgain.equals("Yes") || playAgain.equals("no") || playAgain.equals("No")) {
					System.out.println();
					System.out.println("*****************************************************************************");
					System.out.println();
					break;
				}
				System.out.println();
				System.out.println("Invalid Input");
				System.out.println();
			}
			
			if(playAgain.equals("no") || playAgain.equals("No")) {
				break;
			}
		}
	}
  }

      