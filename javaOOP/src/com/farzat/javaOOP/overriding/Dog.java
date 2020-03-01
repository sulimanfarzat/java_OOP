/*###################################################*/
/*############# author : Suliman Farzat #############*/
/*###################################################*/

package com.farzat.javaOOP.overriding;

public class Dog extends Animal {
	
	
	public void eat() {
		System.out.println("The dog is eating ");
	}
	
	
	public void sleep() {
		System.out.println("The dog is sleeping ");
	}
	
	
	public void play() {
		System.out.println("The dog is playing ");
	}
	
	
	// super classs
	int Age;

	public Dog(int age) {
		super();
		Age = age;
		System.out.println("this is my  " + age );
	}
	

}
