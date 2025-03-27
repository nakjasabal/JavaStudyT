package ex06array;

public class E05TwoDimArray02 {

	public static void main(String[] args) {
		
		//3행4열 크기의 2차원배열 생성 
		int[][] arr2Dim = new int[3][4];
		
		//각 행과 열의 크기만큼 반복해서 배열을 초기화 
		for(int i=0 ; i<3 ; i++) {
			for(int j=0 ; j<4 ; j++) {
				//i+j 의 결과값을 각 원소에 할당한다. 
				arr2Dim[i][j] = i + j;  
			}
		}
		
		/*
		배열명.length : 배열의 행 크기를 반환
		배열명[index].length : 각 행의 열 크기를 반환 */
		for(int n=0 ; n<arr2Dim.length ; n++) {
			for(int m=0 ; m<arr2Dim[n].length ; m++) {
				System.out.print(arr2Dim[n][m] +" ");
			}
			System.out.println();
		}

		/*
		시나리오] 다음 절차에 따라 프로그램을 작성하시오.
		1. 2차원 배열을 선언한다. 세로(행)2, 가로(열)4
		2. 난수를 이용하여 배열을 초기화한다. (0~100사이)
		3. 배열전체요소를 매개변수로 전달된 정수만큼 증가시킨다.
		4. 증가되기 전, 후 배열을 출력한다.
		5. 다음 메소드명으로 구현한다. twoDimPlus()
		 */
		//2행 4열 크기의 2차원배열을 생성 
		int[][] twoArray = new int[2][4];
		for(int i=0 ; i<twoArray.length ; i++) {
			for(int j=0 ; j<twoArray[i].length ; j++) {
				//난수를 통해 각 원소를 초기화 
				twoArray[i][j] = (int)(Math.random() * 100);
			}
		}
		System.out.println("=초기화후=====================");		
		showArray(twoArray);		
		twoDimPlus(twoArray, 10);
		System.out.println("=메소드호출후=====================");
		showArray(twoArray);
	}
	
	/*
	2차원배열의 참조값을 매개변수로 받은 후 전체 원소를 출력 */
	static void showArray(int[][] arr2) {
		for(int i=0 ; i<arr2.length ; i++) {
			for(int j=0 ; j<arr2[i].length ; j++) {
				System.out.printf("%-4d", arr2[i][j]);
			}
			System.out.println();
		}
	}
	
	/*
	매개변수로 전달된 정수만큼 배열 전체 원소를 증가시킨다. 이를 위해
	복합대입연산자를 사용하고 있다. */
	static void twoDimPlus(int[][] arr2, int plusNum) {
		for(int i=0 ; i<arr2.length ; i++) {
			for(int j=0 ; j<arr2[i].length ; j++) {
				arr2[i][j] += plusNum;
			}
		}
	}
}
