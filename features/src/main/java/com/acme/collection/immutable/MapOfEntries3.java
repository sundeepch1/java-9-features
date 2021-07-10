package com.acme.collection.immutable;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static java.util.Map.entry;

public class MapOfEntries3 {
	public static void main(String[] args) {
		List<String> list1 = new ArrayList<>();
		list1.add("P1");
		list1.add("Q1");	
		List<String> list2 = new ArrayList<>();
		list2.add("P2");
		list2.add("Q2");	

		Map<Integer, List<String>> map = Map.ofEntries(
			entry(111, list1),
			entry(222, list2)
		);
		System.out.println(map);
		
		list1.add("R1");
		System.out.println(map);	
	  }
}
