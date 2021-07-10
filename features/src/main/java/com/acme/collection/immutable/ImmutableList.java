package com.acme.collection.immutable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ImmutableList {

	public static void main(String... strings) {


		List<Integer> li = new ArrayList<Integer>() { private static final long
			serialVersionUID = 1L; { 
				add(1); 
				add(5); 
				add(6); 
			}};

			List<Integer> list = new ArrayList<Integer>(); 
			list.add(1); 
			list.add(3);


			List<Integer> un = Collections.unmodifiableList(list);
			un.add(50);
			System.out.println(un);
	}
}