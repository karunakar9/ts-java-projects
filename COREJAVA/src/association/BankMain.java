package association;

public class BankMain {

	public static void main(String[] args) {
		CustomerDetails cust = new CustomerDetails(123456, "dihith", "savings", 12345, 12);
		BankSBI B = new BankSBI("Sbi gachibowli", 87654, 45678, 6, cust);
		System.out.println(B);
		
		BankICICI I = new BankICICI("Icici", 7654, 76541, 6.5, cust);
		System.out.println(I);
		System.out.println("=========================");
		
		System.out.println(B.getCustomer().getAccHolderName());
		System.out.println(B.getCustomer().getAccNo());
		System.out.println(B.getBranchName());
		System.out.println(B.calSimpleInterest());
		System.out.println("=========================");
		System.out.println(I.getCustomer().getAccHolderName());
		System.out.println(I.getCustomer().getAccNo());
		System.out.println(I.getBranchName());
		System.out.println(I.calSimpleInterest());

	}

}
