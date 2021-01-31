package com.app;

import java.util.HashMap;
import java.util.Iterator;

public class DuplicateCharecter {

	public static void main(String[] args) {

		String s = "javaj2eevijayyyeeaa";
		HashMap<Character, Integer> hashMap = new HashMap<>();
		for (int i = 0; i <= s.length() - 1; i++) {
			char charAt = s.charAt(i);
			if (hashMap.get(charAt) != null) {
				hashMap.put(charAt, hashMap.get(charAt) + 1);
			} else
				hashMap.put(charAt, 1);
		}

		Iterator<Character> iterator = hashMap.keySet().iterator();
		while(iterator.hasNext())
		{
			Character tempcharacter = iterator.next();
			if(hashMap.get(tempcharacter)>1)
			{
				System.out.println(tempcharacter + " is repeated " + hashMap.get(tempcharacter));
			}
		}
	}

}
