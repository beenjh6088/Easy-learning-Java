/*
■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■
Path : 
	Chapter 06. 상속
	02. 클래스 상속
Description : 
	01. 상속의 개념과 필요성
		01] 중복되는 코드 방지
		02] 유지보수 용이
	02. 클래스 상속
		01] 부모, 자식 클래스 관계 : is-a 관계 성립 여부를 판단할 것
		02] 상속의 선언 : extends 키워드
		03] 현실 세계와 상속 적용 : 부모 클래스의 private멤버를 제외한 모든 멤버는 자식 클래스에 상속된다.
■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■
*/
package ch06;

public class _06_02_03_InheritanceDemo {

	public static void main(String[] args) {
		Circle c1 = new Circle();
		Ball c2 = new Ball("빨간색");
		
		System.out.println("원 : ");
		c1.findRadius();
		c1.findArea();
		
		System.out.println("\n공 : ");
		c2.findRadius();
		c2.findColor();
		c2.findArea();
		c2.findVolume();
	}

}

class Circle {
	@SuppressWarnings("unused")
	private void secret() {
		System.out.println("비밀임");
	}
	protected void findRadius() {
		System.out.println("반지름이 10.0센티이다");
	}
	public void findArea() {
		System.out.println("넓이는 (파이 * 반지름 * 반지름)이다.");
	}
}

class Ball extends Circle {
	private String color;
	
	public Ball(String color) {
		this.color = color;
	}
	
	public void findColor() {
		System.out.println(color + " 공이다.");
	}
	
	public void findVolume() {
		System.out.println("부피는 4/3*(파이 * 반지름 * 반지름 * 반지름)이다.");
	}
}