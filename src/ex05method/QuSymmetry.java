package ex05method;

public class QuSymmetry {

	static void rotationSymmetry1() {
		System.out.println("while문");
		int a = 1;
		while(a<=4) {
			//(행이 고정된 상태에서) 열에 대한 반복
			int b = 1;
			while(b<=4) {
				//슬러쉬 방향으로 출력시에는 더해서 5가 될때
				if(a+b==5)
					System.out.print("1 ");
				else
					System.out.print("0 ");
				b++;
			}
			a++;
			System.out.println();
		}
	}
	
	static void rotationSymmetry2() {
		System.out.println("for문");
		for(int a=1 ; a<=4 ; a++) {
			for(int b=1 ; b<=4 ; b++) {
				if(a+b==5)
					System.out.print("1 ");
				else
					System.out.print("0 ");
			}
			System.out.println();
		}		
	}
	
	public static void main(String[] args) {
		rotationSymmetry1();
		rotationSymmetry2();
	}

}
