package com.program;

public class CombineArray {
// combining the two array into single array
	public static void main(String[] args) {
		int[] a= {10,45,78,45,55,80};
		int[] b= {20,50,80,88,40};
		int[] arr=new int[a.length+b.length];
		for (int i=0;i<=a.length-1;i++) {
			arr[i]=a[i];
		}
		for(int j=0;j<=b.length-1;j++) {
			arr[a.length+j]=b[j];
		}
		for(int i=0;i<=arr.length-1;i++) {
			System.out.println(arr[i]);
		}
	}

}
