package com.program;

public class RemoveArray {

	public static void main(String[] args) {
		int[] ar= {10,20,30,60,80,90};
		int[]  a = deleteArray(ar,2);
		  for (int i=0;i<=a.length-1;i++)
		  {
			  System.out.println(a[i]);
		  }
}
	static int[] deleteArray(int[] ar,int in) {
		if(in<0 || in>=ar.length)
		{
			System.out.println("array out of length");
			return ar;
		}
		int br[]=new int[ar.length-1];
		for(int i=0;i<br.length;i++) {
			if(i<in)
				br[i]=ar[i];
			else
				br[i]=ar[i+1];
		}
		return br;
	}
}