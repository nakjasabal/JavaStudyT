package skillup.project04;

//프로그램의 전반적인 구조를 설정할 수 있는 인터페이스 정의
public interface IFriend {
	/*
	인터페이스에는 추상메서드만 선언할 수 있다. 메서드 선언시 
	public abstract가 자동으로 추가된다. */
	void showAllData();
	public void showBasicInfo();
}
