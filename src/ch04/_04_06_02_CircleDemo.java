/*
■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■
Path : 
	Chapter 04. 객체 지향
	06. 생성자
Description : 
	01. 생성자의 개념과 선언
		01] 생성자 이름은 클래스 이름과 같다.
		02] 생성자의 반환 타입은 없다.
		03] 생성자는 new 연산자와 함께 사용하며, 객체를 생성할 떄 호출한다.
		04] 생성자도 오버로딩할 수 있다.
	02. 디폴트 생성자와 생성자 오버로딩
		01] 디폴트 생성자 때문에 클래스에는 반드시 1개 이상의 생성자가 존재함
		02] 클래스 내에 생성자가 하나라도 있다면 컴파일러는 디폴트 생성를 자동으로 추가하지 않는다.
■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■
*/
package ch04;


class Circle03 {
	@SuppressWarnings("unused")
	private double radius;
	String color;
	
	public Circle03(double r, String c) {
		radius = r;
		color = c;
	}
	
	public Circle03(double r) {
		radius = r;
		color = "파랑";
	}
	
	public Circle03(String c) {
		radius = 10.0;
		color = c;
	}
	
	public Circle03() {
		radius = 10.0;
		color = "빨강";
	}
}



public class _04_06_02_CircleDemo {
	
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		Circle03 c1 = new Circle03(10.0, "빨강");
		
		Circle03 c2 = new Circle03(5.0);
		
		Circle03 c3 = new Circle03("노랑");
		
		Circle03 c4 = new Circle03();
		
	}
}