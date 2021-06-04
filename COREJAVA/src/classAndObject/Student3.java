package classAndObject;

public class Student3 {
	private int id;
	private String name;
	private int mat;
	private int phy;
	private int che;
	static int idGenerator = 1000;

	Student3(String name, int mat, int phy, int che) {
		this.name = name;
		this.mat = mat;
		this.che = che;
		this.id = ++idGenerator;
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

	public int getMat() {
		return mat;
	}

	public void setMat(int mat) {
		this.mat = mat;
	}

	public int getPhy() {
		return phy;
	}

	public void setPhy(int phy) {
		this.phy = phy;
	}

	public int getChe() {
		return che;
	}

	public void setChe(int che) {
		this.che = che;
	}

	public double percentage() {
		double num = (mat + phy + che) / 300.0;
		double perc = num * 100;
		return perc;
	}

	@Override
	public String toString() {
		return "Student3 [id=" + id + ", name=" + name + ", percentage()=" + percentage() + "]";
	}

	public static Student3 compare(Student3 s1, Student3 s2) {
		if (s1.percentage() > s2.percentage())
			return s1;
		else
			return s2;

	}
}
