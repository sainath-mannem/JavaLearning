package com.sainath.javabasics;

import java.util.ArrayList;
import java.util.List;

public class InterfaceTest {

	public static void main(String[] args) {
		Aclass a = new IfaceImpl(1);
		a.display1();
		
		Iface obj = new IfaceImpl(1);
		obj.display();
	}
}

interface Iface {
	public abstract void display();
	public static final int x = 3;
}

abstract class Aclass {
	int i;
	public Aclass(int i) {
		this.i = i;
	}
	abstract void oneAbMethod();
	protected void display1() {
		
	}
}

class IfaceImpl  extends  Aclass implements Iface {

	public IfaceImpl(int i) {
		super(i);
	}

	@Override
	public void display() {
		System.out.println(x);
	}

	@Override
	void oneAbMethod() {
		
	}
	@Override
	public void display1() {
		System.out.println(x);
	}
	public void display2() {
		System.out.println(x);
	}
}