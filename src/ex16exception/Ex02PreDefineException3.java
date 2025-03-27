package ex16exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex02PreDefineException3 {
 
	public static void main(String[] args)  {	
 
		/*
		정수를 입력해야 하는데 문자 혹은 문자열을 잘못 입력한 경우에
		발생되는 예외. nextInt()에서 발생한다. */
		System.out.println("### InputMismatchException ###");
		Scanner sc = new Scanner(System.in);		
		try {
			System.out.print("나이를 입력하세요:");
			int intAge = sc.nextInt(); 
			int ageAfter10 = intAge + 10;
			System.out.println("당신의 10년후 나이는:"+ ageAfter10);
		}
		catch(InputMismatchException e) {
			System.out.println("나이를 문자형태로 입력하면 앙데요");
			System.out.println("예외메세지:"+e.getMessage());
			e.printStackTrace();
		} 
		
	}////end of main 
}
