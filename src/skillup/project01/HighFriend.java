package skillup.project01;
 
//고등학교 친구를 추상화한 클래스
public class HighFriend  {
	//멤버변수 : 친구의 이름부터 별명까지의 데이터 표현
	public String name;
	public String phone;
	public String addr;
	public String nickname;//별명
	 
	//생성자 : 인스턴스 생성 및 멤버변수 초기화 
	public HighFriend(String name, String phone, String addr, String nickname) {
		this.name = name;
		this.phone = phone;
		this.addr = addr;
		this.nickname = nickname;
	}

	//친구의 전체정보를 출력하는 멤버메서드 
	void showAllData() {
		System.out.println("==고딩친구(전체정보)==");
		System.out.print("이름:"+ name);
		System.out.print(", 전화번호:"+ phone);
		System.out.print(", 주소:"+ addr);
		System.out.println(", 별명:"+ nickname);
	}
	
	//친구의 간략정보를 출력 
	void showBasicInfo() {
		System.out.println("==고딩친구==");
		System.out.print("별명:"+ nickname);
		System.out.println(", 전번:"+ phone);
	}
}

