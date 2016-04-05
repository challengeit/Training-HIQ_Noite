package demo_with_lock_sync;

public class Item {
	
	private final String _description;
	private final double _price;
	
	public Item(String description, double price) {
		_description = description;
		_price = price;
	}
	
	public String getDescription() {
		return _description;
	}
	
	public double getPrice() {
		return _price;
	}
	
	@Override
	public String toString() {
		return new StringBuilder("[description: ")
					.append(getDescription())
					.append(", price: ")
					.append(getPrice())
					.append("]")
					.toString();
	}
}
