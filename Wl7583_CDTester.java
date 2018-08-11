public class Wl7583_CDTester {
	
	public static void main(String[] args) {
		
		Wl7583_CD cd = new Wl7583_CD(150070.38);
		System.out.println(cd.getBalance());
		cd.addAnnualInterest();
		cd.addAnnualInterest();
	}
}