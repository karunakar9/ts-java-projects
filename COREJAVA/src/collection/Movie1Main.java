package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Movie1Main {
	public static void main(String args[]) {

		List<Movie1> movieList = new ArrayList<>();

		movieList.add(new Movie1("Asvr", "Trivikram", 154, 2019));
		movieList.add(new Movie1("legend", "boyapati", 154, 2014));
		movieList.add(new Movie1("bahubali1", "rajamouli", 176, 2014));
		movieList.add(new Movie1("bahubali", "rajamouli", 181, 2016));
		movieList.add(new Movie1("BAN", "karatala", 165, 2019));
		movieList.add(new Movie1("julai", "Trivikram", 154, 2013));
		movieList.add(new Movie1("arjunreddy", "snadeep", 180, 2018));
		movieList.add(new Movie1("jai lava kusa", "boby", 176, 2017));
		movieList.add(new Movie1("raguvaran byech", "dhanush", 124, 2015));
		movieList.add(new Movie1("temper", "purijaganadh", 154, 2015));

		while (true) {
			Scanner scan = new Scanner(System.in);

			System.out.println("Enter your choice");
			System.out.println("1.Sort By Year");
			System.out.println("2.Sort By Name");
			System.out.println("3.Sort By DirectorName");
			System.out.println("4.Exit");

			int number = scan.nextInt();

			if (number == 1) {
				Collections.sort(movieList, new Movie1SortByYear());
				for (Movie1 m : movieList)
					System.out.println(m);
			}

			else if (number == 2) {
				Collections.sort(movieList, new Movie1SortByName());
				for (Movie1 m : movieList)
					System.out.println(m);
			} else if (number == 3) {
				Collections.sort(movieList, new Movie1SortByDirectorName());
				for (Movie1 m : movieList)
					System.out.println(m);

			} else if (number > 4)
				System.out.println("invalid number");

			else {
				System.exit(0);
			}

		}
	}

}