/*
■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■
Path : 
	Chapter 05. 문자열, 배열, 열거타입
	01. 배열
Description : 
	01. 매개변수로 객체 전달
■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■
*/
package ch05;



public class _05_03_06_ObjectArgumentDemo {

	public static void main(String[] args) {
		
		Circle c1 = new Circle(10.0);
		Circle c2 = new Circle(10.0);
		
		System.out.println("원(c1)의 반지름 : " + c1.radius);
		System.out.println("원(c2)의 반지름 : " + c2.radius);
		
		System.out.println("-------------------");
		
		zero(c1);
		System.out.println("원(c1)의 반지름 : " + c1.radius);
		
		zero(c2.radius);
		System.out.println("원(c2)의 반지름 : " + c2.radius);
	}
	
	public static void zero(Circle c) {
		c.radius = 0.0;
	}
	
	public static void zero(double r) {
		r = 0;
	}
}