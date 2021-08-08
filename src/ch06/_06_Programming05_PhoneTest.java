/*
■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■
Path : 
	Chapter 06. 상속
	프로그래밍 문제 04. 상속 오버라이딩
Description : 
	01. specification
		class           Phone                         Telephone                     SmartPhone
		field           protected String owner        private String when           private String game
		method          void talk()                   void autoAnswering()
■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■
*/
package ch06;


public class _06_Programming05_PhoneTest {

	public static void main(String[] args) {
		Phone[] phones = {
				new Phone("황진이"),
				new Telephone("길동이", "내일"),
				new Smartphone("민국이", "갤러그")
		};
		
		for (Phone p : phones) {
			// instanceof 순서 주의
			if (p instanceof Smartphone) {
				((Smartphone) p).playGame();
			} else if (p instanceof Telephone) {
				((Telephone) p).autoAnswering();
			} else if (p instanceof Phone) {
				((Phone) p).talk();
			}
		}
	}
}

class Phone {
	protected String owner;
	Phone(String owner) {
		this.owner = owner;
	}
	void talk() {
		System.out.println(owner + "가 통화 중이다.");
	}
}

class Telephone extends Phone {
	private String when;
	Telephone(String owner, String when) {
		super(owner);
		this.when = when;
	}
	void autoAnswering() {
		System.out.println(owner + "가 없다. " + when + " 전화 줄래.");
	}
}

class Smartphone extends Telephone {
	private String game;
	Smartphone(String owner, String game) {
		super(owner, "");
		this.game = game;
	}
	void playGame() {
		System.out.println(owner + "가 " + game + " 게임을 하는 중이다.");
	}
}