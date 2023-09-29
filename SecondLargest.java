package com.program;

public class SecondLargest {

	public static void main(String[] args) {
		int[] num= {10,20,44,90,10,98,98};
		int largest=Integer.MIN_VALUE;
		int secsmallest=Integer.MAX_VALUE;
		for(int i=0;i<=num.length-1;i++) {
			if(num[i]>largest) {
				secsmallest=largest;
				largest=num[i];
			}
			if(num[i]<largest&&num[i]>secsmallest) {
				secsmallest=num[i];
				
			}
		}
		System.out.println("second smallest number is:"+secsmallest);
	}

}
