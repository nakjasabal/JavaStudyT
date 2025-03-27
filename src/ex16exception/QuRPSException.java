package ex16exception;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;
/*
퀴즈1] 가위/바위/보 입력시 문자가 입력되는 경우 발생되는 
	예외를 처리하시오.(재시작을 위한 메뉴는 제외)
*/
public class QuRPSException {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		int gameCount = 0; 
		
		while(true) {
			//1.난수생성
			int com = random.nextInt(10000) % 3 + 1;//1~3사이의 난수
			System.out.println("컴퓨터:"+ com);
			
			//2.사용자입력			
			int user = 0;
			System.out.println("가위바위보를 입력하세요.");
			System.out.print("가위(1), 바위(2), 보(3)=>");
			try {
				user = scanner.nextInt();
			}
			catch (InputMismatchException e) {
				System.out.println("[예외발생1]숫자만 "
						+ "입력하세요.");
				scanner.nextLine();
			}
			 
				
			//3.승부판단
			//사용자가 정상적으로 입력한 경우
			if(!(user<1 || user>3)) {
				
				//승부판단 로직2 : 입력한 수의 차를 이용해 승부를 판단한다. 
				System.out.printf("사용자:%s, 컴퓨터:%s ", 
						displayRPS(user), displayRPS(com));	
				switch(user - com) {
				case 0:
					System.out.println("비겼습니다.");break;
				case 1: case -2:
					System.out.println("이겼습니다.");break;
				case 2: case -1:
					System.out.println("졌습니다.");break;
				}
								
				gameCount++;//게임카운트 증가		
			}
			else {
				System.out.println("가위바위보 할줄 몰라요?? 제대로 내세요 ㅋ");
			}
		
		
			//4.게임재시작 여부 확인			 
			if(gameCount>=5) {
				//0과 1을 입력하지 않아도 게임은 재시작된다. 
				System.out.print("게임재시작(1), 종료(0):");
				try {
					int restart = scanner.nextInt();
					if(restart==0) {
						//게임종료를 위해 while루프 탈출
						break;
					}
					else {
						System.out.println("게임 재시작^^");
						gameCount=0;
					}		
				}
				catch (InputMismatchException e) {
					System.out.println("[예외발생2]숫자만"
							+ " 입력하세요.");
					scanner.nextLine();
					gameCount=0;
				}
			}
		}	
	}

	public static String displayRPS(int n) {
		String str = "";
		switch(n) {
		case 1: str="가위";break;
		case 2: str="바위";break;
		case 3: str="보";break;
		}
		return str;
	}
}
