package com.program;
import java.util.Scanner;
public class BiggestArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of an array");
		int size=sc.nextInt();
		int[] ar=new int[size];
		System.out.println("enter "+size+" values");
		for(int i=0;i<=ar.length-1;i++) {
			ar[i]=sc.nextInt();
		}
		System.out.println("Display the user array");
		for(int i=0;i<=ar.length-1;i++) {
			System.out.println(i+"--->"+ar[i]);
		
		}
		int a=biggest(ar);
		System.out.println(a);
		
		sc.close();
	}
	static int biggest(int[] ar){
		int big=ar[0];
		for(int i=1;i<=ar.length-1;i++) {
			
			if (ar[i]>big)
				big=ar[i];
		}
		return big;
	}

}
