public class Wl7583_TempTester {
	
	public static void main(String[] args) {
		Wl7583_Temperature t1 = new Wl7583_Temperature();
		Wl7583_Temperature t2 = new Wl7583_Temperature();
		
		t1.setFahrenheit(68);
		System.out.println(t1.getCelsius());
		
		t2.setCelsius(100);
		System.out.println(t2.getFahrenheit());
	}
}