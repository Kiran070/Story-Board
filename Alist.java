package com.New;
import java.util.*;
public class Alist {

	public static void main(String[] args) {
	/*	ArrayList<String> al = new ArrayList<String>();
		al.add("abc");
		al.add("def");
		al.add("ghi");
		Iterator itr = al.iterator();
		while(itr.hasNext()){
			System.out.print(itr.next() + " ");
		*/
		
	/*ArrayList<String> al = new ArrayList<String>();
	al.add("john");
	al.add("ramsis");
	al.add("ramos");
	al.add("String");
	
	ArrayList<String> al2 = new ArrayList<String>();
	al2.add("christiano");
	al2.add("nemesis");
	al2.add("johnson");
	
	al2.addAll(al);
	
	Iterator itr = al2.iterator();
	while(itr.hasNext()){
		System.out.println(itr.next());
	*/
		
	/*ArrayList al = new ArrayList();
	al.add("roger");
	al.add(123);
	al.add("federer");
	
	Iterator itr = al.iterator();
	while(itr.hasNext()){
		System.out.println(itr.next());
	*/
	ArrayList<String> al = new ArrayList<String>();
	al.add("Roger");
	al.add("Mirka");
	al.add("1234");
	
	ArrayList<String> al2 = new ArrayList<String>();
	al2.add("1234");
	al2.add("489");
	al2.add("4589");
	al2.add("45456");
	
	al.removeAll(al2);
	System.out.println("iterating the elements after removing al2:");
	Iterator itr = al.iterator();
	while(itr.hasNext())
	{
		System.out.print(itr.next());
	}
	
	
	
	}
		

	}


