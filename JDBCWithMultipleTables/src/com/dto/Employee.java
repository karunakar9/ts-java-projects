package com.dto;

public class Employee {
	private int eno;
	private String ename;
	private int esal;
	private String job;
	private Department dno;
	public Employee() {
		super();
	}
	public Employee(int eno, String ename, int esal, String job, Department dno) {
		super();
		this.eno = eno;
		this.ename = ename;
		this.esal = esal;
		this.job = job;
		this.dno = dno;
	}
	public int getEno() {
		return eno;
	}
	public void setEno(int eno) {
		this.eno = eno;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public int getEsal() {
		return esal;
	}
	public void setEsal(int esal) {
		this.esal = esal;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public Department getDno() {
		return dno;
	}
	public void setDno(Department dno) {
		this.dno = dno;
	}
	@Override
	public String toString() {
		return "Employee [eno=" + eno + ", ename=" + ename + ", esal=" + esal + ", job=" + job + ", dno=" + dno + "]";
	}
	

}
