//package ex16exception;
//
//import java.util.InputMismatchException;
//import java.util.Scanner;
//
//class AgeErrorException2 extends Exception {
//	public AgeErrorException2() {
//		super("나이 입력이 개잘못 되었어요");
//	}
//}
//
//public class Ex06DeveloperDefine2 {
//
//	public static void main(String[] args) {
//
//		System.out.print("나이를 입력하세요 : ");		 
//		int age = readAge();
//		System.out.println("당신의 나이는 "+ age +" 입니다.");
//	}
//	
//	public static int readAge() {
//		Scanner sc = new Scanner(System.in);
//		int inputAge=0;
//		try {
//			inputAge = sc.nextInt();
//		}
//		catch(InputMismatchException e) {
//			e.printStackTrace();
//			System.exit(0);
//		}
//		/* 개발자가 직접 예외상황을 if문으로 확인한 후 예외객체를
//		만들어 프로그램으로 throw한다. 그 즉시 에러가 발생하므로
//		'예외던지기'를 하지 않고 여기서 직접 try~catch문으로
//		'예외처리'한다. */
//		try {
//			if(inputAge<0) {
//				AgeErrorException2 ex = new AgeErrorException2();
//				throw ex;			
//			}
//		}
//		catch (AgeErrorException2 e) {
//			System.out.println(e.getMessage());
//			System.exit(0);
//		}
//		
//		return inputAge;
//	}
//}
//
//
//
//
