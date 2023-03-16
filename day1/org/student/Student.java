package org.student;

import org.department.Department;

public class Student extends Department
{
	public void studentName()
	{
	System.out.println("Raj");	
	}
	public void studentDept()
	{
	System.out.println("CSE");	
	}
	public void studentId()
	{
		System.out.println("567");		
	}

	public static void main(String[] args) 
	{
	Student stu =new Student();
	stu.collegeCode();
	stu.collegeName();
	stu.collegeRank();
	stu.deptName();
	stu.studentDept();
	stu.studentName();
	stu.studentId();			
	}
}
