package dice_Game;

public class Player {

	private String name;
//	private int numWin;
//	private int numLoss;
	int winStreak;
	boolean lastwin = false;
//	int record;
	
	Player(String name){
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public int getWinStreak() {
		return winStreak;
	}
	
	private void changeName(String name) {

		this.name = name;

	}
	
}
