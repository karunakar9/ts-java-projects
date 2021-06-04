package collection;

public class StudentSort implements Comparable<StudentSort> {

	private int id;
	private String name;
	private double mat;
	private double phy;
	private double che;
	public static int idGenerator = 1000;

	public StudentSort() {
	}

	public StudentSort(String name, double mat, double phy, double che) {
		super();
		this.id = ++idGenerator;
		this.name = name;
		this.mat = mat;
		this.phy = phy;
		this.che = che;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getMat() {
		return mat;
	}

	public void setMat(double mat) {
		this.mat = mat;
	}

	public double getPhy() {
		return phy;
	}

	public void setPhy(double phy) {
		this.phy = phy;
	}

	public double getChe() {
		return che;
	}

	public void setChe(double che) {
		this.che = che;
	}

	public double percentageOfStudents() {
		return ((mat + phy + che) * 100) / 300.0;

	}

	@Override
	public String toString() {
		return "Student [getId()=" + getId() + ", getName()=" + getName() + ", getMat()=" + getMat() + ", getPhy()="
				+ getPhy() + ", getChe()=" + getChe() + ", percentageOfStudents()=" + percentageOfStudents() + "]";
	}

	@Override
	public int compareTo(StudentSort obj) {
		
		return this.getName().compareTo(obj.getName());
	}

}
