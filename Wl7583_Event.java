public class Wl7583_Event implements Wl7583_Sellable {
	
	String name;
	int days;
	int pricePerDay;
	
	public Wl7583_Event(String name, int days, int pricePerDay) {
		this.name = name;
		this.days = days;
		this.pricePerDay = pricePerDay;
	}
	
	public int getPrice() {
		return days * pricePerDay;
	}
	
	public String getName() {
		return name;
	}
}