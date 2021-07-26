/*
■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■
Path : 
	Chapter 04. 객체 지향
	03. 클래스 선언과 객체 생성
Description : 
	01. 클래스 선언
		01] 클래스는 객체를 추상화한 것. 클래스 선언은 추상화를 정의하는 과정
	02. 객체 생성과 참조 변수
		01] new 연산자를 통해 객체 생성. new 연산자는 생성한 객체의 주소를 반환.
		02] 기초 타입에 대입 연산자를 사용하면 실제 데이터가 저장되지만, 참조 타입에는 객체의 주소가 저장됨
■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■
*/
package ch04;



class Phone {
	String model;
	int value;
	
	void print() {
		System.out.println(value + " 만 원 짜리 " + model + " 스마트폰");
	}
}



public class _03_01_Class_Instance {

	public static void main(String[] args) {
		
		Phone myPhone = new Phone();
		myPhone.model = "Galaxy S8";
		myPhone.value = 100;
		myPhone.print();
		
		Phone yourPhone = new Phone();
		yourPhone.model = "G6";
		yourPhone.value = 85;
		yourPhone.print();
		
	}
}
