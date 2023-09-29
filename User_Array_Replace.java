package com.program;
import java.util.Scanner;
public class User_Array_Replace {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the values");
		int size=sc.nextInt();
		int[] arr=new int[size];
			System.out.println("Enter "+ size+" values");
		for(int i=0;i<=arr.length-1;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("to display the user entered array");
		for(int i=0;i<=arr.length-1;i++) {
		int a	=sumOfDigit(arr[i]);
		System.out.println("sum of each digit of array element:"+arr[i]+" is "+a);
		}
		
	sc.close();
	}
	static int sumOfDigit(int a){
		int sum=0;
		do {
			int d=a%10;
			sum+=d;
			a/=10;
			
		}while(a!=0);
		return sum;
	}
}
