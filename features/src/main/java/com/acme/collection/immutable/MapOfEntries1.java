package com.acme.collection.immutable;

import java.util.Map;

import static java.util.Map.entry;

public class MapOfEntries1 {
	
	public static void main(String...strings) {
		Map<Integer, String> map = Map.ofEntries(
				entry(101, "PP"),
				entry(102, "QQ"),
				entry(103, "RR")
			);
			map.forEach((k, v) -> System.out.println(k + " - " + v));
	}
}
