/*
■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■
Path : 
	Chapter 07. 인터페이스와 특수 클래스
	04. 인터페이스 다형성
Description : 
	04_01. 인터페이스 타입
		01] 인터페이스타입 변수 = 구현객체
			01} 구현 객체는 인터페이스 타입이므로 자동 변환됨
			02} 인터페이스타입 변수로는 인터페이스 멤버만 볼 수 있고 구현 클래스에 추가된 멤버는 볼 수 없다.
		02] 구현클래스타입 변수 = (구현클래스타입)인터페이스타입변수
			01} 구현 클래스에 추가된 멤버에 접근하려면 구현 객체 타입으로 강제 변환해야 한다. 
	04_02. 타입 변환과 다형성
		
■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■
*/
package ch07;

public class _07_04_02_AnimalDemo {

	public static void main(String[] args) {
		Dog d = new Dog();
		Cuckoo c = new Cuckoo();
		
		makeSound(d);
		makeSound(c);
	}

	public static void makeSound(Animal a) { // 매개변수를 인터페이스타입으로 설정
		a.sound();
	}
}

interface Animal {
	void sound();
}


class Dog implements Animal {

	@Override
	public void sound() {
		// TODO Auto-generated method stub
		System.out.println("멍멍~~");
	}
	
}


class Cuckoo implements Animal {

	@Override
	public void sound() {
		// TODO Auto-generated method stub
		System.out.println("뻐꾹~~");
	}
	
}