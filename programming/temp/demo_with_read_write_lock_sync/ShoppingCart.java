package demo_with_read_write_lock_sync;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ShoppingCart {
	
	private List<Item> _items = new ArrayList<>();
	
	private ReadWriteLock lock = new ReentrantReadWriteLock(true);
	
	public void addItem(Item item) {
		lock.writeLock().lock();
		_items.add(item);			
		lock.writeLock().unlock();
	}
	
	public int getNumberOfItems() {
		int size;
		lock.readLock().lock();
		size = _items.size();
		lock.readLock().unlock();
		return size;
	}
	
	public String getSummary() {
		StringBuilder builder = new StringBuilder("Summary:\n");
		
		lock.readLock().lock();
		for (Item item : _items) {
			if(item != null)
				builder.append(item.toString());
		}
		
		builder.append("\nTotal: ").append(getTotal());
		lock.readLock().unlock();

		return builder.toString();
	}
	
	public double getTotal() {
		double total = 0;
		
		// Reentrant lock
		lock.readLock().lock();
		for (Item item : _items) {
			if(item != null)
				total += item.getPrice();
		}
	
		lock.readLock().unlock();
		
		return total;
	}
}
