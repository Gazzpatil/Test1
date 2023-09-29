package com.program;

public class AddArrEle {

	public static void main(String[] args) {
	int[] arr= {12,23,50,70,80};
	int[] a	=addEle(arr,0,88);
	for(int i=0;i<=a.length-1;i++) {
		System.out.println(a[i]);
	}
	}
 static int[] addEle(int[] arr,int in,int ele){
	 if(in<0||in>=arr.length) {
		 System.out.println("array out of bound");
		 return arr;
	 }
	 int[] brr=new int[arr.length+1];
	 for(int i=0;i<=arr.length-1;i++) {
	 if(i<in) {
		 brr[i]=arr[i];	 
	 }
	 else {
		 brr[i+1]=arr[i];
	 }
	 }
	 brr[in]=ele;
	 return brr;
	 
		
	}

}
