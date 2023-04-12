package com.cyr.Features;

import java.util.ArrayList;
import java.util.List;

class Product7 {
	int id;
	String name;
	float price;

	public Product7(int id, String name, float price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}
}

public class StreamExample7 {
	public static void main(String[] args) {
		List<Product> productsList = new ArrayList<Product>();
		productsList.add(new Product(1, "HP Laptop", 25000f));
		productsList.add(new Product(2, "Dell Laptop", 30000f));
		productsList.add(new Product(3, "Lenevo Laptop", 28000f));
		productsList.add(new Product(4, "Sony Laptop", 28000f));
		productsList.add(new Product(5, "Apple Laptop", 90000f));
		long count = productsList.stream().filter(product -> product.price < 30000).count();
		System.out.println(count);
	}
}
