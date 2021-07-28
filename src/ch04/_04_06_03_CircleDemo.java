/*
■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■
Path : 
	Chapter 04. 객체 지향
	06. 생성자
Description : 
	01. this와 this()
		01] this
		 	01} 객체 자기 자신을 참조.
		 	02} this 키워드로 인해 멤버 필드와 매개변수의 이름이 같을 경우 구분이 가능함
		02] this() : 
			01} 기존 생성자를 나타냄. 
			02} this()를 사용하면 오버로딩된 생성자에서 생기는 중복 코드를 없앨 수 있다.
			03} this()를 사용시 반드시 생성자의 첫 행에 위치해야함
■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■
*/
package ch04;


class Circle04 {
	@SuppressWarnings("unused")
	private double radius;
	String color;
	
	public Circle04(double radius, String color) {
		this.radius = radius;
		this.color = color;
	}
	
	public Circle04(double radius) {
		//radius = r;
		//color = "파랑";
		this(radius, "파랑");
	}
	
	public Circle04(String color) {
		//radius = 10.0;
		//color = c;
		this(10.0, color);
	}
	
	public Circle04() {
		//radius = 10.0;
		//color = "빨강";
		this(10.0, "빨강");
	}
}



public class _04_06_03_CircleDemo {
	
	public static void main(String[] args) {
		
	}
}