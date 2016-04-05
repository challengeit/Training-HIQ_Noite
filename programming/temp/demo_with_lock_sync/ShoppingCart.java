package demo_with_lock_sync;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
	
	private List<Item> _items = new ArrayList<>();
	
	private Object writer = new Object();
	private Object reader = new Object();
	
	public void addItem(Item item) {
		synchronized (writer) {
			_items.add(item);			
		}
	}
	
	public int getNumberOfItems() {
		synchronized (reader) {
			return _items.size();
		}
	}
	
	public String getSummary() {
		StringBuilder builder = new StringBuilder("Summary:\n");
		
		synchronized (reader) {
			for (Item item : _items) {
				if(item != null)
					builder.append(item.toString());
			}		
			builder.append("\nTotal: ").append(getTotal());
		}
			
		return builder.toString();
	}
	
	public double getTotal() {
		double total = 0;
		
		// Reentrant lock
		synchronized (reader) {
			for (Item item : _items) {
				if(item != null)
					total += item.getPrice();
			}			
		}
		
		return total;
	}
}
