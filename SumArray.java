package com.program;

public class SumArray {

	public static void main(String[] args) {
		int [] arr= {10,20,45,60,100};
		int sum=0;
		for(int i=0;i<=arr.length-1;i++) {
			sum+=arr[i];
		}
		System.out.println(sum);
	}

}
