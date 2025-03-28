package skillup.project06;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class FriendInfoHandler {
	
	//Friend 인스턴스를 저장할 수 있는 List 계열의 컬렉션 생성.
	private ArrayList<Friend> myFriends;		
	//생성자 
	public FriendInfoHandler(int num) {
		//List 인스턴스 생성 
		myFriends = new ArrayList<Friend>();		
	}
 
	//연락처 정보 추가를 위한 메서드 
	public void addFriend(int choice) {
		System.out.println("## addFriend 호출됨 ##");
		//Scanner scan = new Scanner(System.in);
		//공통정보 3가지를 먼저 입력받는다. 
		String iName,iPhone,iAddr,iNickname,iMajor;
		System.out.print("이름:");
		iName = MyFriendInfoBook.scan.nextLine();
		System.out.print("전화번호:");
		iPhone = MyFriendInfoBook.scan.nextLine();
		System.out.print("주소:");
		iAddr = MyFriendInfoBook.scan.nextLine();
		
		/*
		1,2번을 구분해서 각 인스턴스를 생성한 후 부모 타입인
		Friend 배열에 저장한다. 즉 상속을 통해 타입이 다른 자식 
		인스턴스를 통합적으로 관리할 수 있다. */
		if(choice==1) {
			System.out.print("별명:"); 
			iNickname = MyFriendInfoBook.scan.nextLine(); 
			HighFriend high = new HighFriend(iName, 
					iPhone, iAddr, iNickname);
			myFriends.add(high);
		}
		else if(choice==2) {  
			System.out.print("전공:"); 
			iMajor = MyFriendInfoBook.scan.nextLine();
			myFriends.add(new UnivFriend(iName, iPhone,
					iAddr, iMajor));
		} 
		/*
		High, Univ타입의 인스턴스를 Friend타입의 배열에 추가할때에는
		자동형변환이 일어난다. 정수를 실수타입의 변수에 저장할때 
		자동형변환이 되는것과 동일한 현상이라 생각하면된다. 
		즉 High, Univ 인스턴스는 Friend 타입의 인스턴스로 자동
		형변환되어 저장된다. */
		System.out.println("##친구정보 입력이 완료되었습니다##");
	}
 
	//전체 정보 출력 
	public void showAllData() {
		//System.out.println("showAllData 호출됨");
		//배열에 저장된 정보의 갯수만큼 반복 
		for(int i=0 ; i<myFriends.size() ; i++) {
			myFriends.get(i).showAllData();
		}	
		System.out.println("##전체정보가 출력되었습니다##");
	}
	
	//간략 정보 출력 
	public void showSimpleData() {
		//System.out.println("showSimpleData 호출됨");
		for(Friend friend : myFriends) {			
			friend.showBasicInfo();
		}
		System.out.println("##간략정보가 출력되었습니다##");
	}

	//연락처 정보 검색
	public void searchInfo() {
		//System.out.println("searchInfo 호출됨");
		//검색결과 저장용 변수 
		boolean isFind = false;		
		//Scanner scan = new Scanner(System.in);
		System.out.print("검색할 이름을 입력하세요:");
		String searchName = MyFriendInfoBook.scan.nextLine();
		
		//이터레이터 인스턴스 생성 
		Iterator<Friend> itr = myFriends.iterator();
		//인출할 인스턴스가 있는지 확인 
		while(itr.hasNext()) {
			//인출 
			Friend friend = itr.next();
			//인출된 인스턴스와 이름을 통해 비교 
			if(searchName.compareTo(friend.name)==0) {	 
				//일치하는 경우 정보 출력 
				friend.showAllData();
				System.out.println("##귀하가 요청하는 정보를 찾았습니다##");
				//정보를 찾았다면 true로 변경 
				isFind = true; 
			}
		}
		if(isFind==false)
			System.out.println("##찾는 정보가 없습니다##");
	}
	
	//연락처 정보 삭제
	public void deleteInfo() {
		//System.out.println("deleteInfo 호출됨");
		//Scanner scan = new Scanner(System.in);
		System.out.print("삭제할 이름을 입력하세요:");
		String deleteName = MyFriendInfoBook.scan.nextLine();
		//삭제 여부 판단
		int deleteIndex = -1; 
		//확장 for문으로 반복 
		for(Friend friend : myFriends) {
			//삭제할 이름이 있는지 검색 
			if(deleteName.equals(friend.name)) {
				//참조값을 통해 삭제 
				myFriends.remove(friend);
				//삭제되었다면 0으로 변경 
				deleteIndex = 0;
				break;
			}
		}
		
		/*
		자동 인덱싱이 지원되므로 삭제후 데이터를 앞으로 이동하는
		것을 하지않아도 된다. */
		
		if(deleteIndex==-1) {
			System.out.println("##삭제된 데이터가 없습니다##");
		}
		else {
			System.out.println("##삭제되었습니다##");
		}
	}
}






