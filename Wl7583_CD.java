public class Wl7583_CD {
	
	private double balance;
	private final double interestRate = 0.07;
	
	public Wl7583_CD(double balance) {
		this.balance = balance;
	}
	
	public void addAnnualInterest() {
		double toAdd = balance * interestRate;
		balance = balance + toAdd;
		System.out.println("Interest of $" + toAdd + " was added.\nCurrent balance is now $" + balance);
	}
	
	public String getBalance() {
		return "Balance: $" + balance;
	}
}