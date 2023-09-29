package com.program;

public class ReverseAnArray {

	public static void main(String[] args) {
		int[] arr= {100,200,34,45,101,300};
		for(int i=arr.length-1;i>=0;i--) {
			System.out.println(arr[i]);
		}
	}

}
