package ex05method;
/*
문제5-4) 파일명 : QuFindPrimeNumber.java  (난이도:상)
전달된 값이 소수인지 아닌지를 판단하여 소수인 경우 true를 아니면 false를 
반환하는 메소드를 정의하고, 이를 이용해서 1부터 100사이의 소수를 전부 
출력하는 main메소드를 정의하자.
 */
public class QuFindPrimeNumber {
	
	//인수로 전달된 정수가 소수인지 판단하여 true/false를 반환한다. 
	public static boolean isPrimeNumber(int n) {
		
		//정수 1은 소수가 아니므로 확인절차 없이 false를 반환한다.
		if(n==1) return false; 
		
		/* 만약 정수 7이라면 1과 7로는 무조건 나눠서 떨어지므로
		소수 검사를 위해 2~6까지만 나눠보면 된다. 따라서 정수
		n 이라면 2부터 n-1 까지만 확인하면 된다. */
		for(int j=2 ; j<n ; j++) {
			/* 만약 나눠서 떨어지는것이 발견되었다면 이미 소수가
			아니므로 뒷부분은 확인할 필요가 없다. 따라서 즉시 
			false를 반환하여 메서드를 종료한다. */
			if(n % j == 0) {
				return false; 
			}
		}
		//위 반복문을 벗어났다면 소수이므로 true를 반환한다.
		return true;
	}
	public static void main(String[] args) {
		//1~100까지의 정수 중 소수인지 판단한다. 
		for(int i=1 ; i<=100 ; i++) {
			boolean result = isPrimeNumber(i);
			//만약 소수면 true를 반환하여 출력한다. 
			if(result==true)
				System.out.println("소수="+ i);
			//소수가 아니라면 출력하지 않는다. 
		}		 
	}
}















