package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Consumer;
import java.util.function.Predicate;

import entities.Product;
import util.PriceUpdate;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);

		List<Product> list = new ArrayList<>();

		list.add(new Product("TV", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 450.00));
		list.add(new Product("HD Case", 80.90));
		
		// Modo 01 - Implementação via Interface
		list.forEach(new PriceUpdate());
		
		// Modo 02 - Reference Method com Metodo Estatico
		list.forEach(Product:: staticPriceUpdate);

		// Modo 03 - Reference Method com Metodo Não Estatico
		list.forEach(Product:: noStaticPriceUpdate);
		
		// Modo 04 - Expressão Lambda Declarada
		Consumer<Product> cons = p -> p.setPrice(p.getPrice() * 1.1);
		list.forEach(cons);
		
		// Modo 05 - Expressão Lambda Inline
		list.forEach(p -> p.setPrice(p.getPrice() * 1.1));
		
		list.forEach(System.out::println);
	}
}
