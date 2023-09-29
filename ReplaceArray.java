package com.program;

public class ReplaceArray {
//Replaceing the array element by their sum
	public static void main(String[] args) {
	int[] arr= {123,345,67,80,143,100};
	
	for (int i=0;i<=arr.length-1;i++) {
		int a=
				sumOfDigits(arr[i]);
		System.out.println(a);
	}
	
	}
	static int sumOfDigits(int arr){
		int sum=0;
		do {
			sum=sum+arr%10;
			arr/=10;
			
		}while(arr!=0);
		return sum;
	}

}
