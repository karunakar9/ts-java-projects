package differentPrograms;

public class FruitsCombination {

	public static void main(String[] args) {
		for(int apples=1;apples<=100;apples++){
			for(double ban=1;ban<=100;ban++){
				for(int oran=1;oran<=100;oran++ ){
				if((apples+ban+oran)==100)
					if((apples*1+ban*0.5+oran*5)==100)
						System.out.println(apples+" "+ban+" "+oran);
				}
			}
		}

	}

}
