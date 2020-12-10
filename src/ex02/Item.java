package ex02;

public class Item {
	private double price;
	private ItemType type;
	
	public Item(double price, ItemType type) {
		this.price = price;
		this.type = type;
	}
	
	public double getPrice() {
		return 0.0;
	}
	
	public ItemType getType() {
		return ItemType.Other;
	}
}
