/*
■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■
Path : 
	Chapter 06. 상속
	프로그래밍 문제 04. 상속 오버라이딩
Description : 
	01. specification
		class           Vehicle                       Car
		field           String color, int speed       int displacement, gears
		method          void show()                   void show()
		constructor     public Vehicle(String, int)   public Car(String, int, int, int)
■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■
*/
package ch06;


public class _06_Programming06_OverrideTest {

	public static void main(String[] args) {
		Car01 c = new Car01("파랑", 200, 1000, 5);
		c.show();
		
		System.out.println();
		Vehicle01 v = c;
		v.show();
	}
}

class Vehicle01 {
	String color;
	int speed;
	public Vehicle01(String color, int speed) {
		this.color = color;
		this.speed = speed;
	}
	void show() {
		System.out.printf("color : %s, speed : %d\n", color, speed);
	}
}

class Car01 extends Vehicle01{
	int displacement;
	int gears;
	public Car01(String color, int speed, int displacement, int gears) {
		super(color, speed);
		this.displacement = displacement;
		this.gears = gears;
	}
	void show() {
		System.out.printf("color : %s, speed : %d, diplacement : %d, gears : %d\n", color, speed, displacement, gears);
	}
}