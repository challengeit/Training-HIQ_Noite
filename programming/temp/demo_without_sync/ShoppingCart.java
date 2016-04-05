package demo_without_sync;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
	
	private List<Item> _items = new ArrayList<>();
	
	public void addItem(Item item) {
		_items.add(item);
	}
	
	public String getSummary() {
		StringBuilder builder = new StringBuilder("Summary:\n");
		for (Item item : _items) {
			if(item != null)
				builder.append(item.toString());
		}
		
		builder.append("\nTotal: ").append(getTotal());
		return builder.toString();
	}
	
	public double getTotal() {
		double total = 0;
		for (Item item : _items) {
			if(item != null)
				total += item.getPrice();
		}
		
		return total;
	}
}
