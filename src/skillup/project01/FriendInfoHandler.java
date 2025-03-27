package skillup.project01;

import java.util.Scanner;

/*
주소록관리프로그램에서 기능을 담당하는 핸들러 클래스 정의. 
main메서드는 프로그램의 출발점의 역할만 담당하고, 모든 기능은 핸들러
클래스에서 구현한다. */
public class FriendInfoHandler {	
	/*
	연락처를 저장하기 위한 인스턴스형 배열을 생성. 고딩/대딩 각각의
	배열이 필요하고, 카운트를 위한 변수도 생성한다. */
	private HighFriend[] highFriends;	
	private int numOfhighFriend;
	private UnivFriend[] univFriends;	
	private int numOfunivFriend;
	
	//생성자 : 배열의 크기를 결정할 값을 매개변수로 받아서 초기화 
	public FriendInfoHandler(int num) {
		//num의 크기로 배열이 생성된다. 
		highFriends = new HighFriend[num];
		//입력된 정보의 갯수(or 인덱스) 카운트를 위한 변수 
		numOfhighFriend = 0;
		univFriends = new UnivFriend[num];	
		numOfunivFriend = 0;
	}
 
	//연락처 정보 추가 
	public void addFriend(int choice) {
		System.out.println("## addFriend 호출됨 ##");
		//Scanner scan = new Scanner(System.in);
		//입력값을 저장할 변수 생성 
		String iName,iPhone,iAddr,iNickname,iMajor;
		//공통 정보 3가지를 입력받음 
		System.out.print("이름:");iName = MyFriendInfoBook.scan.nextLine();
		System.out.print("전화번호:");iPhone = MyFriendInfoBook.scan.nextLine();
		System.out.print("주소:");iAddr = MyFriendInfoBook.scan.nextLine();
		
		if(choice==1) {
			//고딩인 경우 별명을 추가로 입력
			System.out.print("별명:"); iNickname = MyFriendInfoBook.scan.nextLine(); 
			//고딩 인스턴스 생성 후 참조값을 변수에 저장
			HighFriend high = new HighFriend(iName, iPhone, iAddr, iNickname);
			/*
			인스턴스 참조값을 배열에 추가. 카운트용 변수를 후위 증가 시켜 0번
			인덱스에 먼저 입력한 후 1증가한다. */
			highFriends[numOfhighFriend++] = high;
		}
		else if(choice==2) {  
			//대딩인 경우 전공을 추가로 입력 
			System.out.print("전공:"); iMajor = MyFriendInfoBook.scan.nextLine();
			//대딩 인스턴스 생성과 동시에 배열에 추가 
			univFriends[numOfunivFriend++] = 
				new UnivFriend(iName, iPhone, iAddr, iMajor);
		} 
		System.out.println("##친구정보 입력이 완료되었습니다##");
	}
 
	public void showAllData() {
		//System.out.println("## showAllData 호출됨 ##");
		/* 
		고딩친구반복 : 저장된 정보의 갯수만큼 반복해서 전체정보를
		출력한다. 4개의 멤버변수를 모두 출력한다. */
		for(int i=0 ; i<numOfhighFriend ; i++) {
			highFriends[i].showAllData();
		}
		//대딩친구반복
		for(int i=0 ; i<numOfunivFriend ; i++) {
			univFriends[i].showAllData();
		}
		System.out.println("##전체정보가 출력되었습니다##");
	}
	
	public void showSimpleData() {
		//System.out.println("## showSimpleData 호출됨 ##");
		//고딩친구반복 : 간략한 정보 2개만 출력한다. 
		for(int i=0 ; i<numOfhighFriend ; i++) {
			highFriends[i].showBasicInfo();
		}
		//대딩친구반복
		for(int i=0 ; i<numOfunivFriend ; i++) {
			univFriends[i].showBasicInfo();
		}

		System.out.println("##간략정보가 출력되었습니다##");
	}

