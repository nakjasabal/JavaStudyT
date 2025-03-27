package ex04controlstatement;

/*
break : 반복문이나 switch문에서 사용되며 블럭내에서 탈출할때
	사용된다. 만약 중첩된 반복문이라면 가장 가까운 블럭 하나만
	탈출한다. 
continue : 반복문의 처음으로 돌아간다. while문의 경우 조건을
	확인하고, for문의 경우 증감식이 실행된다. 
위 2개의 문장은 반드시 조건문과 함께 사용되어야 한다. 그렇지 않으면
하위 코드는 실행되지 않는 쓰레기코드가 되기때문에 에러가 발생된다. 	
 */
public class E06BreakContinue {

	public static void main(String[] args) {
		
		int i = 0;
		//무한루프 조건으로 while문 정의 
		while(true) {			 
			i++;
			System.out.printf("[i가 %d일때]\n", i);
			
			System.out.println("continue이전 출력문");
			//i가 짝수인 경우 반복문의 처음으로 돌아간다. 
			if(i%2==0) continue;
			System.out.println("continue이후 출력문");

			System.out.println("break이전 출력문");
			//i가 3일때 반복문을 탈출한다. 
			if(i==3) break;
			System.out.println("break이후 출력문");
		}
		
		/*
		중첩된 반복문 내부에서 break를 만나면 가장 가까운 반복문
		하나만 탈출하게된다. */
		for(int x=1 ; x<=5 ; x++) {
			//x는 1~5까지 전체가 출력됨 
			System.out.println("x="+x);
			for(int y=1 ; y<=5 ; y++) {
				System.out.println("y="+ y);
				if(y==3)
					break;//1~3까지만 출력됨 
			}
		}	
	}
}
