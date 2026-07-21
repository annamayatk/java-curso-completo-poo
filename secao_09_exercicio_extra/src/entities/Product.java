package entities;

public class Product {

	private int code;
	private String name;
	private double price;
	private int inStock;

	
	public Product(int code, String name, double price) {
		this.code = code;
		this.name = name;
		this.price = price;
	}

	public Product(int code, String name, double price, int initialQuantity) {
		this.code = code;
		this.name = name;
		this.price = price;
		receiveGoods(initialQuantity);
	}

	public int getCode() {
		return code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		if (price > 0)
			this.price = price;
	}
	
	public int getStock() {
		return inStock;
	}

	public void receiveGoods(int quantity) {
		inStock += quantity;
	}

	public void issueGoods(int quantity) {
		if (inStock >= quantity)
			inStock -= quantity;
	}
	
	public String toString() {
		return "Product "
			+ getCode()
			+ ", "
			+ getName()
			+ String.format(", price: $ %.2f, ", getPrice())
			+ "quantity: "
			+ getStock()
			+ " units";
	}

}
