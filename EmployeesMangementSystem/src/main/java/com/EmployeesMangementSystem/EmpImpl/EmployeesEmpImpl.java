package com.EmployeesMangementSystem.EmpImpl;

//import package
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.EmployeesMangSystem.mode.Employees;
import com.EmployeesMangementSystem.Emp.EmployeesEmp;

//declaring class 
public class EmployeesEmpImpl implements EmployeesEmp {
	List<Employees> eList = new ArrayList<Employees>();
	// creating Scanner Object
	Scanner sc = new Scanner(System.in);

//method to add Empolyees
	public void addEmpolyees() {
		// TODO Auto-generated method stub
		// creating employees object
		Employees ss = new Employees();
		// input the details of student
		System.out.println("Enter the Employee id :");
		ss.setEmpId(sc.nextInt());
		System.out.println("Enter the Employee name :");
		ss.seteName(sc.next());
		System.out.println("Enter the Salary :");
		ss.setSalary(sc.nextDouble());

		// adding the employees into the collection
		eList.add(ss);
		System.out.println(eList);

	}

	public boolean deleteEmpolyees(int Empid) {
		// TODO Auto-generated method stub
		boolean status = false;
		Employees edel = null;
		// finding the student
		for (Employees e : eList) {
			if (e.getEmpId() == Empid)
				edel = e;
		}
		// check whether the record is present
		if (edel == null)
			status = false;
		else {
			eList.remove(edel);
			status = true;
		}

		return status;
	}

	// display method
	public void displayAll() {
		// TODO Auto-generated method stub
		for (Employees s : eList) {
			System.out.println(s);
		}

	}

	// update method

	public boolean updateEmployees(int Empid, Employees e) {
		// TODO Auto-generated method stub
		boolean status = false;
		Employees efind = null;
		// finding the Employee
		for (Employees e1 : eList) {
			if (e1.getEmpId() == Empid)
				efind = e1;
		}
		if (efind != null) {
			int ch = 0;
			System.out.println("1. Update name");
			System.out.println("2. Update Salary");
			ch = sc.nextInt();
			switch (ch) {
			case 1:
				System.out.println("Enter the Employee name :");
				efind.seteName(sc.next());
				System.out.println("Employee Name updated........");
				status = true;
				break;
			case 2:
				System.out.println("Enter the Salary :");
				efind.setSalary(sc.nextDouble());
				System.out.println("Salary updated........");
				status = true;
				break;

			default:
				System.out.println("No Record Found.....");
			}

		} else
			status = false;
		return status;
	}

}
