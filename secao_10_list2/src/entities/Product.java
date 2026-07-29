package entities;

public class Product {

	private Integer code;
	private String name;
	private Double price;
	private Integer quantity;

	public Product(Integer code, String name, Double price, Integer quantity) {
		this.code = code;
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	
	public Double getPrice() {
		return price;
	}
	
	public void applyDiscount(double percentage) {
		price -= price * percentage / 100;
	}
	
	public double totalValueInStock() {
		return price * quantity;
	}

	@Override
	public String toString() {
		return "Product [code=" + code + ", name=" + name + ", price=" + price + ", quantity=" + quantity + "]";
	}
	
	

}
