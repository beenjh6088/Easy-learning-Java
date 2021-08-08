/*
■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■
Path : 
	Chapter 06. 상속
	08. 타입 변환과 다형성
Description : 
	01. 타입변환을 이용한 다형성
	02. 메서드의 동적 바인딩(단 정적 메서드는 제외)
	
참조 변수 타입               참조 범위                             실제 기능
                  ______________
                 /|name         |________O name
________________/ |void whoami()|__
Vehicle type    \ |static move()|__\_____O move
                 \|_____________|   \  
                 /|name         |___ \ __O name 
                / |void whoami()|_____\__O whoami()
_______________/  |static move()|________O move
Car type       \  |void excel() |________O excel()
                \ |             |
                 \|_____________|
■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■
*/
package ch06;

class Vehicle {
	String name = "탈 것";
	
	void whoami() {
		System.out.println("나는 탈 것이다.");
	}
	
	static void move() {
		System.out.println("이동하다.");
	}
}



class Car extends Vehicle {
	String name = "자동차";
	
	void whoami() {
		System.out.println("나는 자동차이다.");
	}
	
	static void move() {
		System.out.println("달리다.");
	}
}



public class _06_08_05_OverTypeDemo {

	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		Vehicle v = new Car();
		System.out.println(v.name); // Vehicle 타입의 name에 접근
		v.whoami(); // 실제 타입인 Car 타입의 whoami()를 호출
		v.move(); // Vehicle.move()가 바람직함.
	}

}