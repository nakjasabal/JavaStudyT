package quiz;

import java.util.Random;
import java.util.Scanner;

public class QuUpDownGame {

	public static void main(String[] args) {
		
		//난수생성 및 사용자입력을 위한 객체 생성
		Random random = new Random();
		Scanner scan = new Scanner(System.in);
		//boolean isSuccess = false;
		int restart;
		boolean forEnd = false;

		
		// 무한루프안에서 사용자가 7번안에 맞추는지
		while (true) {			
		 	
			// 난수생성 : 1~100사이의 난수를 생성한다. 
			int computerNum = random.nextInt(1000000) % 100 + 1; 
			System.out.println(computerNum);

			//총 7번 반복한다. 
			for (int i = 1; i <= 7; i++) {
				//사용자 입력
				System.out.print("1~100까지 숫자입력:");
				int userNum = scan.nextInt();
					
				// 성공실패
				if (userNum > computerNum) {
					//내가 입력한 숫자가 높다면..
					System.out.println("Down, 더 낮은 숫자입니다.");
				}
				else if (userNum < computerNum) {
					//내가 입력한 숫자가 낮다면..
					System.out.println("Up, 더 높은 숫자입니다.");
				}
				else {
					System.out.println("일치합니다.");
					//isSuccess = true;
					System.out.println(i+"번 안에 성공");
					System.out.println("-----------------------");
					
					//사용자가 숫자를 맞추었을때만 true로 변경한다. 
					forEnd = true;
					
					//for문 탈출
					break;
				}//else(userNum == computerNum)	
			} // 재시작for
			
			//false를 유지하고 있다면 맞추지 못한 경우이므로 실패처리
			if(forEnd == false) {
				System.out.println("실패");
			}
			
			while(true) {
				//1과0을 입력하지 않으면 계속 재입력을 요구한다. 
				System.out.println("-----------------------");
				System.out.println("게임재시작(1), 종료(0) ");
				System.out.print("재시작여부를 입력하세요:");
				restart = scan.nextInt();
				// 0,1 이 입력되었을때 탈출
				if (restart == 0) {
					return;
				} else if (restart == 1) {
					System.out.println("게임 재시작!");
					break;
				} else {
					System.out.println("잘못입력해씸..");						
				}
			}	 
		}// while end
	}// main end
}//class end






