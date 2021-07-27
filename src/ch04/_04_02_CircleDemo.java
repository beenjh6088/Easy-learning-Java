/*
■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■
Path : 
	Chapter 04. 객체 지향
	04. 클래스의 구성 요소와 멤버 접근
Description : 
	01. 필드와 메서드 접근
		01] 필드와 메서드는 객체에 소속된 멤버로 접근하려면 객체 생성이 필수. ex) 객체참조변수.멤버
		02] 인스턴스 변수 : 객체의 인스턴스에 종속된 변수. 인스턴스마다 값이 다를 수 있음.
		03] 인스턴스 메서드 : 객체의 인스턴스에 종속된 메서드. 메서드 영역에서 공유됨.
		04] 클래스 내의 this는 클래스를 통해 만들어진 객체 자신을 지칭하는 키워드.
■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■
*/
package ch04;


class Circle01 {
	double radius;
	
	double findArea() {
		return 3.14 * radius * radius;// radius 대신에 this.radius 사용가능
	}
	
	void show(double x, double y) {
		System.out.printf("반지름 = %.1f, 넓이 = %.1f\n", x, y);
	}
}



public class _04_02_CircleDemo {
	
	public static void main(String[] args) {
		
		Circle01 myCircle = new Circle01();
		
		myCircle.radius = 10.0;
		
		myCircle.show(myCircle.radius, myCircle.findArea());
	}
}