/*
■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■
Path : 
	Chapter 04. 객체 지향
	07. 정적 멤버
Description : 
	01. 인스턴스 멤버와 정적 멤버
		01] 인스턴스 변수 : 인스턴스마다 자신의 필드를 가짐. 객체를 여러 개 생성하면 인스턴스 변수도 여러 개 생성. 객체 생성후 접근 가능
		02] 정적 변수 : 모든 인스턴스가 공유함. 객체를 여러 개 생성해도 정적 변수는 하나. 객체 생성 전에도 접근 가능
		03] 인스턴스 메서드 : 객체를 생성후 호출 가능
		04] 정적 메서드 : 객체 생성전에도 호출 가능
			01} 객체와 관련된 인스턴스 변수를 사용할 수 없다.
			02} 객체와 관련된 인스턴스 메서드를 호출할 수 없다.
			03} 객체 자신을 가리키는 this 키워드를 사용할 수 없다.
			04} 정적 변수, 지역 변수를 사용할 수 있다.
			05} 정적 메서드, 생성자를 호출할 수 있따.
■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■
*/
package ch04;


class Circle05 {
	double radius;
	static int numOfCircles = 0; // 정적 변수의 대표적인 예 : 상수
	int numCircles;
	
	public Circle05(double radius) {
		this.radius = radius;
		numOfCircles++;
		numCircles++;
	}
}



public class _04_07_02_CircleDemo {
	
	@SuppressWarnings("unused")
	public static void main(String[] args) { // 정적 메서드의 대표적인 예 : main()
		Circle05 myCircle = new Circle05(10.0);
		Circle05 yourCircle = new Circle05(5.0);
		
		//print(); main()는 정적 메서드인데 인스턴스 메서드인 print()를 호출할 수 없음.
		System.out.println("원의 개수 : " + Circle05.numOfCircles);
		System.out.println("원의 개수 : " + yourCircle.numCircles);
	}
	
	void print() {
		System.out.println("인스턴스 메서드입니다.");
	}
}