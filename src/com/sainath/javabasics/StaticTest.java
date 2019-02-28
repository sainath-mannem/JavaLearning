package com.sainath.javabasics;

public class StaticTest {

	//Static variable
	//Static method
	//Static block
	int y;
	public static int X = 10;
	static {
		X++;
		display();
		
	}
	
	StaticTest() {
		
	}
	
	
	public static void display() {
	}
	
	private void displayX() {
		display();
		System.out.println(X++);
		y++;
	}
}

class X {
	void method() {
		StaticTest.display();
		int x = StaticTest.X;
	}
}
