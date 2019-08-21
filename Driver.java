package dice_Game;

import java.util.Scanner;

public class Driver {
	
	static Scanner s = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		Player p1 = new Player();
		Player p2 = new Player();
		
		play(p1, p2);
	}
	
	private static void play(Player p1, Player p2) {
		
		System.out.println("press 0 to exit, 1 for Single Player, and 2 to 2 Players..........");

		int choice = s.nextInt();
		
		switch (choice) {
		case 0: 
			break;
		case 1:
			Singleplayer(p1, p2);
			break;
			
		case 2:
			multiPlayer(p1, p2);
			break;
		default:
			System.out.println("!!WrongChoice!!");
			System.out.println();
			play(p1, p2);
		}
		
		s.close();
		
	}

	private static void multiPlayer(Player p1, Player p2) {
		
		System.out.println("Decide among each other which one is Player 1 and other one is Player 2");
		
		System.out.println("Press any numerical key to begin");
		
		int n = s.nextInt();
		
		int p1num1 = p1.roll();
		System.out.println("Player 1 (Attempt 1) = " + p1num1);
		int p2num1 = p2.roll();
		System.out.println("Player 2 (Attempt 1) = " + p2num1);
		int p1num2 = p1.roll();
		System.out.println("Player 1 (Attempt 2) = " + p1num2);
		int p2num2 = p2.roll();
		System.out.println("Player 2 (Attempt 2) = " + p2num2);
		
		
		if((p1num1 + p1num2) == (p2num1 + p2num2)) {
			if(p2num1 + p2num2 == 7) {
				System.out.println(">> It's a Tie !!");
			}else {
				System.out.println(">> Nobody Won...");
			}
		}else if(p1num1 + p1num2 == 7) {
			System.out.println(">> Player 1 is the winner");
		}else if(p2num1 + p2num2 == 7) {
			System.out.println(">> Player 2 is the winner");
		}else {
			System.out.println(">> Nobody Won...");
		}
		
		p1.results(p1num1 + p1num2 == 7);
		p2.results(p2num1 + p2num2 == 7);
		
		play(p1, p2);
	}

	private static void Singleplayer(Player p1, Player p2) {
		
		int num1 = p1.roll();
		System.out.println("roll 1 : " + num1);
		int num2 = p1.roll();
		System.out.println("roll 2 : " + num2);
		
		p1.results(num1 + num2 == 7);
		
		play(p1, p2);
		
	}

}
