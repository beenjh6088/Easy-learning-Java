/*
■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■
Path : 
	Chapter 04. 객체 지향
	프로그래밍 문제 01. 삼각형 클래스
Description : 
	01. 삼각형의 속성으로 실숫값의 밑변과 높이를, 동작으로는 넓이 구하기와 접근자가 있고 생성자를 포함한다.
	02. 삼각형의 넓이가 동일한지 비교하는 isSameArea() 메서드를 추가하라
■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■
*/
package ch04;



class Triangle {
	private double width;
	private double height;
	
	public double findArea() {
		return width * height / 2;
	}
	
	public double getWidth() {
		return width;
	}
	
	public double getHeight() {
		return height;
	}
	
	public Triangle(double width, double height) {
		this.width = width;
		this.height = height;
	}
	
	public boolean isSameArea(Triangle t) {
		return this.findArea() == t.findArea();
	}
}



public class _04_Programming01_TriangleTest {

	public static void main(String[] args) {
		
		//01번 문제
		Triangle t = new Triangle(10.0, 5.0);
		System.out.println(t.findArea());
		
		//02번 문제
		Triangle t1 = new Triangle(10.0, 5.0);
		Triangle t2 = new Triangle(5.0, 10.0);
		Triangle t3 = new Triangle(8.0, 8.0);
		
		System.out.println(t1.isSameArea(t2));
		System.out.println(t1.isSameArea(t3));
	}
}
