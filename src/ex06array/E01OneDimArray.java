package ex06array;

/*
배열 : 순차적인 메모리의 공간이 할당되는 형태로써 하나가 아니라 
	여러개의 변수가 필요한 경우 사용한다. 
-자바에서는 배열을 인스턴스 형태로 생성하므로 new를 사용한다. 
-생성된 배열은 힙(Heap)영역에 저장되고, 할당된 메모리의 주소값을
반환한다. 
-따라서 배열명(배열변수)는 주소값(참조값)을 할당받게 된다. 
-우리는 해당 주소를 통해 배열에 접근할 수 있다. 
 */
public class E01OneDimArray {

	public static void main(String[] args) {
		//정수형의 크기가 3인 배열 생성 
		int[] numArr = new int[3];
		//인덱스 0~2까지 접근해서 배열을 초기화 
		numArr[0] = 10; 
		numArr[1] = 20;
		numArr[2] = 30;
		//인덱스로 접근해서 값을 출력 
		System.out.println("numArr의 0번방의 값:"+ numArr[0]); 
		System.out.println("numArr의 1번방의 값:"+ numArr[1]); 
		System.out.println("numArr의 2번방의 값:"+ numArr[2]);
		//정수형 배열이 Heap영역에 생성된 후 반환된 주소값이 출력됨 
		System.out.println("배열명(numArr)="+ numArr); 
		System.out.println("==============================");
		
		
		/*
		배열의 선언 및 초기화
		: 배열은 여러개의 변수를 사용하기 위해 선언하므로 접근을 위해
		일반적으로 반복문(for)을 사용한다. */
		int[] arrNumber = new int[40];
		//"배열명.length"는 배열의 크기를 반환한다. 
		for(int i=0 ; i<arrNumber.length ; i++) {
			//각 원소를 초기화 
			arrNumber[i] = i+10;
		}
		//배열의 각 원소를 출력 
		for(int i=0 ; i<40 ; i++) { 
			System.out.println(i+"번방의값="+ arrNumber[i]);
		}
		System.out.println("=========================");
		
		/*
		인스턴스 배열 : 기본자료형을 저장하는 배열이 아닌 인스턴스의 
			참조값을 저장할 목적으로 생성한 배열을 말하다. 사용법은
			동일하다. */
		String[] strArr = new String[3];
		strArr[0] = "java";
		strArr[1] = "jsp";
		strArr[2] = "spring";
		for(int j=0 ; j<strArr.length ; j++) {
			System.out.println(strArr[j]);
		}
		System.out.println("=========================");

		System.out.println("배열의 선언과 초기화");
		System.out.println("방법1 : 배열의 선언 이후 초기화");
		//가장 기본적인 선언과 초기화 방법. 크기가 1인 배열 생성. 
		int[] initArr = new int[1]; 
		//인덱스로 접근해서 초기화 
		initArr[0] = 100; 
		//인덱스로 출력 
		System.out.println("initArr[0]="+ initArr[0]);

		/*
		배열의 선언과 동시에 초기화하는 경우 자바 컴파일러는 초깃값의
		갯수를 통해 배열의 크기를 결정할 수 있다. 따라서 이런 경우에는
		크기를 생략하도록 약속되어있다. */
		System.out.println("방법2 : 선언과 동시에 초기화1");
		//int[] initArr2 = new int[3] {1, 20, 300};//에러발생
		int[] initArray2 = new int[] {1, 20, 300};

		/*
		배열을 원소만으로 생성한 후 초기화까지 진행한다. 이 경우
		new를 생략할 수 있다. */
		System.out.println("방법3 : 초기값만으로 선언");
		int[] initArr3 = {11, 13, 17, 19, 23};		
		int arrSum = 0;
		//배열의 크기만큼 반복해서 모든 원소를 누적해서 합산한다. 
		for(int x=0 ; x<initArr3.length ; x++) {
			arrSum += initArr3[x];
		}
		System.out.println("배열요소의합은="+ arrSum);
	}
}
