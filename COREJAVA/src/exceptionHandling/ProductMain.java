package exceptionHandling;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ProductMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Product> listOfProducts = new ArrayList<>();
		List<Product> listOfProducts1 = new ArrayList<>();
		listOfProducts.add(new Product(120, 654));
		listOfProducts.add(new Product(205, 65));
		listOfProducts.add(new Product(234, 54));
		listOfProducts.add(new Product(126, 12));
		listOfProducts.add(new Product(900, 234));
		listOfProducts.add(new Product(96, 654));
		listOfProducts.add(new Product(690, 654));
		listOfProducts.add(new Product(10, 156));
		listOfProducts.add(new Product(908, 742));
		Iterator<Product> productItr = listOfProducts.iterator();
		while (productItr.hasNext()) {
			Product P = productItr.next();
			try {
				validProduct(P);
			} catch (InvalidProductException e) {
				System.out.println(e);
				productItr.remove();

				listOfProducts1.add(P);

			}

		}
		System.out.println("invalid products");
		System.out.println(listOfProducts1);
		System.out.println("valid products");
		System.out.println(listOfProducts);

	}

	public static void validProduct(Product p) throws InvalidProductException {
		if (p.getWeight() < 200) {
			throw new InvalidProductException("less weight product");

		} else
			System.out.println("valid product " + p.getId() + "," + p.getWeight() + "@" + p.getPrice());

	}

}
