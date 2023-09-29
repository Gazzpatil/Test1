package com.program;
//output->{1,3,12,0,0}
public class MoveZeroes283 {

	public static void main(String[] args) {
		int[] arr= {0};
		
		}
	static void move(int[] arr) {
		if(arr.length==0 || arr.length==1) {
			return;
		}
		int count=0;
		for(int i=0;i<=arr.length-1;i++) {
			if(arr[i]!=0) {
				arr[count]=arr[i];
				count++;
			}		
			}
		while(count<arr.length) {
			arr[count]=0;
			count++;		
			}
		for(int i=0;i<=arr.length-1;i++) {
			System.out.println(arr[i]);
		}
	}
		
	}


