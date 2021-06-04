package collection;

import java.util.Comparator;

public class Movie1SortByName implements Comparator<Movie1> {

	@Override
	public int compare(Movie1 o1, Movie1 o2) {
		// TODO Auto-generated method stub
		return o1.getName().compareTo(o2.getName());
	}

}