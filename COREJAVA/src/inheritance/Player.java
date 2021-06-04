package inheritance;

public class Player {
	private int id;
	private String name;
	private int matches;
	static int idgenerator = 1000;

	public Player() {

	}

	public Player(String name, int matches) {
		super();
		this.name = name;
		this.matches = matches;
		this.id = ++idgenerator;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;

	}

	public int getMatches() {
		return matches;
	}

	public void setMatches(int matches) {
		this.matches = matches;
	}
	public double  calAverage(){
		return 0.0;
	}
	
	
    
	@Override
	public String toString() {
		return "Player [id=" + id + ", name=" + name + ", matches=" + matches + ", idgenerator=" + idgenerator + "]";
	}

}