	//이름으로 정보 검색 
	public void searchInfo() {
		//System.out.println("searchInfo 호출됨");
		//검색 결과 출력용 변수 
		boolean isFind = false;		
		//Scanner scan = new Scanner(System.in);
		System.out.print("검색할 이름을 입력하세요:");
		String searchName = MyFriendInfoBook.scan.nextLine();		
		
		//고딩친구반복
		for(int i=0 ; i<numOfhighFriend ; i++) {
			/*
			문자열 비교를 위한 메서드 중 compareTo()를 사용해서
			검색 기능 구현. "문자열1.compareTo(문자열2)" 형식으로
			사용하고 일치하는 경우 0을 반환한다. */
			if(searchName.compareTo(highFriends[i].name)==0) {	 
				//검색할 이름과 일치한다면 전체 정보를 출력 
				highFriends[i].showAllData();
				System.out.println("##귀하가 요청하는 정보를 찾았습니다.##");
				//정보를 찾았으므로 true로 변경 
				isFind = true; 
			}
		}
		//대딩친구반복(고딩과 로직은 동일함)
		for(int i=0 ; i<numOfunivFriend ; i++) {
			if(searchName.compareTo(univFriends[i].name)==0) {	 
				univFriends[i].showAllData();
				System.out.println("##귀하가 요청하는 정보를 찾았습니다.##");
				isFind = true; 
			}
		}
		
		//만약 검색결과가 없다면 아래와 같이 출력한다. 
		if(isFind==false)
			System.out.println("##찾는 정보가 없습니다.##");
	}

	//연락처 정보 삭제 
	public void deleteInfo() {
		//System.out.println("## deleteInfo 호출됨 ##");
		//Scanner scan = new Scanner(System.in);
		System.out.print("삭제할 이름을 입력하세요:");
		String deleteName = MyFriendInfoBook.scan.nextLine();
		/*
		삭제될 인스턴스의 인덱스를 저장하기 위한 변수. 배열의 인덱스는
		0부터 시작이므로 초깃값은 -1로 설정한다. */
		int deleteIndexHigh = -1; 
		int deleteIndexUniv = -1; 
		
		//고딩친구반복
		for(int i=0 ; i<numOfhighFriend ; i++) {
			/* 
			삭제할 이름과 일치하는 인스턴스를 찾기 위해 equals()
			를 사용. 일치할때 true를 반환한다. */
			if(deleteName.equals(highFriends[i].name)) {
				/*
				일치하는 이름을 찾았다면 해당 인덱스에 null을 입력
				한다. 참조값이 null이라는 것은 참조할 인스턴스가 
				없다는 의미이므로 삭제라고 볼 수 있다. */
				highFriends[i] = null;
				//삭제된 인스턴스의 인덱스를 저장 
				deleteIndexHigh = i;
				//삭제되었으므로 전체 카운트를 1 차감 
				numOfhighFriend--;
				//삭제가 완료되면 즉시 반복문을 탈출한다. 
				break;
			}
		}
		//대딩친구반복
		for(int i=0 ; i<numOfunivFriend ; i++) {
			if(deleteName.equals(univFriends[i].name)) {
				univFriends[i] = null;
				deleteIndexUniv = i;
				numOfunivFriend--;
				break;
			}
		}
		
		if(deleteIndexHigh!=-1) {
			//고딩 친구 정보가 삭제되었을때 배열 정리
			for(int i=deleteIndexHigh ; i<numOfhighFriend ; i++) {
				/*
				삭제된 인스턴스의 인덱스부터 마지막까지 반복하면서 뒷쪽의
				인스턴스를 한칸씩 앞으로 이동한다. 배열 가운데 null값이 
				입력되어 있으면 정보출력시 NullPointerException이 
				발생하기 때문이다. */
				highFriends[i] = highFriends[i+1];
			}
			System.out.println("##데이터("+ deleteIndexHigh
					+"번)가 삭제되었습니다##");
		}
		else if(deleteIndexUniv!=-1) {
			//대딩 친구 정보가 삭제되었을때 배열 정리
			for(int i=deleteIndexUniv ; i<numOfunivFriend ; i++) {
				univFriends[i] = univFriends[i+1];
			}
			System.out.println("##데이터("+ deleteIndexUniv
					+"번)가 삭제되었습니다##");
		}
		else {
			//고딩/대딩 모두 -1을 유지한다면 검색된 값이 없다는 의미.
			System.out.println("##삭제된 데이터가 없습니다##");
		}
	}
}






