package common;

import java.util.Objects;

public class Teacher extends Person {
	private String subject;
	public Teacher(String name, int age, String subject)
	{
		super(name, age);
		this.subject = subject;
	}
	@Override
	public String toString()
	{
		return super.toString() +", 과목:"+ subject;
	}
	
	/*
	시나리오] Teacher객체는 나이와 과목이 같으면 동일한 객체로 
		처리하도록 hashCode와 equals 메서드를 적절히 오버라이딩
		하시오. 
	 */	
	@Override
	public int hashCode() {
		int returnCode1 = super.getAge() + 
				this.subject.hashCode();
		System.out.println("returnCode1="+ returnCode1);
		 
		int returnCode2 = Objects.hash(super.getName(), super.getAge());
		System.out.println("returnCode2="+ returnCode2);
		
		return returnCode2;
	}
	/*
	*/
	@Override
	public boolean equals(Object obj) {
		Teacher teacher = (Teacher)obj;
		if(teacher.getName().equals(this.getName()) &&
				teacher.getAge()==super.getAge() ) {
			return true;
		}
		else {
			return false;
		}
	}
}
