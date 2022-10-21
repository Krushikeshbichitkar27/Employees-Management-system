package com.EmployeesMangSystem.mode;

//declaring class
public class Employees {
	private int EmpId;
	private String eName;
	private double salary;

	public Employees() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employees(int empId, String eName, double salary) {
		super();
		EmpId = empId;
		this.eName = eName;
		this.salary = salary;
	}

	// getter setter
	public int getEmpId() {
		return EmpId;
	}

	public void setEmpId(int empId) {
		EmpId = empId;
	}

	public String geteName() {
		return eName;
	}

	public void seteName(String eName) {
		this.eName = eName;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employees [EmpId=" + EmpId + ", eName=" + eName + ", salary=" + salary + "]";
	}

	public static void displayAll() {
		// TODO Auto-generated method stub

	}

}
