package collection;

public class CabCustomerServiceTester {
	public static void main(String[] args) {
		CabCustomerService test = new CabCustomerService();

		CabCustomer c1 = new CabCustomer(1, "Mothilal", "a", "b", 10, 999888888);
		test.addCabCustomer(c1);
		test.printBill(c1);

		CabCustomer c2 = new CabCustomer(1, "Mothilal", "a", "b", 10, 999888888);
		test.addCabCustomer(c2);
		test.printBill(c2);

		CabCustomer c3 = new CabCustomer(1, "John", "a", "b", 01, 998888828);
		test.addCabCustomer(c3);
		test.printBill(c3);

		CabCustomer c4 = new CabCustomer(1, "John", "a", "b", 01, 998888828);
		test.addCabCustomer(c4);
		test.printBill(c4);

		CabCustomer c5 = new CabCustomer(1, "Mothilal", "a", "b", 100, 999888888);
		test.addCabCustomer(c5);
		test.printBill(c5);

	}
}