package com.New;

public class Construct1 {

	String name;
	int age;
	String gender;
	String occ;

	public Construct1(String n, int a, String g) {
		name = n;
		age = a;
		gender = g;
	}

	public Construct1(String n, int a, String g, String o) {
		name = n;
		age = a;
		gender = g;
		occ = o;

	}

	public void display() {
	System.out.println(name +" "+ age+ " " + gender +" "+ occ);
	 }

	public static void main(String args[]) {

		Construct1 co = new Construct1("ravi", 45, "Male");

		System.out.println();
		 co.display();
	}
}
