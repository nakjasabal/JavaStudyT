package ex03operator;

public class E04LogicOperator {
	
	/*
	논리연산자
		&& : 논리And. 양쪽 모두가 true일때만 true를 반환하고
			나머지는 false를 반환.
		|| : 논리Or. 한쪽만 true이면 true를 반환하고, 양쪽 
			모두 false일때만 false를 반환.
		! : 논리Not. 반대의 논리를 반환. 
	 */
	public static void main(String[] args) {
		 
		int num1=10, num2=20;
		// false && true => false 
		boolean result1 = (num1==100 && num2==20);
		// true || fasle => true
		boolean result2 = (num1<12 || num2>=30);  

		System.out.println("result1의결과:"+ result1);
		System.out.println("result2의결과:"+ result2);
		
		// !(false) => ture이므로 if문의 블럭이 실행됨. 
		if(!(num1==num2)) {
			System.out.println("num1과 num2는 다르다");
		}
		else {
			System.out.println("num1과 num2는 같다.");
		}
	}
}
