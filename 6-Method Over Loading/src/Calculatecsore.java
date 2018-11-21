
public class Calculatecsore {

	public static void main(String[] args) {
		
		int newScore = calculateScore("Omer", 500);
		System.out.println("New score is " + newScore);
		
		calculateScore(75);
		calculateScore(); 
		

	}
	
	public static int calculateScore(String playerName, int score) {
		System.out.println("Player "+ playerName + " scored " + score + " points.");
		return score*100;
	}
	
	public static int calculateScore(int score) {
		System.out.println("Unnamed Player Scored "+ score + " points.");
		return score*100;
	}
	
	public static void calculateScore() {
		System.out.println("No player name, No player score.");
	}
	

}
