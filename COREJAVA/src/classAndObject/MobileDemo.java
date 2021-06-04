package classAndObject;

public class MobileDemo {
	public static void main(String[] args) {
		Mobile m1 = new Mobile();
		m1.battery = 3000;
		m1.brand = "micromax india";
		m1.camera = 16;
		m1.display = 6;
		m1.os = "android";
		m1.price = 16000;
		m1.ram = 4;

		System.out.println("battery :" + m1.battery);
		System.out.println("brand :" + m1.brand);
		System.out.println("camera :" + m1.camera);
		System.out.println("display :" + m1.display);
		System.out.println("os :" + m1.os);
		System.out.println("price :" + m1.price);
		System.out.println("ram :" + m1.ram);
		m1.makeCall();
		m1.receiveCall();
		m1.texting();
		
		System.out.println("m1 obj display");
		m1.display();
		
		Mobile m2 = new Mobile();
		m2.display();
		m2.brand = "honor";
		m2.price = 9000;
		m2.display();

	}

}
