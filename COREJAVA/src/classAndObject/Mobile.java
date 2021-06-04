package classAndObject;

public class Mobile {
	double price;
	String brand;
	String os;
	int camera;
	int ram;
	int memory;
	float display;
	int battery;

	public void makeCall() {
		System.out.println("dialling call.....");
	}

	public void receiveCall() {
		System.out.println("Call receive......");
	}

	public void texting() {
		System.out.println("texting........");
	}

	public void display() {
		System.out.println("=================================");
		System.out.println("brand :" + brand);
		System.out.println("price :" + price);
	}

}
