package assignments.week3.day1.org.student;

import assignments.week3.day1.org.department.Department;

public class Student extends Department{
	
	public void studentName()
	{
		System.out.println("Insude student name method in Student class");
	}
	
	public void studentDept()
	{
		System.out.println("Insude student department method in Student class");
	}
	
	public void studentId()
	{
		System.out.println("Insude student id method in Student class");
	}

	public static void main(String args[])
	{
		Student student = new Student();
		
		student.collegeCode();
		student.collegeName();
		student.collegeRank();
		student.deptName();
		student.studentName();
		student.studentDept();
		student.studentId();
	}
}
