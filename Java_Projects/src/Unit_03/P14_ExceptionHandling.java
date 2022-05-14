package Unit_03;

import java.util.InputMismatchException;
import java.util.Scanner;

public class P14_ExceptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SampleClass obj = new SampleClass();
		
		//obj.basicException();
		obj.handleException();
		obj.multipleCatch();
		obj.inputMisMatchException();
		//obj.stackOverFlowError(2);
		obj.indexOutofBoundException();
		obj.nullPointerException();
		obj.useOfThrow_And_Finally();
		obj.manualExceptionThrow();
	}
}
	
@SuppressWarnings("serial")
class ManualException extends Exception {
		
	@Override
	public String getMessage() {
		String detailMessage = "Exception Occured!";
		return detailMessage;
	}
}

class SampleClass{
	
	Scanner sc = new Scanner(System.in);
	
/*	void basicException() {
		System.out.println("Inside basic Exception");
		System.out.println("Enter first number: ");
		int a = sc.nextInt();
		System.out.println("Enter Second number: ");
		int b = sc.nextInt();
		int result = a/b;
		
		System.out.println(result);
	}*/
	
	void handleException() {
		System.out.println("Inside handle Exception");
		try {
			System.out.println("Enter first number: ");
			int a = sc.nextInt();
			System.out.println("Enter Second number: ");
			int b = sc.nextInt();
			int result = a/b;
			
			System.out.println(result);
		}
		catch(ArithmeticException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("Done!");
	}
	
	void multipleCatch() {
		
		System.out.println("Inside multiple Exception");
		
		try {
			System.out.println("Enter first number: ");
			int a = sc.nextInt();
			System.out.println("Enter Second number: ");
			int b = sc.nextInt();
			int result = a/b;
			
			System.out.println(result);
		}
		catch(ArithmeticException e) {
			System.out.println(e.getMessage() + "Arithmetic");
		}
		catch(Exception e) {
			System.out.println(e.getMessage() + "Exception");
		}
	}
	
	void inputMisMatchException() {
		
		System.out.println("Inside inputMisMatchException Exception");
		
		try {
			System.out.println("Enter a number: ");
			int a = sc.nextInt();
			
			System.out.println("Number: " + a);
		}
		catch(InputMismatchException e) {
			System.out.println(e + "Resolved");
		}
		
		System.out.println("Done!");
		
	}
	
	/*void stackOverFlowError(int i) {
		
		System.out.println("Inside stackOverFlowError Exception");
		try {
			while(i > 0) {
				i++;
				stackOverFlowError(i);
			}
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("Other code execute!!");
	}*/
	
	void indexOutofBoundException() {
		
		System.out.println("Inside indexOutOfBoundException Exception");
		try {
			int[] num = {1,2,3,4};
			System.out.println(num[10]);
		}
		catch(IndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("Done!");
	}
	
	void nullPointerException() {
		
		System.out.println("Inside nullPointerException Exception");
		try {
			String s = null;
			System.out.println(s.length());
			
		}
		catch(NullPointerException e) {
			System.out.println(e.getMessage());
		}
	}
	
	void useOfThrow(int age) throws Exception {
		
		System.out.println("Inside useOfThrow Exception");
		if (age < 18) {
			throw new Exception();
		}
		else {
			System.out.println("Your are allowed to Enter");
		}
	}
	
	void useOfThrow_And_Finally() {
		
		System.out.println("Inside useOfThrow_And_Finally Exception");
		try {
			useOfThrow(17);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally{
			System.out.println("The 'try catch' block is finished");
		}
	}
	
	void manualExceptionThrow() {
		
		System.out.println("Inside manualExceptionThrow Exception");
		try {

			// Have to use try and Catch here!
			calculateArea(-1);
		} 
		catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	void calculateArea(int r) throws ManualException {
		
		System.out.println("Inside CalculateArea");

		if (r < 0) {
			throw new ManualException();
		}

		int area = r * r;
		System.out.println(area);

	}

}

