package com.statements;

public class powerofnumber {
	public static int power(int n,int m) {
		int res=1;
		for(int i=0;i<m;i++) {
			res*=n;
		}
		return res;
	}

	public static void main(String[] args) {
		System.out.println(power(2,3)); 

			    

	}

}
