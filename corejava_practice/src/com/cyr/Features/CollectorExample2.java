package com.cyr.Features;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Product12 {
	int id;
	String name;
	float price;

	public Product12(int id, String name, float price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}
}

public class CollectorExample2 {
	public static void main(String[] args) {
		List<Product> productsList = new ArrayList<Product>();
		productsList.add(new Product(1, "HP Laptop", 25000f));
		productsList.add(new Product(2, "Dell Laptop", 30000f));
		productsList.add(new Product(3, "Lenevo Laptop", 28000f));
		productsList.add(new Product(4, "Sony Laptop", 28000f));
		productsList.add(new Product(5, "Apple Laptop", 90000f));
		Double sumPrices = productsList.stream().collect(Collectors.summingDouble(x -> x.price));
		System.out.println("Sum of prices: " + sumPrices);
		Integer sumId = productsList.stream().collect(Collectors.summingInt(x -> x.id));
		System.out.println("sum of id's: " + sumId);

	}
}
