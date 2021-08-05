/*
■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■
Path : 
	Chapter 06. 상속
	05. 자식 클래스와 부모 생성자
Description : 
	01. 자식 생성자를 호출하면 자동으로 부모 생성자를 호출함. 이때 메서드 시그니처가 일치하는 부모 클래스 생성자가 있는지 확인하고 써야함.
■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■
*/
package ch06;



class Animal {
	public Animal(String s){
		System.out.println("동물 : " + s);
	}
}



public class _06_05_01_AnimalDemo extends Animal{

	public _06_05_01_AnimalDemo() {
		// super(); // 부모 클래스의 디폴트 생성자가 없으므로 오류 발생
		
		super("원숭이");
		System.out.println("포유류 : 원숭이");
	}
	
	public _06_05_01_AnimalDemo(String s) {
		super(s);
		System.out.println("포유류 : " + s);
	}
	
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		_06_05_01_AnimalDemo ape = new _06_05_01_AnimalDemo();
		_06_05_01_AnimalDemo lion = new _06_05_01_AnimalDemo("사자");
	}

}