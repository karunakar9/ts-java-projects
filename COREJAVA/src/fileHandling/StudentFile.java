package fileHandling;

public class StudentFile {
	private String name;
	private int sub1;
	private int sub2;
	private int sub3;
	public StudentFile() {
		super();
	}
	public StudentFile(String name, int sub1, int sub2, int sub3) {
		super();
		this.name = name;
		this.sub1 = sub1;
		this.sub2 = sub2;
		this.sub3 = sub3;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSub1() {
		return sub1;
	}
	public void setSub1(int sub1) {
		this.sub1 = sub1;
	}
	public int getSub2() {
		return sub2;
	}
	public void setSub2(int sub2) {
		this.sub2 = sub2;
	}
	public int getSub3() {
		return sub3;
	}
	public void setSub3(int sub3) {
		this.sub3 = sub3;
	}
	public double percOfStudents(){
		return ((sub1+sub2+sub3)*100)/300.0;
	}
	@Override
	public String toString() {
		return "StudentFile [name=" + name + ", sub1=" + sub1 + ", sub2=" + sub2 + ", sub3=" + sub3
				+ ", percOfStudents()=" + percOfStudents() + "]";
	}
	

}
