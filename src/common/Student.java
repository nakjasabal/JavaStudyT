package common;
 
public class Student extends Person {
	//자식에서 확장한 멤버변수 : 학번 
	private String stNumber;

	//생성자 
	public Student(String name, int age, String stNumber) {
		//자식 인스턴스를 생성하기전 부모생성자를 먼저 호출해야한다.
		super(name, age);
		this.stNumber = stNumber;
	}
	@Override
	public String toString() {
		/*
		부모에 정의된 toString을 먼저 호출한 후 자식쪽의 멤버를
		추가한다. */
		return super.toString() +", 학번:"+ stNumber;
	}
}
