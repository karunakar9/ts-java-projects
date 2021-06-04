package inheritance;

public class Cricket {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Batsman b1 = new Batsman("mothi", 350, 10773, 12303, 84);
		System.out.println(b1);
		Bowler b2 = new Bowler("bumrah", 58, 103, 2254, 3009);
		System.out.println(b2);
		
		System.out.println(b1.getName()+" batsman avg:"+b1.calAverage());
		System.out.println(b2.getName()+ " bowler avg:"+b2.calAverage());
		
		System.out.println("======================");
		

	}

}
