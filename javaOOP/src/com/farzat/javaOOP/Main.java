/*###################################################*/
/*############# author : Suliman Farzat #############*/
/*###################################################*/

package com.farzat.javaOOP;

import com.farzat.javaOOP.aggregation.*;
import com.farzat.javaOOP.overriding.*;



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

		// inhertiance
		System.out.println("\n-------------inhertiance---------------\n");
		addValue av = new addValue();
		
		System.out.println("salary is : " + av.salary );
		System.out.println("increment : " + av.add );
		
		
		
		
		// aggregation
		System.out.println("\n-------------aggregation---------------\n");
		StudentInfo stuInfo1 = new StudentInfo("Suliman", "IT", "Heilbronn");
		StudentInfo stuInfo2 = new StudentInfo("Kasem", "HR", "Homs");
		
		Student stu1 = new Student(1, stuInfo1);
		Student stu2 = new Student(2, stuInfo2);
		
		stu1.show();
		stu2.show();
		
		
		
		
		// overriding
		System.out.println("\n-------------overriding---------------\n");
		Cat cat = new Cat();
		Dog dog = new Dog();
		Lion lion = new Lion();
		
		cat.eat();
		dog.eat();
		lion.eat();
		

	}
	
	

}
