
package dice_Game;

import java.util.Random;

public class Dice {
	
	int diceValue;
	
	public int Roll() {
		
		Random num = new Random();
		
		return (num.nextInt(6)+1);
		//it generates random num from 0 - (num providerd-1)
		//for eg. 1000 --> (0-999)
	}
}
