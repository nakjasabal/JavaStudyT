package ex13interface;

import java.util.Scanner;

/*
인터페이스에 변수를 정의하면 무조건 정적 상수가 되므로 이를 "인터페이스형
상수"라고 한다. 프로그램에서 설정값이나 명시적인 코드를 위해 사용된다. 
 */

/*
해당 인터페이스의 접근지정자는 default이므로 해당 패키지를 벗어나면 
사용할 수 없다. 만약 프로젝트 전체에서 사용하고 싶다면 public으로 
선언해야한다. */
//interface Game {
//	int SCISSORS=1, ROCK=2, PAPER=3;
//}

public class E04InterfaceConstant {

	public static void main(String[] args) {
		
		System.out.println("가위(1) 바위(2) 보(3) 게임입니다.");		
		System.out.print("선택하세요(정수입력): ");
		
		Scanner sc = new Scanner(System.in);
		int sel = sc.nextInt();
				
		switch(sel)
		{
		/*
		가위, 바위, 보를 1,2,3으로 설정했지만, 설정값이 많은 경우
		모두 기억하기 힘들 수 있으므로 명시적인 단어를 통한 상수를 
		사용하면 코드의 가독성이 높아진다. */
		case Game.SCISSORS:
			System.out.println("가위를 냈습니다.");
			break;
		case Game.ROCK:
			System.out.println("바위를 냈습니다.");
			break;
		case Game.PAPER:
			System.out.println("보자기를 냈습니다.");
			break;
		default:
			System.out.println("잘못 냈습니다.");
		}
	}
}
