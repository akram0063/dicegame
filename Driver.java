package dice_Game;

import java.util.Scanner;

public class Driver {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("Enter your name: ");
		
		String name = s.next();
		
		Player p = new Player(name);
		
		play(p, s);
		s.close();
	}

	private static void play(Player p, Scanner s) {
		
		Dice d = new Dice();
		
		int roll1 = d.Roll();
		int roll2 = d.Roll();
		
		System.out.println("roll1(" + roll1 + ") + roll2(" + roll2 + ") = " + (roll1+roll2));
		
		if(roll1 + roll2 == 7) {
			if(p.lastwin) {
				p.winStreak++;
			}else {
				p.lastwin = true;
				p.winStreak = 1;
			}
			
			System.out.println("Great, you have just won! Your winning steak: " + p.winStreak);
		}else {
			if(p.lastwin) {
				System.out.println("your winning streak got broke!!");
			}
			p.winStreak = 0;
			p.lastwin = false;
			
			System.out.println("Loose!, better luck next time");
		}
		
		
		System.out.println("Your winning streak: " + p.winStreak + ", Press 1 to play again");
		if(s.nextInt() == 1) {
			play(p, s);
		}
		
	}

}
