package mapsPrograms;

import java.util.ArrayList;
import java.util.List;

public class Hospital {
	private int hospitalCode;
	private String hospitalName;
	private List<String> listOfTreatments = new ArrayList<>();
	private String contactPerson;
	private long contactNum;
	private String location;
	public static int idCodeGenerator=1000;
	public Hospital() {
		super();
	}
	public Hospital( String hospitalName, List<String> listOfTreatments, String contactPerson,
			long contactNum, String location) {
		super();
		this.hospitalCode = ++idCodeGenerator;
		this.hospitalName = hospitalName;
		this.listOfTreatments = listOfTreatments;
		this.contactPerson = contactPerson;
		this.contactNum = contactNum;
		this.location = location;
	}
	public int getHospitalCode() {
		return hospitalCode;
	}
	public void setHospitalCode(int hospitalCode) {
		this.hospitalCode = hospitalCode;
	}
	public String getHospitalName() {
		return hospitalName;
	}
	public void setHospitalName(String hospitalName) {
		this.hospitalName = hospitalName;
	}
	public List<String> getListOfTreatments() {
		return listOfTreatments;
	}
	public void setListOfTreatments(List<String> listOfTreatments) {
		this.listOfTreatments = listOfTreatments;
	}
	public String getContactPerson() {
		return contactPerson;
	}
	public void setContactPerson(String contactPerson) {
		this.contactPerson = contactPerson;
	}
	public long getContactNum() {
		return contactNum;
	}
	public void setContactNum(long contactNum) {
		this.contactNum = contactNum;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	@Override
	public String toString() {
		return "Hospital [hospitalCode=" + hospitalCode + ", hospitalName=" + hospitalName + ", listOfTreatments="
				+ listOfTreatments + ", contactPerson=" + contactPerson + ", contactNum=" + contactNum + ", location="
				+ location + "]";
	}
	

}
