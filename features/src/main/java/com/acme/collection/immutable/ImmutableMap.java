package com.acme.collection.immutable;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class ImmutableMap {
	
	public static void main(String...strings) {

		Map<Integer, String> map = new HashMap<Integer, String>();
        map.put(1, "Ghost");
        map.put(2, "exits");
        map.put(3, "all");
  
        Map<Integer, String> imap = Collections.unmodifiableMap(map);
  
        map.put(4, "over the ");
        map.put(5, "world");
  
        System.out.println(imap);
        
        //In java 9 to create immutable map
        Map<Integer,String> nonemptyImmutableMap = Map.of(1, "one", 2, "two", 3, "three");
        System.out.println(nonemptyImmutableMap);
        
	}
}
