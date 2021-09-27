package service;

import models.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductService {

	public static List<Product> getProducts() {

		List<Product> productList = new ArrayList<Product>();

		// Product Data

		// Path to pic: C:\\dev\\repos\\DAT152-Oblig1\\DAT152-Obligatorisk2\\WebContent\\WEB-INF\\pics\\sony.png
		Product p1 = new Product(1, "Sony-Headset", 150.0,
				"https://www.sony.no/image/134a2eefe22c3000f28cf57296b6bcb5?fmt=png-alpha&wid=240");

		Product p2 = new Product(2, "Beer", 2.3, "data:image/jpeg;base64,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");

		Product p3 = new Product(3, "Sauce-Pan", 39.90, "data:image/jpeg;base64,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");

		productList.add(p1);
		productList.add(p2);
		productList.add(p3);
		return productList;

	}

}
