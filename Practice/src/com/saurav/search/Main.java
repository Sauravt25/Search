package com.saurav.search;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		
		while(t-- >0) {
			int n=sc.nextInt();
			int k=sc.nextInt();
			int[] arr=new int[n];
			for(int i=0;i<n;i++) {
				arr[i]=sc.nextInt();
			}
			Solution s=new Solution();
		     int ans=s.search(arr, k, n);
		     
		     System.out.println(ans);
		}
	}

}


class Solution{
	
	public int search(int[] arr, int k,int n) {
       for(int i=0;i<n;i++){
    if(k==arr[i]){
        return i+1;
       }
     }
       return -1;
	}
}
