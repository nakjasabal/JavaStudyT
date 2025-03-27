package ex06array;

import java.util.Random;

public class E01OneDimArray02 {

	public static void main(String[] args) {
		 
		/*
		난수 생성 방법1
		: Math클래스의 random() 메서드는 0~1사이의 실수를 랜덤하게
		반환한다. 정수형태의 난수가 필요하다면 10, 100과 같은 정수를
		곱해주면된다. */
		double rndNumber = Math.random();
		System.out.println("생성된난수[실수]:"+ rndNumber);
		//정수와 실수의 연산은 실수가 반환되므로 int로 강제형변환한다.
		int intNumber = (int)(Math.random()*100);
		System.out.println("생성된난수[정수]:"+ intNumber);

		/*
		난수 생성 방법2
		: Random 클래스를 사용한다. 사용법은 Scanner클래스와 동일하게
		정수형 난수를 생성하고 싶다면 nextInt()를 호출한다. */
		Random random = new Random();
		System.out.println("생성된난수:"+ random.nextInt()); 	
		System.out.println("==============================");
		
		/*
		로또번호처럼 1~45사이의 난수를 생성하는 방법
		1.0.xxx형태의 난수를 생성한 후 정수로 변경하기 위해 100을 
			곱해준다. 
		2.45로 %연산하여 나머지를 구한다. 정수를 45로 나누면 나머지는
			0~44사이가 된다 .
		3.0은 구간에 포함되지 않으므로 결과에 1을 더해준다. 
		4.마지막으로 정수로 만들어주기 위해 강제형변환한다. 
		 */
		System.out.println("1~45사이의 난수생성:"+
				((int)((Math.random()*100) % 45)+1) );

		System.out.println("===========================");

		/*
		크기가 6인 배열을 생성한 후 난수를 저장하고 출력한다. 
		중복된 난수가 생성될 수 있고, 정렬 또한 되지 않는다. 
		 */
		System.out.println("크기가 6인 배열에 난수 입력");
		int[] lottoNum = new int[6];
		//난수생성 후 입력
		for(int i=0 ; i<lottoNum.length ; i++) {
			lottoNum[i] = 
				(int)((Math.random()*100) % 45) + 1;
		}
		//배열 출력 		
		for(int i=0 ; i<lottoNum.length ; i++) {
			System.out.printf("%d ", lottoNum[i]);
		}		
	}
}
