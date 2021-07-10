package com.acme.collection.immutable;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class ImmutableSet {
	public static void main(String... strings) {

		Set<Integer> se = new HashSet<Integer>() { private static final long
			serialVersionUID = 1L; { 
				add(1); 
				add(5); 
				add(6); 
			}};

			Set<Integer> set = new HashSet<Integer>(); 
			set.add(1); 
			set.add(3);


			Set<Integer> set1 = Collections.unmodifiableSet(set);
			set1.add(50);
			System.out.println(set1);
	}
}
