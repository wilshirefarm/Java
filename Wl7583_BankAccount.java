public class Wl7583_BankAccount {
	
	private double balance;
	private String name;
	
	public Wl7583_BankAccount(String name) {
		balance = 0;
		this.name = name;
	}
	
	public Wl7583_BankAccount(String name, double initial) {
		balance = initial;
		this.name = name;
	}
	
	public void depositMoney(Object money) {
		if (money instanceof Double) {
			double moneyToDeposit = (double)money;
			balance = balance + moneyToDeposit;
			System.out.println("Deposit complete.");
		}
		else {
			System.out.println("Not a valid amount.");
		}
	}
	
	public void withdrawMoney(Object money) {
		if (money instanceof Double) {
			double moneyToDeposit = (double)money;
			if (balance > moneyToDeposit) {
				balance = balance - moneyToDeposit;
				System.out.println("Withdraw complete.");
			}
			else {
				System.out.println("You do not have enough money in your bank account.");
			}
		}
		else {
			System.out.println("Not a valid amount.");
		}
	}
	
	public String getBalance() {
		return "Account name: " + name + "\nBalance: $" + balance; 
	}
}