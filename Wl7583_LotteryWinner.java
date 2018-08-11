import java.util.List;
import java.util.Collections;
import java.util.Arrays;

public class Wl7583_LotteryWinner {
	
	Integer[] winningLotteryNumbers = new Integer[5];
	
	public Wl7583_LotteryWinner() {
		winningLotteryNumbers[0] = 10;
		winningLotteryNumbers[1] = 20;
		winningLotteryNumbers[2] = 30;
		winningLotteryNumbers[3] = 40;
		winningLotteryNumbers[4] = 50;
	}
	
	public void checkWinnings(int[] numbers) {
		int matches = 0;
		int winnings = 0;
		List<Integer> numberList = Arrays.asList(winningLotteryNumbers);
		for (int number : numbers) {
			if (numberList.contains(number)) {
				matches++;
			}
		}
		if (matches == 0) { winnings = 0; }
		if (matches == 1) { winnings = 10; }
		if (matches == 2) { winnings = 25; }
		if (matches == 3) { winnings = 50; }
		if (matches == 4) { winnings = 1000; }
		if (matches == 5) { winnings = 10000; }
		System.out.println("You have " + matches + " matches. You won $" + winnings + ".");
	}
}