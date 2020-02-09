/*###################################################*/
/*############# author : Suliman Farzat #############*/
/*###################################################*/

package com.farzat.javaOOP.aggregation;

// aggregation
public class Student {
	
	int id;
	StudentInfo studentInfo;
	
	public Student(int id, StudentInfo studentInfo) {
		this.id = id;
		this.studentInfo = studentInfo;
	}
	
	
	public void show() {
		System.out.println("Id : " + id + " | Name : " + studentInfo.name + " | Department : " + studentInfo.department + " | Address : " + studentInfo.address);
	}
	
	

}
