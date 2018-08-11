public class Wl7583_LotteryTester {
	
	public static void main (String[] args) {
		
		Wl7583_LotteryWinner lw = new Wl7583_LotteryWinner();
		int[] threeMatches = {10, 20, 30, 100, 200};
		int[] fiveMatches = {10, 20, 30, 40, 50};
		int[] noMatches = {1, 2, 3, 4, 5};
		lw.checkWinnings(threeMatches);
		lw.checkWinnings(fiveMatches);
		lw.checkWinnings(noMatches);
	}
}