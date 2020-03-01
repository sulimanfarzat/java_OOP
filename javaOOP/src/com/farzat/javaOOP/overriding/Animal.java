/*###################################################*/
/*############# author : Suliman Farzat #############*/
/*###################################################*/

package com.farzat.javaOOP.overriding;

public class Animal {
	
	String name = "Animal";
	
	public void eat() {
		System.out.println("The " + name + " is eating ");
	}
	
	
	public void sleep() {
		System.out.println("The " + name + " is sleeping ");
	}
	
	
	public void play() {
		System.out.println("The " + name + " is playing ");
	}
	
	
	public Animal() {
		System.out.println("this is my  " + name );
	}

	
}
