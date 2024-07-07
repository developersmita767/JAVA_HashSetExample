//package com.example;

import java.util.HashSet;

public class HashSetExample {

	public static void main(String[] args) {
		
		HashSet<String> set=new HashSet<String>();
		set.add("B");
		set.add("A");
		set.add("D");
		set.add("C");
	 	System.out.println(set);
		for(String s:set) {
			System.out.println(s);
		}
		boolean insert=set.add("D");
		System.out.println("insert="+insert);
		System.out.println("Z present="+set.contains("Z"));

	}

}
