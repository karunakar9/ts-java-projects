package exceptionHandling;

public class Product {
	private int id;
	private double weight;
	private int price;
	public static int idGenerator;
	public Product() {
		super();
	}
	public Product(double weight, int price) {
		super();
		this.id=++idGenerator;
		this.weight = weight;
		this.price = price;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getId() {
		return id;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", weight=" + weight + ", price=" + price + "]";
	}
	
	

}
