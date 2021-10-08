/*
■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■
Path : 
	Chapter 07. 인터페이스와 특수 클래스 
	프로그래밍 문제 06. 인터페이스
Description : 
	01. 
■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■
*/
package ch07;

public class _07_Programming06_HumanTest {

	public static void main(String[] args) {
		Human.echo();
		
		Student s = new Student(20);
		s.print();
		s.eat();
		
		Human p = new Worker();
		p.print();
		p.eat();
	}
}

interface Human {
	void eat();
	static void echo() {System.out.println("yaho");};
	default void print() {System.out.println("인간입니다.");};
}

class Worker implements Human {
	public void eat() {
		System.out.println("빵을 먹습니다.");
	}
	@Override
	public void print() {
		// TODO Auto-generated method stub
		Human.super.print();
	}
}

class Student implements Human {
	int age;
	
	public Student() {
		// TODO Auto-generated constructor stub
		this.age = 0;
	}
	public Student(int age) {
		this.age = age;
	}
	
	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("도시락을 먹습니다.");
	}
	
	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println(age+ "세의 학생입니다.");
	}
}