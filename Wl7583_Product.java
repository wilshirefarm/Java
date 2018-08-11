public class Wl7583_Product implements Wl7583_Sellable {
	
	String name;
	int price;
	
	public Wl7583_Product(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	public int getPrice() {
		return price;
	}
	
	public String getName() {
		return name;
	}
}