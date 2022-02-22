package entities;

public class Product {

	private String name;
	private Double price;
	
	public Product() {
	}

	public Product(String name, Double price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [name=" + name + ", price=" + String.format("%.2f",price) + "]";
	}
	
	// Modo 02 - Reference Method com Metodo Estatico
	public static void staticPriceUpdate(Product p) {
		p.setPrice(p.getPrice() * 1.1);
	}
	
	// Modo 03 - Reference Method com Metodo N�o Estatico
	public  void noStaticPriceUpdate() {
		price = (price * 1.1);
	}
}