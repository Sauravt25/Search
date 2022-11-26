package com.saurav.error;

import java.util.Scanner;

class InvalidageException extends Exception {
    public InvalidageException(String s)
    {
        // Call constructor of parent Exception
        super(s);
    }
}

public class UserDefineError {

	public static void main(String[] args) throws InvalidageException {
		Scanner sc=new Scanner(System.in);
		int age=sc.nextInt();
		if(age<18) {
			throw new InvalidageException("can't eligible for vote");
		}
		else {
			System.out.println("Eligible for vote");
		}
         sc.close();
	}

}