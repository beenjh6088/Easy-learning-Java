/*
■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■
Path : 
	Chapter 05. 문자열, 배열, 열거타입
	01. 배열
Description : 
	01. 객체의 배열
		01] Ball[] balls = new Ball[5];
			01} 배열의 원소들은 Ball 객체와 연결되지 않았기 때문에 null값을 가진다. >> 초기화하고 써라
■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■
*/
package ch05;



class Circle {
	double radius;
	
	public Circle(double radius) {
		this.radius = radius;
	}
	
	public double getRadius() {
		return radius;
	}
	
	double findArea() {
		return 3.14 * radius * radius;
	}
}



public class _05_03_05_CircleArrayDemo {

	public static void main(String[] args) {
		
		Circle[] circles = new Circle[5];
		
		for (int i = 0; i < circles.length; i++) {
			circles[i] = new Circle(i + 1.0); // 이번 예제의 핵심
			System.out.printf("원의 넓이(반지름 : %.1f) : %.2f\n", circles[i].radius, circles[i].findArea());
		}
	}
}