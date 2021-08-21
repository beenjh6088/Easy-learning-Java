/*
■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■
Path : 
	Chapter 07. 인터페이스와 특수 클래스
	03. 인터페이스 응용
Description : 
	02_01. 인터페이스 개념 
		01] 서전에 정한 약속이나 규격을 의미
		02] 인터페이스와 추상클래스 차이
			분류											인터페이스											추상클래스
			구현 메서드									불가(디폴트,정적메서드 예외)				가능
			인스턴스 변수								불가													가능
			다중 상속									가능													불가
			디폴트 메서드								가능													불가
			생성자와 main							불가													가능
			상속에서의 부모							인터페이스											인터페이스, 추상 클래스
			접근 범위									모든 멤버를 공개									추상 메서드를 최소한 자식에게 공개
	02_02. 인터페이스 구성 요소
		01] 상수 필드
		02] 추상 메서드
		03] 디폴트 메서드
		04] 정적 메서드
		05] 비공개 메서드
	02_03. 인터페이스 상속
		01] interface Child extends Parent...
		02] class Child implement Parent...
		03] class Child extends Parent implements Parents...
	03_01 인터페이스 상수
	03_02 인퍼페이스 상속과 구현
		01] Controllable 인터페이스를 사용하면 일관된 방법으로 코드를 관리할 수 있음.
■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■
*/
package ch07;

public class _07_03_02_ControllableDemo {

	public static void main(String[] args) {
		TV tv = new TV();
		Computer com = new Computer();
		tv.turnOn();
		tv.turnOff();
		tv.repair();
		com.turnOn();
		com.turnOff();
		com.repair();
		Controllable.reset();
	}

}

interface Controllable {
	default void repair() { // 디폴트 메서드
		System.out.println("장비를 수리한다.");
	}
	
	static void reset() { // 정적 메서드
		System.out.println("장비를 초기화한다");
	}
	
	// 추상 메서드
	void turnOn();
	void turnOff();
}


interface RemoteControllable extends Controllable { // 인터페이스 상속
	void remoteOn();
	
	void remoteOff();
}

class TV implements Controllable {

	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("TV를 켠다.");
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("TV를 끈다.");
	}
	
}

class Computer implements Controllable {

	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("컴퓨터를 켠다");
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("컴퓨터를 끈다");
	}
	
}