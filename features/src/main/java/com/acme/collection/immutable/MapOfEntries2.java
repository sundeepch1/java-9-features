package com.acme.collection.immutable;

import java.util.List;
import java.util.Map;

import static java.util.Map.entry;

public class MapOfEntries2 {
	public static void main(String[] args) {
		List<String> imtList1 = List.of("P1", "Q1");
		List<String> imtList2 = List.of("P2", "Q2");	

		Map<Integer, List<String>> map = Map.ofEntries(
				entry(111, imtList1),
				entry(222, imtList2)
				);
		System.out.println(map);
	}
} 
