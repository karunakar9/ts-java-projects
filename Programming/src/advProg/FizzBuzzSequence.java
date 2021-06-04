package advProg;

public class FizzBuzzSequence {

	public static void main(String[] args) {
		getFizzBuzzSequence();

	}

	public static void getFizzBuzzSequence() {
		int i = 1;
		do {
			if (i % 3 == 0 && i % 5 == 0) {
				System.out.println("Fizz Buzz");
			} else {
				if (i % 3 == 0) {
					System.out.println("Fizz");
				} else if (i % 5 == 0) {
					System.out.println("Buzz");
				} else {
					System.out.println(i);
				}

			}
			i++;

		} while (i <= 100);
	}

}
