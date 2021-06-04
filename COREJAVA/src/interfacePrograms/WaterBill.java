package interfacePrograms;

public class WaterBill implements Bill {
	private int noOfltrsUsed;
	private double chargePerLtr;

	public WaterBill() {
		super();
	}

	public WaterBill(int noOfltrsUsed, double chargePerLtr) {
		super();
		this.noOfltrsUsed = noOfltrsUsed;
		this.chargePerLtr = chargePerLtr;
	}

	public int getNoOfltrsUsed() {
		return noOfltrsUsed;
	}

	public void setNoOfltrsUsed(int noOfltrsUsed) {
		this.noOfltrsUsed = noOfltrsUsed;
	}

	public double getChargePerLtr() {
		return chargePerLtr;
	}

	public void setChargePerLtr(double chargePerLtr) {
		this.chargePerLtr = chargePerLtr;
	}

	@Override
	public double calBill() {
		return noOfltrsUsed * chargePerLtr;
	}

	@Override
	public void displayBill() {
		System.out.println("noOfltrsUsed:" + noOfltrsUsed);
		System.out.println("chargePerLtr:" + chargePerLtr);
		System.out.println("water bill" + calBill());

	}

}
