package skillup.project01;

//대학교 친구의 정보 저장용 클래스 
public class UnivFriend {
	//멤버변수 
	public String name;
	public String phone;
	public String addr;
	public String major;//전공 
	 
	//생성자
	public UnivFriend(String name, String phone, String addr, String major) {
		this.name = name;
		this.phone = phone;
		this.addr = addr;
		this.major = major;
	}
	
	//멤버메서드 
	void showAllData() {
		System.out.println("==대딩친구(전체정보)==");
		System.out.print("이름:"+ name);
		System.out.print(", 전화번호:"+ phone);
		System.out.print(", 주소:"+ addr);
		System.out.println(", 전공:"+ major);
	}
 
	void showBasicInfo() {
		System.out.println("==대딩친구==");
		System.out.print("이름:"+ name);
		System.out.print(", 전공:"+ major);
		System.out.println(", 전화번호:"+ phone);
	}
}

