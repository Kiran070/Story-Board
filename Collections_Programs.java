package com.New;

import java.util.*;

public class Collections_Programs {

	public static void main(String[] args) {
		/*
		 * LinkedList<String> ll = new LinkedList<String>(); ll.add("Rahul");
		 * ll.add("kiran"); ll.add("abc"); System.out.println("Names are:");
		 * Iterator<String> itr = ll.iterator(); while (itr.hasNext()) {
		 * 
		 * System.out.println(itr.next());
		 */

		/*
		 * ArrayList<String> al = new ArrayList<String>(); al.add("Kiran");
		 * al.add("germany"); al.add("indentation");
		 * 
		 * LinkedList<String> ll = new LinkedList<String>(); ll.add("Finance");
		 * ll.add("Banking"); ll.add("Banking"); ll.addAll(al);
		 * System.out.println(ll);
		 */

		/*
		 * ArrayList<String> al = new ArrayList<String>(); al.add("Germany");
		 * al.add("France"); al.add("Neptune"); al.add("Pluto");
		 * ListIterator<String> li = al.listIterator(); System.out.println(
		 * "Elements traversing in forward direction"); while (li.hasNext()) {
		 * System.out.println(li.next()); } System.out.println(
		 * "Elements traversing in backward direction"); while
		 * (li.hasPrevious()) { System.out.println(li.previous()); }
		 * 
		 * } }
		 */

		/*
		 * HashSet<String> hs = new HashSet<String>(); hs.add("German artilery"
		 * ); hs.add("global management"); hs.add("global warming"); hs.add(
		 * "global management");
		 * 
		 * Iterator<String> itr = hs.iterator(); while (itr.hasNext()) {
		 * System.out.println(itr.next()); }
		 * 
		 * } }
		 */
		/*
		 * TreeSet<String> tr= new TreeSet<String>(); tr.add("jonathan");
		 * tr.add("hoolihan"); tr.add("centenario");
		 * 
		 * Iterator itr = tr.iterator();
		 * 
		 * while(itr.hasNext()){ System.out.println(itr.next());
		 */

		/*
		 * PriorityQueue<String> q = new PriorityQueue<String>();
		 * q.add("hillary"); q.add("clinton"); q.add("hillary"); q.add("obama");
		 * q.add("hillary");
		 * 
		 * System.out.println("head:"+q.element());
		 * System.out.println("head:"+q.peek());
		 * 
		 * Iterator<String> itr = q.iterator(); while (itr.hasNext()) {
		 * System.out.println(itr.next()); q.remove(); q.poll();
		 * 
		 * System.out.println("Queue after removing elements"); Iterator<String>
		 * itr2 = q.iterator(); while(itr2.hasNext()){
		 * System.out.println(itr2.next()); }
		 * 
		 * } } }
		 */
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(1,"First");
		hm.put(2, "Second");
		hm.put(3, "Third");
		
		for(Map.Entry m:hm.entrySet()){
			System.out.println(m.getKey()+" "+m.getValue());
		}
	}
}
