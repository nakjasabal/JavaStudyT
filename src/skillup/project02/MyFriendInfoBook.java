package skillup.project02;

import java.util.Scanner;

public class MyFriendInfoBook {
	
	public static Scanner scan = new Scanner(System.in);
	
	public static void menuShow() {
		System.out.println("######## 메뉴를 입력하세요(ver02) ########");
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
		//Scanner scan = new Scanner(System.in);
		FriendInfoHandler handler = 
				new FriendInfoHandler(100);

		while(true) {
			menuShow();
			int choice = scan.nextInt();
			scan.nextLine();
			switch(choice) {
			case 1: case 2:
				handler.addFriend(choice);
				break;
			case 3:
				handler.showAllData();
				break;
			case 4:
				handler.showSimpleData();
				break;
			case 5:
				handler.searchInfo();
				break;
			case 6:
				handler.deleteInfo();
				break;
			case 7:
				System.out.println("프로그램종료");
				return;
			}////switch 끝
		}////while 끝
	}////main 끝
}////class 끝

