//This is a basic game of rock paper scissors. Remember, string comparison in java is not done normally!!
package loops;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {

	public static void main(String[] args) {
		Random random=new Random();
		Scanner reads=new Scanner(System.in);

		boolean playagain=true;
		String player;
		String computer;
	    String play;
		
		while(playagain) {
			player="";
			computer="";
			play="";
			
			while (!player.equals("ROCK") && !player.equals("PAPER") && !player.equals("SCISSORS")){	//This line makes sure the user can only enter one of the 3 choices.
				System.out.println("Enter ROCK, PAPER or SCISSORS");
				player=reads.nextLine();
				player=player.toUpperCase();
				
			}
			
			int randomNum=random.nextInt(3) + 1;
			switch(randomNum) {
			case 1:
				computer="ROCK";
				break;
			case 2:
				computer="PAPER";
				break;
			case 3:
				computer="SCISSORS";
				break;
			}
			
			
			System.out.println("Player: "+player);
			System.out.println("Computer: "+computer);
			
			//Logic to determine the winner
			switch(player) {
			case "ROCK":
				if(computer=="ROCK")
					System.out.println("TIE!");
				if(computer=="PAPER")
					System.out.println("You lose!");
				if(computer=="SCISSORS")
					System.out.println("You Win!");
				break;
				
			case "PAPER":
				if(computer=="ROCK")
					System.out.println("You Win!");
				if(computer=="PAPER")
					System.out.println("TIE");
				if(computer=="SCISSORS")
					System.out.println("You lose!");
				break;
			case "SCISSORS":
				if(computer=="ROCK")
					System.out.println("You lose!");
				if(computer=="PAPER")
					System.out.println("You Win!");
				if(computer=="SCISSORS")
					System.out.println("TIE");
				
				break;
			}
			System.out.print("Do you want to play again? YES/NO: ");
			play=reads.nextLine();
			play=play.toUpperCase();
			if(play.equals("YES"))
				playagain=true;
			else
				playagain=false;
			
		}
		
		System.out.println("Thanks for playing!");

	}

}
