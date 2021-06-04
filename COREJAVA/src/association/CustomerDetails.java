package association;

public class CustomerDetails {
	private long accNo;
	private String accHolderName;
	private String typeOfAcc;
	private double investment;
	private double duration;
	
	public CustomerDetails() {
		super();
	}

	public CustomerDetails(long accNo, String accHolderName, String typeOfAcc, double investment, double duration) {
		super();
		this.accNo = accNo;
		this.accHolderName = accHolderName;
		this.typeOfAcc = typeOfAcc;
		this.investment = investment;
		this.duration = duration;
	}

	public long getAccNo() {
		return accNo;
	}

	public void setAccNo(long accNo) {
		this.accNo = accNo;
	}

	public String getAccHolderName() {
		return accHolderName;
	}

	public void setAccHolderName(String accHolderName) {
		this.accHolderName = accHolderName;
	}

	public String getTypeOfAcc() {
		return typeOfAcc;
	}

	public void setTypeOfAcc(String typeOfAcc) {
		this.typeOfAcc = typeOfAcc;
	}

	public double getInvestment() {
		return investment;
	}

	public void setInvestment(double investment) {
		this.investment = investment;
	}

	public double getDuration() {
		return duration;
	}

	public void setDuration(double duration) {
		this.duration = duration;
	}

	@Override
	public String toString() {
		return "CustomerDetails [getAccNo()=" + getAccNo() + ", getAccHolderName()=" + getAccHolderName()
				+ ", getTypeOfAcc()=" + getTypeOfAcc() + ", getInvestment()=" + getInvestment() + ", getDuration()="
				+ getDuration() + "]";
	}
	
	

}
