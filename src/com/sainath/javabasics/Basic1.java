package com.sainath.javabasics;

public class Basic1  {

	private int number;
	public String name;
	
	public Basic1(int number, String name) {
		this.number = number;
		this.name = name;
	}
	public Basic1() {
	}
	
	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	protected void test() {
		System.out.println("Basic");
	}

	public static void main(String[] args) throws Throwable {
		/*Basic1 b = new Basic1(2, "Sai");
		Basic1 b1 = new Basic1(2, "Sai");
		Basic1 b2 = new Basic1(2, "Sai");
		Basic1 b3 = new Basic1(2, "Sai");*/
		
		B bObj = new B();
		bObj.test1();
		
		/*A b = new B();
		b.test();
		b.test1();
		//b.test2();
		Number n = b.test();*/
		
		A a = getObject("C");
		a.test();
		
	}
	private static A getObject(String key) {
		if(key.equals("C"))
			return new C();
		if(key.equals("D"))
			return new D();
		return null;
	}
}

class A {

	protected Number test() throws Throwable {
		System.out.println("A");
		return 0;
	}
	protected void test1() {
		System.out.println("A");
	}
	protected void test1(int x) {
		System.out.println("A");
	}
	protected int test1(int x, int y) {
		System.out.println("A");
		return 1;
	}
}
class B extends A {

	@Override
	protected Integer test() throws Exception {
		System.out.println("B");
		return 1;
	}
	
	protected void test2() {
		System.out.println("B");
	}
	
}

class C extends A {

	@Override
	protected Integer test() throws Exception {
		System.out.println("C");
		return 1;
	}
	
	
}

class D extends A {

	@Override
	protected Integer test() throws Exception {
		System.out.println("D");
		return 1;
	}
	
	
}










