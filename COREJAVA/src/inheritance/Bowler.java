package inheritance;

public class Bowler extends Player {
	private int wickets;
	private int runsGien;
	private int ballBowled;

	public Bowler() {
		super();
	}

	public Bowler(String name, int matches, int wickets, int runsGien, int ballBowled) {
		super(name, matches);
		this.wickets = wickets;
		this.runsGien = runsGien;
		this.ballBowled = ballBowled;
	}

	public int getWickets() {
		return wickets;
	}

	public void setWickets(int wickets) {
		this.wickets = wickets;
	}

	public int getRunsGien() {
		return runsGien;
	}

	public void setRunsGien(int runsGien) {
		this.runsGien = runsGien;
	}

	public int getBallBowled() {
		return ballBowled;
	}

	public void setBallBowled(int ballBowled) {
		this.ballBowled = ballBowled;
	}

	public double getEconomy() {
		return (double) runsGien / (ballBowled / 6);
	}
	public double calAverage(){
		return (double)runsGien/wickets;
	}
	
	
   	@Override
	public String toString() {
		return "Bowler [wickets=" + wickets + ", runsGien=" + runsGien + ", ballBowled=" + ballBowled
				+ ", getEconomy()=" + getEconomy() + ", toString()=" + super.toString() + "]";
	}

}
