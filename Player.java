package dice_Game;

public class Player {

	private int winStreak;
	private boolean lastwin;
	private int bestWinningStreak;
	private Dice d;
	
	Player(){
		winStreak = 0;
		lastwin = false;
		bestWinningStreak = 0;
		d = new Dice();
	}
	
	public int getWinStreak() {
		return winStreak;
	}
	
	public int getBestWinningStreak() {
		return bestWinningStreak;
	}
	
	public int roll() {
		return d.Roll();
	}
	
	public void results(boolean win) {
		if(win) {
			if(lastwin) {
				winStreak++;
				System.out.println("Streak is " + winStreak);
			}else {
				lastwin = true;
				winStreak = 1;
			}
			
			if(winStreak > bestWinningStreak) {
				bestWinningStreak = winStreak;
				System.out.println("New Record, Best Winning Streak updated to " + bestWinningStreak);
			}
		}else {
			
			winStreak = 0;
			lastwin = false;
		}
	}
	
}
