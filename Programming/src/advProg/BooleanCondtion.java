package advProg;
//Write a function that returns true if only two of three 
//boolean arguments are true (else returns false).
public class BooleanCondtion {

	public static void main(String[] args) {
		boolean num1 = false;
		boolean num2 = false;
		boolean num3 = true;
		System.out.println(boooleanCheck(num1, num2, num3));
	}

	public static boolean boooleanCheck(boolean num1, boolean num2, boolean num3) {
		if (num1 == true && num2 == true && num3 == false) {
			return true;
		}
		if (num1 == true && num2 == false && num3 == true) {
			return true;
		}
		if (num1 == false && num2 == true && num3 == true) {
			return true;
		} else
			return false;
	}
}
