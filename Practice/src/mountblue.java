import java.util.ArrayList;
import java.util.List;

public class mountblue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = new ArrayList<String>();
		list.add("A201550B");
		list.add("ABB19991000Z");
		list.add("XYZ200019Z");
		list.add("ERF200220");
		list.add("SCD203010T");
		//list.add("abC200010E");
		//countFakes(list);
		System.out.println(countFakes(list));

	}

	private static int countFakes(List<String> serialNumber) {
		List<Integer> amount = new ArrayList<Integer>();
		for (String coupon : serialNumber) {
			boolean isValid = Testthecoupon(coupon);
			if (isValid) {
				String amt = coupon.substring(7, coupon.length() - 1);

				amount.add((int) Double.parseDouble(amt));
			}

		}
		int sum = 0;
		for (Integer integer : amount) {

			sum = sum + integer;

		}

		return sum;
	}

	private static boolean Testthecoupon(String coupon) {
		// Test =1
		if (coupon.length() < 10 && coupon.length() > 12) {
			return false;
		}
		// Test=2
		if (!(Character.isUpperCase(coupon.charAt(0)) && Character.isUpperCase(coupon.charAt(1))
				&& Character.isUpperCase(coupon.charAt(2)))) {
			return false;
		}
		char at0 = coupon.charAt(0);
		char at1 = coupon.charAt(1);
		char at2 = coupon.charAt(2);
		if (at0 == at1 || at1 == at2 || at0 == at2) {
			return false;
		}

		// Test=3
		String yearcheck = coupon.substring(3, 7);
		if (yearcheck == null) {
			return false;
		}
		try {
			double d = Double.parseDouble(yearcheck);
			if (d < 1900 && d > 2019) {
				return false;
			}
		} catch (NumberFormatException nfe) {
			return false;
		}
		// Test=5
		if (!(Character.isUpperCase(coupon.charAt(coupon.length() - 1)))) {
			return false;
		}
		// Test=4 amount check
		double amount = 0;
		String amt = coupon.substring(7, coupon.length() - 1);
		if (amt == null) {
			return false;
		}
		try {
			amount = Double.parseDouble(amt);
			if (!(amount == 10 || amount == 20 || amount == 50 ||amount == 100 || amount == 200 || amount == 500
					|| amount == 1000)) {
				return false;
			}
		} catch (NumberFormatException nfe) {
			return false;
		}
		return true;
	}

}
