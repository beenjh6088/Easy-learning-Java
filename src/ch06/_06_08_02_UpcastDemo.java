/*
■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■
Path : 
	Chapter 06. 상속
	08. 타입 변환과 다형성
Description : 
	01. 객체의 타입 변환
		01] 상속 관계일 때만 가능하며 자동 타입 변환과 강제 타입 변환이 있다.
■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■
*/
package ch06;

class Person {
	String name = "사람";
	
	void whoami() {
		System.out.println("나느 사람이다.");
	}
}



class Student extends Person {
	int number = 7;
	
	void work() {
		System.out.println("나는 공부한다.");
	}
}



public class _06_08_02_UpcastDemo {

	public static void main(String[] args) {
		Person p;
		Student s = new Student();
		
		p = s;
		
//		number와 work()는 부모 타입에 없는 멤버이므로 부모 타입 변수에서 볼 수 없다.
//		p.number = 1;
//		p.work();
		p.whoami();
	}
}