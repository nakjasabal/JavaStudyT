package ex13interface;

/*
추상클래스를 인터페이스로 변경하기
	abstract class => interface
	메서드인 경우 public abstract 제거
	멤버변수인 경우 public static final 제거 
 */
interface PersonalNumberStorage {
	void addPersonalInfo(String juminNum, String name);
	String searchPersonalInfo(String juminNum);
}
/*
VO(Value Object) : 값만 저장할 수 있는 객체라는 뜻으로 데이터
	저장용 클래스가 필요할때 사용한다. */
class PersonalInfoVO {
	private String name;
	private String juminNum;
	public PersonalInfoVO(String name, String juminNum) {
		super();
		this.name = name;
		this.juminNum = juminNum;
	}
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
클래스가 클래스를 상속할때 -> extends
클래스가 인터페이스를 상속할때 -> implements
매우 드물지만 인터페이스가 인터페이스를 상속할때 -> extends
extends 는 '상속', implements는 '구현'이라 표현한다. 
 */
class PersonalNumberStorageImpl implements 
								PersonalNumberStorage {	
	//정보저장용 인스턴스 배열과 인덱스 카운트를 위한 멤버변수 선언 
	PersonalInfoDTO[] personalArr;  
	int numOfPerInfo;
	
	//생성자 : 인스턴스 배열 생성 및 인덱스 변수 초기화 
	public PersonalNumberStorageImpl(int arrSize) {
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

public class E02AbstractToInterface3 {

	public static void main(String[] args) {
		//정보저장용 인스턴스 생성 
		PersonalNumberStorageImpl storage = 
				new PersonalNumberStorageImpl(10);
		
		//2개의 정보를 추가 
		storage.addPersonalInfo("901234-2222222", "김태희");
		storage.addPersonalInfo("901234-1111111", "정지훈");
		
		//정보를 검색 
		System.out.println(storage.searchPersonalInfo("901234-2222222"));
		System.out.println(storage.searchPersonalInfo("901234-1111111"));
		System.out.println(storage.searchPersonalInfo("001024-1090333"));
	}
}