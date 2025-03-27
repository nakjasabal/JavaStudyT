package ex08class;
/*
시나리오] 은행계좌를 추상화 해보자
	멤버변수 : 예금주, 계좌번호, 잔고
	멤버메서드 : 입금(deposit()), 출금(withdraw()), 
		잔고출력(showAccount())
	조건1 : 입금은 무제한으로 가능하다.
	조건2 : 잔고가 부족할 경우에는 출금 불능으로 처리한다. 	
	초기화메서드 : 멤버변수를 초기화 할수 있는 메서드 정의		
 */

class Account {
	//멤버변수 
	String name;
	//계좌번호는 연산의 대상이 아니므로 String으로 선언한다. 
	String accountNumber;
	//잔고의 경우 입출금을 위한 연산이 필요하므로 정수형으로 선언한다. 
	int balance;
	
	//입금처리 
	void deposit(int money) {
		//매개변수로 전달된 금액만큼 잔고에 합산 
		balance += money;
		System.out.println(money+"원이 입금됨");
	}
	//출금처리 
	void withdraw(int money) {
		//출금을 위해 잔고와 출금액을 비교하여 처리 
		if(balance >= money) {
			//잔고가 충분하다면 money원 만큼 차감 
			balance -= money;
			System.out.println("계좌에서 "+money
					+"원이 출금됨");
		}
		else {
			System.out.println("잔고부족으로 출금불능");
		}
	}
	//계좌조회 : 예금주와 현재 잔고 등을 출력 
	void showAccount() {
		System.out.println("계좌주:"+ name);
		System.out.println("계좌번호:"+ accountNumber);
		System.out.println("잔고:"+ balance);
	}
	//멤버변수를 초기화 할 목적으로 생성된 멤버메서드 
	void init(String n, String a, int b) {
		name = n;
		accountNumber = a;
		balance = b;
	}
}

public class E04AccountMain {
	
	public static void main(String[] args) {
		//첫번째 계좌 인스턴스 
		Account account = new Account();
		//초기화 메서드를 통해 인스턴스 초기화 
		account.init("장동건", "111-21-8888", 1000);
		//입/출금을 진행한 후 계좌정보 확인 
		account.deposit(9000);
		account.withdraw(5000);
		account.showAccount(); 
		
		//두번째 계좌 
		Account account2 = new Account();
		//멤버변수에 직접 접근해서 인스턴스를 초기화 
		account2.name = "정우성";
		account2.accountNumber = "123-45-67890";
		account2.balance = 900000;
		//잔고가 부족한 경우 출금되지 않음 
		account2.withdraw(990000);
		account2.showAccount();
	}
}


