package com.cyr.Features;

import java.util.ArrayList;
import java.util.List;

class Product3 {
	int id;
	String name;
	float price;

	public Product3(int id, String name, float price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}
}

public class StreamExample3 {
@SuppressWarnings({ "unchecked", "rawtypes" })
public static void main(String[] args) {
List<Product> productsList = new ArrayList();
productsList.add(new Product(1,"Hp Laptop",25000f));
productsList.add(new Product (2,"Dell Laptop",30000f));
productsList.add(new Product (3,"Lenovo Laptop",28000f));
productsList.add(new Product (4,"Sony Laptop",28000f));
productsList.add(new Product(5,"Apple Laptop",90000f));
productsList.stream()
    .filter(product -> product.price == 30000) 
     .forEach(product->System.out.println(product.name));

}
}
