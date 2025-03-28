package skillup.project06;

/*
3단계까지는 최상위 클래스였으나 4단계에서는 interface를 도입하므로
'구현' 받아 사용한다. 정의된 멤버메서드는 오버라이딩 되므로 어노테이션을
추가해야한다. */
abstract public class Friend implements IFriend {
	String name;
	String phone;
	String addr;
	//생성자 
	public Friend(String name, String phone, String addr) {
		this.name = name;
		this.phone = phone;
		this.addr = addr;
	}
	//멤버변수 출력용 메서드 
	@Override
	public void showAllData() {
		System.out.print("이름:"+ name);
		System.out.print(", 전화번호:"+ phone);
		System.out.print(", 주소:"+ addr);
	}
	//오버라이딩을 목적으로 정의한 메서드
	@Override
	public void showBasicInfo() {}
}





