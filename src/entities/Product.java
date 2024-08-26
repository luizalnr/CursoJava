package entities;
 
public class Product { 
	private String name;
	private double price;
	private int quantity;
	
	public Product() {
	}
	public Product(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	public Product(String name, double price) {
		this.name = name;
		this.price = price;
		//como a linguagem comeca a contagem pelo numero 0,
		//nao eh necessario "quantity = 0;", pq ja esta sendo 0!!
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
	public void setPrice(Double price) {
		this.price = price;
	}
	
	public int getQuantity() {
		return quantity;
	}

	
	
	public double totalValueInStock() {
		return price * quantity;
	}
	public void addProducts(int quantity) {
		//acessa o atributo da class Product += parametro int quantity
		this.quantity += quantity; 
	}
	public void removeProducts(int quantity) {
		this.quantity -= quantity;
	}
	public String toString() {
		return name
			+ ", $ "
			+ String.format("%.2f", price)
			+ ", "
			+ quantity 
			+ " units, Total: $ "
			+ String.format("%.2f", totalValueInStock());
	}
}








