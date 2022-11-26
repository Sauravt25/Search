package com.saurav.error;

import java.util.Scanner;

public class TryAndCatch {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Entre your age");
		int age=sc.nextInt();
		int b=0,c;
		try {
			c=age/b;
			System.out.println("Age after divide  "+c);
		}
		catch(Exception err) {
			System.out.println(err);
		}
		finally{
			System.out.println("In the final block");
		}
        
	}

}
