package ex05method;

import java.util.Scanner;

/*
문제5) 파일명 : QuFibonacci.java
피보나치 수열은 첫항이 0, 두번째항이 1로 구성되어 이전 2개의 항을 더해서 
다음 항을 만들어낸다. 입력한 정수의 갯수만큼 항목을 출력하도록 프로그램을 작성하시오. 
 */
public class QuFibonacci {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("숫자를 입력하세요:");
		int n = scanner.nextInt();
		
		System.out.println("메서드1-배열사용");
		fibonacciProgression1(n);
		System.out.println("메서드2-일반변수사용");
		fibonacciProgression1(n);
	}

	static void fibonacciProgression1(int n) {		
		if (n <= 2) {
            System.out.println("피보나치 수열은 0,1부터 시작이므로 "
					+ " 항상 3이상 입력해야 합니다.");
            return;
        }

        int[] fibo = new int[n];

        // 첫 두 수는 0과 1로 초기화
        fibo[0] = 0;
        fibo[1] = 1;

        // 나머지 수를 계산
        for (int i = 2; i < n; i++) {
            fibo[i] = fibo[i - 1] + fibo[i - 2];
        }

        // 피보나치 수열 출력
        for (int i = 0; i < n; i++) {
            System.out.print(fibo[i] + " ");
        }
        System.out.println();
	}
	
	static void fibonacciProgression2(int n) {		
		if (n <= 2) {
            System.out.println("피보나치 수열은 0,1부터 시작이므로 "
					+ " 항상 3이상 입력해야 합니다.");
            return;
        }
	
		int f1=0, f2=1, f3;
		System.out.printf("%d %d ", f1, f2);
		
		for(int i=1 ; i<=n-2 ; i++) {
			//첫번째수와 두번째수를 더한후 곧바로 출력한다.
			f3 = f1 + f2;
			System.out.printf("%d ", f3);
			
			//f1, f2에 새로운값(다음항목)으로 변경한다. 
			f1 = f2;
			f2 = f3;
		}
		System.out.println();
	}
}
