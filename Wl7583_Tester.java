import java.util.ArrayList;

public class Wl7583_Tester {
	public static void main(String[] args) {
		System.out.println("---------------------------");
		Wl7583_Product p1 = new Wl7583_Product("Bling Bling Jeans", 100);
		Wl7583_Event e1 = new Wl7583_Event("Fashion Training", 5, 200);
		
		Wl7583_Shopping_Cart cart = new Wl7583_Shopping_Cart();
		cart.addItemToCart(p1);
		cart.addItemToCart(e1);
		print(cart);
		System.out.println("---------------------------");
		ArrayList items = new ArrayList();
		items.add(new Wl7583_Product("Dance Video", 50));
		items.add(new Wl7583_Event("Rumba Class", 5, 100));
		items.add(p1);
		items.add(e1);
		Wl7583_Shopping_Cart cart2 = new Wl7583_Shopping_Cart(items);
		print(cart2);
		System.out.println("----------------------------");
        
        //cart2.printToScreen();
	}
	
	private static void print(Wl7583_Shopping_Cart cart) {
		System.out.println("Number of cart items is: " + cart.getCartItemCount());
		System.out.println("Total price of cart items is: $" + cart.getCartTotalPrice());
	}
}