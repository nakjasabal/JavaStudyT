package skillup.project02;
 
//Friend클래스를 상속하여 확장한 고딩친구 클래스 
public class HighFriend extends Friend {
	//'별명'을 자식에서 확장 
	String nickname; 

	//생성자 
	public HighFriend(String name, String phone, String addr,
			String nickname) {
		//3개의 인수는 부모의 생성자를 호출하기 위해 super사용
		super(name, phone, addr);
		//1개만 멤버변수 초기화 
		this.nickname = nickname;
	}
	
	//멤버변수 전체 출력용 메서드 
	public void showAllData() {
		System.out.println("==고딩친구(전체정보)==");
		//부모클래스에 정의된 메서드로 공통사항 출력
		super.showFriendData();
		//자신의 멤버변수 출력
		System.out.println(", 별명:"+ nickname);
	}
	//간략정보 2가지만 출력하는 메서드 
	public void showBasicInfo() {
		System.out.println("==고딩친구==");
		System.out.print("별명:"+ nickname);
		System.out.println(", 전번:"+ phone);
	}
}

