/*###################################################*/
/*############# author : Suliman Farzat #############*/
/*###################################################*/

package com.farzat.javaOOP;


// super class
class Employee {
	int salary = 5000;
}

// inhertiance with extends
class addValue extends Employee {
	int add = 1000;
}



public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		addValue av = new addValue();
		
		System.out.println("salary is : " + av.salary );
		System.out.println("increment : " + av.add );

	}

}
