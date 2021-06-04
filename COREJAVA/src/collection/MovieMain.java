package collection;

import java.util.HashSet;
import java.util.Set;

public class MovieMain {

	public static void main(String[] args) {
		Movie m = new Movie("rakthacharitra", "RGV", 3, 7);
		Set<Movie> movielist = new HashSet<>();
		movielist.add(m);
		movielist.add(m);
		Movie m2 = new Movie("ismart", "PJN", 3, 7);

		movielist.add(m2);
		Movie m3 = new Movie("Aa", "Dihith", 6, 10);
		movielist.add(m3);
		Movie m4 = new Movie("ismart", "PJN", 3, 7);
		movielist.add(m4);
		System.out.println(movielist);
		System.out.println("movielist: "+movielist.size());
		System.out.println("=================");
		for (Movie obj : movielist)
			System.out.println(obj);

	}

}
