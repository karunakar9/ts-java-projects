package association;

public class Address {
	private int plotNo;
	private int streetNo;
	private String city;
	private String state;
	private String country;
	private int pincode;

	public Address() {
		super();
	}

	public Address(int plotNo, int streetNo, String city, String state, String country, int pincode) {
		super();
		this.plotNo = plotNo;
		this.streetNo = streetNo;
		this.city = city;
		this.state = state;
		this.country = country;
		this.pincode = pincode;
	}

	public int getPlotNo() {
		return plotNo;
	}

	public void setPlotNo(int plotNo) {
		this.plotNo = plotNo;
	}

	public int getStreetNo() {
		return streetNo;
	}

	public void setStreetNo(int streetNo) {
		this.streetNo = streetNo;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	@Override
	public String toString() {
		return "Address [getPlotNo()=" + getPlotNo() + ", getStreetNo()=" + getStreetNo() + ", getCity()=" + getCity()
				+ ", getState()=" + getState() + ", getCountry()=" + getCountry() + ", getPincode()=" + getPincode()
				+ "]";
	}

}
