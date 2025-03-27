package ex06array;

import java.util.Scanner;

/*
문제3) 홀수/짝수 구분하여 배열채우기
파일명 : QuFillArray.java
길이가 10인 배열을 선언한 후 총 10개의 정수를 입력받아 순서대로 저장한다. (첫번째배열)
그리고 순서대로 저장된 숫자들을 홀수는 배열의 앞에서부터 채워나가고 짝수는 
배열의 끝에서부터 채워나간다.(두번째배열)
 */
public class QuFillArray {
	
	public static void main(String[] args) {	
		
		//입력받은 정수를 순서대로 입력할 배열
		int[] arr1 = new int[10];
		
		//홀,짝을 구분해서 입력할 배열 선언
		int[] arr2 = new int[10];
		
		Scanner scanner = new Scanner(System.in);
		
		//배열의 첫번째 인덱스와 마지막 인덱스를 변수에 저장한다. 
		int indexStart = 0;
		int indexEnd = arr2.length - 1;//배열의 크기가 변경될때 length를 통해 얻어올수 있다.
		
		//배열의 크기만큼 반복해서 입력받는다.
		for(int i=0 ; i<arr1.length ; i++) {
			//정수를 입력받는다.
			System.out.print("정수입력:");
			int inputNum = scanner.nextInt();
			
			//첫번째 배열에는 입력한 순서대로 채운다.
			arr1[i] = inputNum;
			
			//두번째 배열은 홀/짝을 구분해서 채운다.
			if(inputNum%2==0) {
				/*
				만약 짝수라면 배열의 끝에서부터 채운다.	
				값을 채워준후 인덱스를 1 차감한다. 			
				 */
				arr2[indexEnd--] = inputNum;//배열에 먼저 값이 채워진후 index가 감소한다.
				//indexEnd--;
			}
			else {
				/*
				만약 홀수라면 배열의 앞에서부터 채운다.
				값을 채워준후 인덱스를 1 증가한다.
				 */
				arr2[indexStart++] = inputNum;//배열에 먼저 값이 채워진후 index가 증가한다.
				//indexStart++;
			}
			/*
			증감연산자는 변수 앞에 위치할경우 해당 변수의 값이 먼저 변경된다. 
			하지만 뒤에 위치할 경우 다른 코드가 먼저 실행된후 변수의 값이 뒤에 변경된다. 
			따라서 위 증감되는 코드는 한줄로 줄일 수 있다. 
			 */			
		}
		
		//첫번째 배열 출력
		for(int i=0 ; i<arr1.length; i++) {
			System.out.print(arr1[i]+" "); 
		}
		System.out.println();//배열 출력 후 줄바꿈 해준다.
		//두번째 배열 출력
		for(int i=0 ; i<arr1.length; i++) {
			System.out.print(arr2[i]+" "); 
		}
		
	}

}
