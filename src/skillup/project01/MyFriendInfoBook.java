package skillup.project01;

import java.util.Scanner;

public class MyFriendInfoBook {
	
	public static Scanner scan = new Scanner(System.in);
	
	/*
	메뉴출력용 메서드로 main에서 직접 호출해야 하므로 static으로 
	선언되어있다. */
	public static void menuShow() {
		System.out.println("######## 메뉴를 입력하세요(ver01) ########");
		System.out.print("1.고딩친구입력 ");
		System.out.println("2.대딩친구입력");
		System.out.print("3.전체정보출력 ");
		System.out.println("4.간략정보출력");
		System.out.print("5.검색 ");
		System.out.print("6.삭제 ");
		System.out.println("7.프로그램종료");
		System.out.print("메뉴선택>>>");
	}
	
	public static void main(String[] args) {
		//입력을 위한 인스턴스 생성 
		//Scanner scan = new Scanner(System.in);
		/*
		주소록 관리 프로그램에서 전반적인 기능을 구현하기 위한 클래스.
		이런 클래스를 보통 핸들러 혹은 메니져 클래스라고 한다. */
		FriendInfoHandler handler = new FriendInfoHandler(100);

		/* 
		무한루프로 while문 작성. 프로그램을 종료할때까지 무한히 
		반복하며 친구의 정보를 입력, 수정, 삭제, 검색을 하게된다. */
		while(true) {
			//제일 먼저 메뉴를 출력한다.  
			menuShow();			
			//메뉴 입력 
			int choice = scan.nextInt();
			//입력을 위한 버퍼(Buffer) 제거 
			scan.nextLine();
			//입력받은 정수에 따라 분기해서 각 기능을 실행한다. 
			switch(choice) {
			case 1: case 2:
				//친구의 정보 입력(고딩/대딩)
				handler.addFriend(choice);
				break;
			case 3:
				//정보 전체(4가지) 출력 
				handler.showAllData();
				break;
			case 4:
				//정보 간략(2가지) 출력 
				handler.showSimpleData();
				break;
			case 5:
				//정보 검색 
				handler.searchInfo();
				break;
			case 6:
				//정보 삭제 
				handler.deleteInfo();
				break;
			case 7:
				System.out.println("프로그램종료");
				return;
			default:
				System.out.println("정수를 모르시나요??");
			}////switch 끝
		}////while 끝
	}////main 끝
}////class 끝

