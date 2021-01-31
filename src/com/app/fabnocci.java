package com.app;

public class fabnocci {

	public static void main(String[] args) {

		// 0,1,1,2,3,5,8...
	int n1=0,n2=1,temp;
	System.out.print(n1+" "+n2);
	for(int i=0;i<5;i++)
	{
		temp=n1+n2;
		System.out.print(" "+temp);
		n1=n2;
		n2=temp;
		
	}
	
	
	}

}
