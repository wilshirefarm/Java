public class Wl7583_BankTester {
	
	public static void main(String[] args) {
		
		Wl7583_BankAccount b1 = new Wl7583_BankAccount("Checking", 10250.67);
		Wl7583_BankAccount b2 = new Wl7583_BankAccount("Savings", 217.38);
		
		b1.depositMoney(1234.45);
		b2.withdrawMoney(220.00);
		System.out.println(b2.getBalance());
	}
}