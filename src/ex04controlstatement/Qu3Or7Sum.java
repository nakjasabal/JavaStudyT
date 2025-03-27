package ex04controlstatement;
/*

문제4) 1~100까지의 숫자중 3의배수 이거나 7의배수인 숫자의 
합을 구하는 프로그램을 while문으로 작성하시오. 
단, 3과 7의 공배수인 경우 합에서 제외해야 한다. 
출력의 결과는 누적되는 모든 수를 콘솔에 print한다.
파일명 : Qu3Or7Sum.java
 */
public class Qu3Or7Sum {

	public static void main(String[] args) {
		
		//while문
		int sum = 0;
		//100번반복
		int i=1;
		while(i<=100) {
			//3 혹은 7의 배수
			if(i%3==0 || i%7==0) {
				//3과 7의 공배수는 제외
				if(i%(3*7)!=0) {
					//조건에 맞는 정수를 누적해서 더한다. 
					sum += i;
					//모든 수를 콘솔에 출력한다. 
					System.out.print(i);
					//출력결과 i의 마지막 값이 99
					if(i<99) System.out.print("+");
				}
			}
			i++;
		}
		//정답도 출력한다. 
		System.out.println("="+ sum);
		
		//do~while문
		sum = 0;
		i=1;
		do {
			if(i%3==0 || i%7==0) {
				if(i%(3*7)!=0) {
					sum += i;
					System.out.print(i);
					if(i<99) System.out.print("+");
				}
			}
			i++;			
		}		
		while(i<=100);
		System.out.println("="+ sum);
		
		//for문
		sum = 0;
		for(int x=1 ; x<=100 ; x++) {
			if(x%3==0 || x%7==0) {
				if(x%(3*7)!=0) {
					sum += x;
					System.out.print(x);
					if(x<99) System.out.print("+");
				}
			}
		}
		System.out.println("="+ sum);	
		
	}
}
