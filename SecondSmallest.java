package com.program;

public class SecondSmallest {

	public static void main(String[] args) {
		int[] num= {10,20,40,5,90,80,60};
		int smallest=Integer.MAX_VALUE;
		int secsmallest=Integer.MIN_VALUE;
		for(int i=0;i<=num.length-1;i++) {
			if(num[i]<smallest) {
				secsmallest=smallest;
				smallest=num[i];
				
			}
			if(num[i]>smallest&&num[i]<secsmallest) {
				secsmallest=num[i];
			}
		}
		System.out.println("the second smallest number is:"+secsmallest);

	}

}
