package collection;

public class Movie {
	private String movieName;
	private String directorName;
	private int duration;
	private double rating;

	public Movie() {
		super();
	}

	public Movie(String movieName, String directorName, int duration, double rating) {
		super();
		this.movieName = movieName;
		this.directorName = directorName;
		this.duration = duration;
		this.rating = rating;
	}
	

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public String getDirectorName() {
		return directorName;
	}

	public void setDirectorName(String directorName) {
		this.directorName = directorName;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}

	@Override
	public String toString() {
		return "Movie [movieName=" + movieName + ", directorName=" + directorName + ", duration=" + duration
				+ ", rating=" + rating + "]";
	}

}
