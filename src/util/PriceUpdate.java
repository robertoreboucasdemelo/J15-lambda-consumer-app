package util;

import java.util.function.Consumer;

import entities.Product;

public class PriceUpdate implements Consumer<Product> {

	// Modo 01 - Implementação via Interface
	
	@Override
	public void accept(Product p) {
		p.setPrice(p.getPrice() * 1.1);
	}
}
