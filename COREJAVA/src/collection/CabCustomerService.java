package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class CabCustomerService {
	long phoneNumber = 0;
	private ArrayList<CabCustomer> list = new ArrayList<CabCustomer>();

	void addCabCustomer(CabCustomer customer) {
		if (isFirstCustomer(customer))
			phoneNumber = customer.getPhone();
		list.add(customer);
	}

	public boolean isFirstCustomer(CabCustomer newCustomer) {
		Iterator<CabCustomer> listIterator = list.iterator();
		CabCustomer c;
		while (listIterator.hasNext()) {
			c = (CabCustomer) listIterator.next();
			if (c.getPhone() == newCustomer.getPhone())
				return false;
		}
		return true;
	}

	public double calculateBill(CabCustomer customer) {
		if (customer.getPhone() == phoneNumber) {
			phoneNumber = 0;
			return 0.0;
		} else if (customer.getDistance() <= 4)
			return 80.00;
		return (80.00 + (customer.getDistance() - 4) * 6);
	}

	public void printBill(CabCustomer customer) {
		System.out.println(customer.getCustomerName() + " Please pay your bill of Rs." + calculateBill(customer));
	}

}