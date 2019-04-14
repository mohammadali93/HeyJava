package com.class22;

public class TestSyntaxStudents {
	public static void main (String [] args) {
		
  SyntaxStudents student1=new SyntaxStudent();
  student1.studentName="Samir";
  student1.studentLastName="Aziz";
  
  student1.getStudentDetails();
//  
  SyntaxStudents student2=new SyntaxStudents();
  student2.studentName="Mohammad";
  student2.studentLastName="Ali";
//  
  student2.getStudentDetails();
  
  SyntaxStudents student1=new SyntaxStudents("Asha", "Noman");
  student1.getStudentDetails();
  
  SyntaxStudents student2=new SyntaxStudents("Mustafa", "Ozturk");
  student2.getStudentDetails();
}
}
