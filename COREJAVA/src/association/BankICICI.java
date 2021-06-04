package association;

public class BankICICI implements Bank {
	private String branchName;
	private long branchNo;
	private long ifscCode;
	private double rateOfInterest;
	private CustomerDetails customer;
	
	public BankICICI() {
		super();
	}

	public BankICICI(String branchName, long branchNo, long ifscCode, double rateOfInterest, CustomerDetails customer) {
		super();
		this.branchName = branchName;
		this.branchNo = branchNo;
		this.ifscCode = ifscCode;
		this.rateOfInterest = rateOfInterest;
		this.customer = customer;
	}
	

	public String getBranchName() {
		return branchName;
	}

	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}

	public long getBranchNo() {
		return branchNo;
	}

	public void setBranchNo(long branchNo) {
		this.branchNo = branchNo;
	}

	public long getIfscCode() {
		return ifscCode;
	}

	public void setIfscCode(long ifscCode) {
		this.ifscCode = ifscCode;
	}

	public double getRateOfInterest() {
		return rateOfInterest;
	}

	public void setRateOfInterest(double rateOfInterest) {
		this.rateOfInterest = rateOfInterest;
	}

	public CustomerDetails getCustomer() {
		return customer;
	}

	public void setCustomer(CustomerDetails customer) {
		this.customer = customer;
	}

	@Override
	public double calSimpleInterest() {
		double si=(customer.getInvestment()*customer.getDuration()*rateOfInterest)/100.0;
		return si;
	}

	@Override
	public String toString() {
		return "ICICIBank [getBranchName()=" + getBranchName() + ", getBranchNo()=" + getBranchNo() + ", getIfscCode()="
				+ getIfscCode() + ", getRateOfInterest()=" + getRateOfInterest() + ", getCustomer()=" + getCustomer()
				+ ", calSimpleInterest()=" + calSimpleInterest() + "]";
	}
	
	

}
