/*
■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■
Path : 
	Chapter 06. 상속
	프로그래밍 문제 01. 상속 테스트
Description : 
	01. specification
		class           Circle                  ColoredCircle
		field           int radius              String color
		method          void show()             void show()
		Constructor     Circle(int radius)      ColoredCircle(int radius, String color)
■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■
*/
package ch06;


public class _06_Programming01_ColoredCircleTest {

	public static void main(String[] args) {
		Circle01 c = new Circle01(5);
		ColoredCircle01 cc = new ColoredCircle01(10, "빨간색");
		c.show();
		cc.show();
	}
}


class Circle01 {
	int radius;
	void show() {
		System.out.println("반지름이 "+radius+"인 원이다");
	}
	Circle01(int radius) {
		this.radius = radius;
	}
}


class ColoredCircle01 extends Circle01{
	String color;
	void show() {
		System.out.println("반지름이 "+radius+"인 "+color+" 원이다.");
	}
	ColoredCircle01(int radius, String color) {
		super(radius);
		this.color = color;
	}
}