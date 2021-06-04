package mapsPrograms;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HospitalFinderMain {

	public static void main(String[] args) {
		HospitalService service = new HospitalService();
		List<String>list=new ArrayList<>();
		list.add("Ent");
		list.add("dental");
		list.add("gynacologist");
		list.add("ortho");
		service.addHospital("yashoda", list, "mothilal", 1234567890l, "malakpet");
		service.addHospital("continental", list, "eshwar", 984801234l, "gachibowli");
		service.addHospital("rainbow", list, "madhukar", 8791234567l, "kothapet");
		
		System.out.println("====hospitalMap=========");
		
		System.out.println(service.getHospitals());
		System.out.println("===========================");
		System.out.println("enter code to get the details of hospital:");
		Scanner scan = new Scanner(System.in);
		int hospitalcode=scan.nextInt();
		System.out.println(service.getHospitalDetails(hospitalcode));
		scan.close();

	}

}
