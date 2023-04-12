package com.cyr.Features;

import java.util.ArrayList;
import java.util.List;

class Product {
	int id;
	String name;
	float price;

	public Product(int id, String name, float price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}
}

public class JavaStreamExample {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		List<Product> productlist = new ArrayList<Product>();
		productlist.add(new Product(1, "HP Laptop", 25000f));
		productlist.add(new Product(2, "Dell Laptop", 30000f));
		productlist.add(new Product(3, "Lenovo Laptop", 28000f));
		productlist.add(new Product(4, "Sony Laptop", 28000f));
		productlist.add(new Product(5, "Apple Laptop", 90000f));
		List<Float> productpricelist = new ArrayList<Float>();
		for (Product product : productlist) {
			if (product.price < 30000) {
				productpricelist.add(product.price);
			}
		}
		System.out.println(productpricelist);
	}
}
