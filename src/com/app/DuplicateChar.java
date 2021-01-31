package com.app;

import java.util.HashMap;
import java.util.Iterator;

public class DuplicateChar {

	public static void main(String[] args) {

		String str = "Vvijayy";
		char[] charArray = str.toCharArray();
		HashMap<Character, Integer> hashMap = new HashMap<>();
		for (Character character : charArray) {

			if (hashMap.get(character) != null) {
				hashMap.put(character, hashMap.get(character)+1);

			} else {
				hashMap.put(character, 1);
			}
		}
		Iterator<Character> iterator = hashMap.keySet().iterator();
		while(iterator.hasNext())
		{
			Character dupl = iterator.next();
			if(hashMap.get(dupl)>1)
			{
				System.out.println(dupl+ " : "+hashMap.get(dupl));
			}
		}

	}

}
