package com.app;

import java.util.HashMap;
import java.util.Iterator;

public class DuplicateString {

	public static void main(String[] args) {

		String s = "I AM AM LEARINING JAVA JAVA";
		String[] split = s.split(" ");
		HashMap<String, Integer> hashMap = new HashMap<>();
		for (String tempstring : split) {

			if (hashMap.get(tempstring) != null) {

				hashMap.put(tempstring, hashMap.get(tempstring) + 1);

			} else

				hashMap.put(tempstring, 1);
		}
		Iterator<String> iterator = hashMap.keySet().iterator();
		while(iterator.hasNext())
		{
			String string = iterator.next();
			if(hashMap.get(string)>1)
			{
				System.out.println(string + " is repeated " +hashMap.get(string));
			}
		}
		

	}

}
