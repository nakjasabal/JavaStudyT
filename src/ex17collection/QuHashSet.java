package ex17collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Scanner;

class Avengers {
	String name;
	String heroName;
	String weapon;

	public Avengers(String name, String heroName, String weapon) {
		super();
		this.name = name;
		this.heroName = heroName;
		this.weapon = weapon;
	}

	@Override
	public String toString() {
		return "Avengers [본명=" + name + ", 닉네임=" + heroName + ", "
				+ "능력=" + weapon +"]";
	}
	
	@Override
	public int hashCode() {
		//방법1 : 멤버변수의 hash값을 얻어온 후 적당히 연산한다.
		int retCode1 = this.name.hashCode() 
			+ this.heroName.hashCode()
			+ this.weapon.hashCode();		
		//방법2 : Objects 클래스의 hash()메서드를 사용한다.
		int retCode2 = Objects.hash(this.name, this.heroName,
				this.weapon);
		System.out.println("hashCode호출됨");
		return retCode2;
	}
	@Override
	public boolean equals(Object obj) {
		System.out.println("equals호출됨");
		//매개변수로 전달된 객체를 다운캐스팅 한다. 
		Avengers av = (Avengers) obj;
		if(av.name.equals(this.name) 
			&& av.heroName.equals(this.heroName) 
			&& av.weapon.equals(this.weapon)) {
			/* 3개의 멤버변수를 비교하여 동일한 객체가 발견되면
			true를 반환한다. 그러면 set에는 저장되지 않는다.*/
			return true;
		}
		else {
			/* 다른 객체라면 false를 반환하고, set에 저장된다.*/
			return false;
		}
	}
}

public class QuHashSet {

	public static void main(String[] args) {
		
		HashSet<Avengers> set = new HashSet<Avengers>();

		Avengers hero1 = new Avengers("토니스타크", "아이언맨", "Mark-48 수트");
		Avengers hero2 = new Avengers("스티브로져스", "캡틴아메리카", "비브라늄 방패");
		Avengers hero3 = new Avengers("브루스배너", "헐크", "강한피부&점프");
		Avengers hero4 = new Avengers("토니스타크", "아이언맨", "Mark-48 수트");
		
		set.add(hero1);
		set.add(hero2);
		set.add(hero3);
		set.add(hero4);		 

		System.out.println("[최초 전체 정보출력]");
		for(Avengers av : set) {
			System.out.println(av.toString());			
		}
		
		System.out.print("검색할 이름을 입력하세요:");
		Scanner scanner = new Scanner(System.in);
		String sName = scanner.next();
		
		//검색결과 확인용 
		boolean isFind = false;
		//이터레이터 객체를 생성한다. 
		Iterator<Avengers> it = set.iterator();
		//반환할 객체가 있는지 확인한다.
		while(it.hasNext()) {
			/* 이터레이터는 next() 메서드를 통해 객체를 출력한다.
			한번 호출할때마다 다음 객체로 이동하게 되므로 루프내에서
			한번이상 호출하면 예외가 발생할 수 있어 반드시 아래와
			같이 사용해야 한다. */
			Avengers av = it.next();
			//해당 루프의 객체와 이름을 비교한다. 
			if(sName.equals(av.name)) {
				System.out.println(av);
				isFind = true;
			}
		}
		if(isFind==false)
			System.out.println("해당 영웅은 없어요ㅜㅜ");
		
		
		
		
		
		
		
		
		

	}

}
