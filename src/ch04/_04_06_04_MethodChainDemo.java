/*
■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■
Path : 
	Chapter 04. 객체 지향
	06. 생성자
Description : 
	01. 연속 호출(method chaining)
		01] 여러 메서드를 하나의 실행문에서 연속해 호출하는 기법
		02] 1}과 2}를 비교. 메서드의 반환타입을 void가 아닌 자신의 타입으로 하면 연속 호출이 가능.
			1}
				Person person = new Person();
				person.setName("민국");
				person.setAge(21);
				person.sayHello();
			2}
				Person person = new Person();
				person.setName("민국").setAge(21).sayHello();
■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■
*/
package ch04;



class Person {
	String name;
	int age;
	
	public Person setName(String name) {// 반환타입을 void가 아닌 객체 자신의 타입
		this.name = name;
		return this;// 객체 자신을 반환함
	}
	
	public Person setAge(int age) {
		this.age = age;
		return this;
	}
	
	public void sayHello() {
		System.out.println("안녕, 나는 " + name + "이고 " + age + "살이야");
	}
}



public class _04_06_04_MethodChainDemo {
	
	public static void main(String[] args) {
		Person person = new Person();
		
		person.setName("민국").setAge(21).sayHello();// 연속 호출
	}
}