package com.saurav.error;

public class Error {

	public static void main(String[] args) throws ArrayIndexOutOfBoundsException{

		
            int number[] = new int[10];
            number[10] = 30 / 0;
        
		boolean ArithmeticException = false;
		boolean ArrayIndexOutOfBoundsException = false;
		if(ArrayIndexOutOfBoundsException ) {
            System.out.println(
                "Index out of size of the array");
        }
		else if(ArithmeticException ) {
            System.out.println(
                "Zero cannot divide any number");
        }
		else {
			
		}
	}

}
