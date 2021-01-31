package com.app;

import java.util.HashSet;

public class DuplicateArrayele {

	public static void main(String[] args) {

		int a[]= {1,2,3,9,4,5,8};
		HashSet<Object> hashSet = new HashSet<>();
		boolean isexits=false;
		
		for(int i=0;i<a.length;i++)
		{
			if(hashSet.contains(a[i]))
			{
				isexits=true;
				System.out.println("duplicate ele :"+a[i]);
			}
			else {
				hashSet.add(a[i]);
			}
		}
		if(!isexits)
		{
			System.out.println(-1);
		}
	}
}
