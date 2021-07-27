/*
■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■
Path : 
	Chapter 04. 객체 지향
	05. 접근자와 설정자
Description : 
	01. 접근자 : accessors or getters
	02. 설정자 : mutators or setters
	03. 접근자와 설정자를 사용하는 이유
		01] 필드 이름을 외부와 차단해서 독립시킬수 있다
		02] 데이터 검증 가능
■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■
*/
package ch04;


class Circle02 {
	private double radius;
	
	public double getRadius() {// 접근자
		return radius;
	}
	
	public void setRadius(double r) {// 설정자
		if(r >= 0)
			this.radius = r;
	}
	
	double findArea() {
		return 3.14 * radius * radius;
	}
	
	void show(double x, double y) {
		System.out.printf("반지름 = %.1f, 넓이 = %.1f\n", x, y);
	}
}



public class _05_01_CircleDemo {
	
	public static void main(String[] args) {
		
		Circle02 myCircle = new Circle02();
		
		myCircle.setRadius(10.0);// 멤버변수에 직접 접근하지 않고 값을 초기화한다.
		
		myCircle.show(myCircle.getRadius(), myCircle.findArea());// 멤버변수에 직접 접근하지 않고 값을 참조한다.
	}
}