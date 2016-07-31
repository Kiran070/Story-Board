package com.New;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.*;

public class Arlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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


