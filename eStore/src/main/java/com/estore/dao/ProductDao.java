package com.estore.dao;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.estore.model.Product;

public class ProductDao {
	
	private List<Product> productList;
	
	public List<Product> getProductList() {
		
		productList = new ArrayList<Product>();
		
		Product product1 = new Product();
		product1.setId("P101");
		product1.setName("Guitar");
		product1.setCategory("Instrument");
		product1.setDescription("This is an awesome guitar!");
		product1.setCondition("New");
		product1.setStatus("Active");
		product1.setManufacturer("Fender");
		product1.setPrice(1000);
		product1.setUnitInStock(10);
		productList.add(product1);
		
		Product product2 = new Product();
		product2.setId("P102");
		product2.setName("Wireless Mouse");
		product2.setCategory("Electronics");
		product2.setDescription("This is an awesome Mouse!");
		product2.setCondition("New");
		product2.setStatus("Active");
		product2.setManufacturer("Logitech");
		product2.setPrice(2000);
		product2.setUnitInStock(20);
		productList.add(product2);
		
		Product product3 = new Product();
		product3.setId("P103");
		product3.setName("iPhone 7");
		product3.setCategory("Mobile phones");
		product3.setDescription("This is an awesome iPhone!");
		product3.setCondition("New");
		product3.setStatus("Active");
		product3.setManufacturer("Apple");
		product3.setPrice(3000);
		product3.setUnitInStock(30);
		productList.add(product3);
		
		return productList;
	}
	
	public Product getProductById(String id) throws IOException {
		for(Product product : getProductList()) {
			if(product.getId().equals(id)) {
				return product;
			}
		}
		
		throw new IOException("No product found.");
	}
	
}
