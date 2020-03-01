/*###################################################*/
/*############# author : Suliman Farzat #############*/
/*###################################################*/

package com.farzat.javaOOP.overriding;

public class Cat extends Animal {

	String name = "Cat";
	
	// use super class
	public void eat() {
		System.out.println("The " + super.name + " " + name + " is eating ");
	}
	
	
	public void sleep() {
		System.out.println("The " + super.name + " " + name + "  is sleeping ");
	}
	
	
	public void play() {
		System.out.println("The " + super.name + " " + name + "  is playing ");
	}
	
	
	//super clas with constructor
	public Cat() {
		super();
		System.out.println("this is my  " + name );
	}
	
	
}
