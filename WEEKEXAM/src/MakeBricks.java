public class MakeBricks {
	public static String isWallPossible(int noSmall, int noBig, int goal) {
		if (noSmall < 0 || noBig < 0 || goal <= 0)
			return "invalid";
		for (int i = 0; i <= noSmall; i++) {
			for (int j = 0; j <= noBig; j++) {
				if (1 * i + 5 * noBig == goal)
					return "true";
			}
		}

		return "false";

	}

	public static void main(String[] args) {
		System.out.println("isWallPossible(3,1,8) Required true => Actual " + isWallPossible(3, 1, 8));
		System.out.println("isWallPossible(3,1,9) Required false => Actual " + isWallPossible(3, 1, 9));
		System.out.println("isWallPossible(40,2,50) Required true => Actual " + isWallPossible(40, 2, 50));
		System.out.println("isWallPossible(40,2,52) Required false => Actual " + isWallPossible(40, 2, 52));
		System.out.println("isWallPossible(4,4,0) required invalid => Actual " + isWallPossible(4, 4, 0));
		System.out.println("isWallPossible(1,-3,0) required invalid => Actual " + isWallPossible(1, -3, 0));
	}
}