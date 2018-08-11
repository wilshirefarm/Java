import java.util.ArrayList;

public class Wl7583_Shopping_Cart {
	
	private ArrayList<Object> items;
	
	public Wl7583_Shopping_Cart() {
		this.items = new ArrayList<Object>();
	}
	
	public Wl7583_Shopping_Cart(ArrayList<Object> itemsPassedIn) {
		this();
		for (Object cartItemObject : itemsPassedIn) {
			Wl7583_Sellable item = (Wl7583_Sellable) cartItemObject;
			addItemToCart(item);
		}
	}
	
	public void addItemToCart(Wl7583_Sellable item) {
		items.add(item);
		System.out.println("Added " + item.getName() + " costing $" + item.getPrice() + " to cart.");
	}
	
	public int getCartItemCount() {
		return items.size();
	}
	
	public int getCartTotalPrice() {
		int total = 0;
		for (Object cartItem : items) {
			Wl7583_Sellable item = (Wl7583_Sellable) cartItem;
			total = total + item.getPrice();
		}
		return total;
	}
	
	public void printToScreen() {
		for (Object cartItem : items) {
			Wl7583_Sellable item = (Wl7583_Sellable) cartItem;
			System.out.println("Item Name: " + item.getName());
            System.out.println("Price: $" + item.getPrice());
		}
	}
}