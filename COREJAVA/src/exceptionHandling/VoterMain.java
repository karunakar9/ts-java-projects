package exceptionHandling;

import java.util.ArrayList;
import java.util.List;

public class VoterMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Voter> voterList = new ArrayList<>();
		voterList.add(new Voter("mothilal", 12, "Gachibowli", 1234567l));
		voterList.add(new Voter("madhukar", 23, "kothapet", 234567898l));
		voterList.add(new Voter("eshwar", 42, "madhapur", 9876543l));
		for (Voter v : voterList) {
			try {
				validate(v);
			} catch (InvalidAgeException e) {
				// e.printStackTrace();
				System.out.println(e);
			}
		}

	}

	private static void validate(Voter v) throws InvalidAgeException {
		if (v.getAge() < 18) {
			throw new InvalidAgeException("not a valid voter age is below 18");
		} else
			System.out.println("vote  is issued to " + v.getName());

	}

}
