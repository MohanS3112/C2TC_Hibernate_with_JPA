package com.tns.client;

import com.tns.entity.Student;
import com.tns.service.StudentService;
import com.tns.service.StudentServiceImpl;


public class Client {

	public static void main(String[] args) {
		
		StudentService service = new StudentServiceImpl();
		
		Student student = new Student();
		
		//create operation
		student.setStudentId(143);
		student.setName("Saimohan");
		service.addStudent(student);
		
		/*retrieve operation
		student = service.findStudentById(143);
		System.out.print("ID: "+student.getStudentId());
		System.out.println("Name: "+student.getName());
		
		//update operation
		student = service.findStudentById(143);
		student.setName("Saimohan");
		service.updateStudent(student);
		
		
		student = service.findStudentById(143);
		System.out.print("ID: "+student.getStudentId());
		System.out.println("Name: "+student.getName());
		
		
		/*delete operation
		student = service.findStudentById(143);
		service.removeStudent(student);
		System.out.println("End of program/ Life Cycle completed.....");*/

	}

}
