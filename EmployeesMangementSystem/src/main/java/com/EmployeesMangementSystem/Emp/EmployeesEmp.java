package com.EmployeesMangementSystem.Emp;

import com.EmployeesMangSystem.mode.Employees;

public interface EmployeesEmp {
	void addEmpolyees();

	boolean deleteEmpolyees(int Empid);

	boolean updateEmployees(int Empid, Employees e);

	void displayAll();

}
