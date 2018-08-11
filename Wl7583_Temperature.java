public class Wl7583_Temperature {
	
	private double fahrenheit;
	private double celsius;
	
	public Wl7583_Temperature() {
		fahrenheit = 0;
		celsius = 0;
	}
	
	public void setFahrenheit(double temp) {
		fahrenheit = temp;
	}
	
	public void setCelsius(double temp) {
		celsius = temp;
	}
	
	public double getFahrenheit() {
		return celsius * 9 / 5 + 32;
	}
	
	public double getCelsius() {
		return (fahrenheit - 32) * 5 / 9;
	}
}