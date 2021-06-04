import java.util.ArrayList;
import java.util.List;

public class IBM {

	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();
		list.add("6");// 0
		list.add("H");// 1
		list.add("aaa01/01/2021");// 2
		list.add("T");// 3
		list.add("H");// 4
		list.add("bbb01/02/2021");// 5
		list.add("T");// 6
		fileSpiltByDate(list);

	}

	private static void fileSpiltByDate(List<String> fileData) {
		// TODO Auto-generated method stub
		int recordOne = Integer.parseInt(fileData.get(0));
		for (int i = 0; i < fileData.size(); i++) {
			if (i != 0 && i % 3 == 0) {
				if (!(fileData.get(i) != null && fileData.get(i) == "H")) {
					System.out.println("Invaid file");
				}
			}
			if (i == 1) {
				for (int j = 0; j < recordOne; j++) {
					if (!(fileData.get(i) != null && fileData.get(i) == "T")) {
						System.out.println("Invaid file");
					}
					j = j + 3;
				}
			}
			if (i == 2) {
				for (int j = 0; j < recordOne; j++) {
					//third case for file logic here
					j = i + 3;
				}
			}

		}

	}
}
