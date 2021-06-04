package inheritance;

public class Batsman extends Player {
	private int runsScored;
	private int ballsFaced;
	private int dismissals;

	public Batsman() {
		super();
	}

	public Batsman(String name, int matches, int runsScored, int ballsFaced, int dismissals) {
		super(name, matches);
		this.runsScored = runsScored;
		this.ballsFaced = ballsFaced;
		this.dismissals = dismissals;
	}

	public int getRunsScored() {
		return runsScored;
	}

	public void setRunsScored(int runsScored) {
		this.runsScored = runsScored;
	}

	public int getBallsFaced() {
		return ballsFaced;
	}

	public void setBallsFaced(int ballsFaced) {
		this.ballsFaced = ballsFaced;
	}

	public int getDismissals() {
		return dismissals;
	}

	public void setDismissals(int dismissals) {
		this.dismissals = dismissals;
	}

	public double calstrikeRate() {
		return (runsScored * 100.0 / ballsFaced);
	}
	public double  calAverage(){
		return (double)(runsScored)/dismissals;
	}

	@Override
	public String toString() {
		return "Batsman [runsScored=" + runsScored + ", ballsFaced=" + ballsFaced + ", dismissals=" + dismissals
				+ ", calstrikeRate()=" + calstrikeRate() + ", calAverage()=" + calAverage() + ", toString()="
				+ super.toString() + "]";
	}

	

}
