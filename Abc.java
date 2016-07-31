 package com.New;

public class Abc implements Printable,Showable {

	
	@Override
	public void show() {
		
		System.out.println("showed method");
	}

	@Override
	public void print() {
		System.out.println("printed method");
		
	}
public static void main(String[] args) {
		
Abc obj = new Abc();
obj.print();
obj.show();
	}

}
