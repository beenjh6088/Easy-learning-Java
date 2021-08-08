/*
■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■
Path : 
	Chapter 06. 상속
	프로그래밍 문제 04. 상속 오버라이딩
Description : 
	01. specification
		class           Parent                        Child
		field           String name = "영조"           String name = "사도세자"
		method          void print() ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■
*/
package ch06;


public class _06_Programming04_OvershoadowTest {

	public static void main(String[] args) {
		Parent p = new Child();
		System.out.println(p.name); // 부모 클래스의 필드는 오버라이딩 불가
		p.print(); // 부모 클래스의 메서드는 오버라이딩 가능
	}
}

class Parent {
	String name = "영조";
	void print() {
		System.out.println(name);
	}
}

class Child extends Parent {
	String name = "사도세자";
	void print() {
		System.out.println("나는 " + name + "이다.");
	}
}