package com.program;
import java.util.*;
import java.util.Scanner;
public class ArrayOperation {

	public static void main(String[] args) {
		ArrayOperation ao=new ArrayOperation();
		int[] arr=ao.readArray();
		ao.display(arr);
	}
		
int[] readArray() {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the value");
	int size=sc.nextInt();
	System.out.println("enter "+size+" values");
	int[] arr=new int[size];
	for(int i=0;i<=arr.length-1;i++) {
		arr[i]=sc.nextInt();
		
}
	return arr;
	
}
void display(int[] arr) {
	for(int i=0;i<=arr.length-1;i++) {
		System.out.println(arr[i]+" ");
	}
	System.out.println();
}
}	
	


