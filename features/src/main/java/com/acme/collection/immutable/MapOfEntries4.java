package com.acme.collection.immutable;

import java.util.Map;

import static java.util.Map.entry;

public class MapOfEntries4 {
	public static void main(String[] args) {
		Student s1 = new Student(24, "Mahesh");
		Student s2 = new Student(25, "Suresh");
		
		Map<String, Student> map = Map.ofEntries(
			entry("one", s1),
			entry("two", s2)
		);
		map.forEach((k, v) -> System.out.println(k + " - " + v.getName()));
	  }
}
