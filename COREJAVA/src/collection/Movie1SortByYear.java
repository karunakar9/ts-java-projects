package collection;

import java.util.Comparator;

public class Movie1SortByYear implements Comparator<Movie1> {

	@Override
	public int compare(Movie1 o1, Movie1 o2) {
		// TODO Auto-generated method stub
		return Integer.compare(o1.getReleasedyear(), o2.getReleasedyear());

	}

}
