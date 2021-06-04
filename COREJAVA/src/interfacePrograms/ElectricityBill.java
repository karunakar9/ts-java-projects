package interfacePrograms;

public class ElectricityBill implements Bill {
	private double noOfUnitsUsed;
	private double chargePerUnit;

	public ElectricityBill() {
		super();
	}

	public ElectricityBill(double noOfUnitsUsed, double chargePerUnit) {
		super();
		this.noOfUnitsUsed = noOfUnitsUsed;
		this.chargePerUnit = chargePerUnit;
	}

	public double getNoOfUnitsUsed() {
		return noOfUnitsUsed;
	}

	public void setNoOfUnitsUsed(double noOfUnitsUsed) {
		this.noOfUnitsUsed = noOfUnitsUsed;
	}

	public double getChargePerUnit() {
		return chargePerUnit;
	}

	public void setChargePerUnit(double chargePerUnit) {
		this.chargePerUnit = chargePerUnit;
	}

	@Override
	public double calBill() {

		return noOfUnitsUsed * chargePerUnit;
	}

	@Override
	public void displayBill() {
		System.out.println("noOfUnitsUsed:" + noOfUnitsUsed);
		System.out.println("chargePerUnit" + chargePerUnit);
		System.out.println("electricity bill=" + calBill());

	}

}
