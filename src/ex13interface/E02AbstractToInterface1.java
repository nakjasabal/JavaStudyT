package ex13interface;

/*
프로젝트 전체에서 기준의 역할을 하는 추상클래스. 해당 클래스는
추상메서드를 포함하고 있으므로 하위에서 상속받게되면 반드시 추상메서드를
오버라이딩 해야한다. */
abstract class PersonalNumberStorageAbs {
	//정보를 저장하는 기능의 추상메서드
	public abstract void addPersonalInfo
			(String juminNum, String name);
	//저장된 정보를 검색하는 기능의 추상메서드 
	public abstract String searchPersonalInfo
			(String juminNum);
}
/*
DTO(Data Transfer Object) : 데이터를 저장하고 전송하기 위한 용도의
	객체를 의미한다. VO(Value Object)로 표현하기도 한다. 프로그램에서
	이름과 주민번호를 저장하는 용도로 사용된다. */
class PersonalInfoDTO {
	//멤버변수 : 이름, 주민번호 
	private String name;
	private String juminNum;
	//생성자 
	public PersonalInfoDTO(String name, String juminNum) {
		super();
		this.name = name;
		this.juminNum = juminNum;
	}
	/*
	getter/setter : DTO객체에서 private으로 선언된 멤버변수의 
		값을 설정하거나 반환할때 사용 */
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getJuminNum() {
		return juminNum;
	}
	public void setJuminNum(String juminNum) {
		this.juminNum = juminNum;
	}
}

/*
제공된 추상클래스를 상속하여 한사람의 정보를 저장하는 기능과 검색의 
기능을 구현한 클래스 */
class PersonalNumberStorageExt extends PersonalNumberStorageAbs {	
	//정보저장용 인스턴스 배열과 인덱스 카운트를 위한 멤버변수 선언 
	PersonalInfoDTO[] personalArr;  
	int numOfPerInfo;
	
	//생성자 : 인스턴스 배열 생성 및 인덱스 변수 초기화 
	public PersonalNumberStorageExt(int arrSize) {
		personalArr = new PersonalInfoDTO[arrSize];
		numOfPerInfo = 0;
	}
	
	/*
	상속을 통해 추상메서드를 포함하게 되므로 반드시 아래와 같이 오버라이딩
	해야한다. 이는 필수사항이며 지키지 않는다면 에러가 발생한다. */
	@Override
	public void addPersonalInfo(String juminNum, String name) {
		//이름과 주민번호를 통해 인스턴스를 생성한 후 배열에 저장
		personalArr[numOfPerInfo] = 
				new PersonalInfoDTO(name, juminNum);
		//인덱스로 사용한 변수를 1 증가 
		numOfPerInfo++;
	}
	//정보 검색
	@Override
	public String searchPersonalInfo(String juminNum) {
		//저장된 정보의 갯수만큼 반복
		for(int i=0 ; i<numOfPerInfo ; i++) {
			//주민번호가 일치하는지 확인 
			if(juminNum.compareTo(
					personalArr[i].getJuminNum())==0) {
				//일치하는 경우 이름을 반환 
				return personalArr[i].getName();
				/*
				DTO의 멤버변수는 private으로 선언되었으므로 외부에
				서는 접근이 불가능하다. 따라서 getter를 통해 출력
				해야한다. */
			}
		}
		//검색 결과가 없다면 null을 반환한다. 
		return null; 
	}
}

public class E02AbstractToInterface1 {

	public static void main(String[] args) {
		//정보저장용 인스턴스 생성 
		PersonalNumberStorageExt storage = 
				new PersonalNumberStorageExt(10);
		
		//2개의 정보를 추가 
		storage.addPersonalInfo("901234-2222222", "김태희");
		storage.addPersonalInfo("901234-1111111", "정지훈");
		
		//정보를 검색 
		System.out.println(storage.searchPersonalInfo("901234-2222222"));
		System.out.println(storage.searchPersonalInfo("901234-1111111"));
		System.out.println(storage.searchPersonalInfo("001024-1090333"));
	}
}