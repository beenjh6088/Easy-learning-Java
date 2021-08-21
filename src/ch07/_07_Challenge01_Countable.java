/*
■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■
Path : 
	Chapter 07. 인터페이스와 특수 클래스
	도전과제 01. 
Description : 
	05_01. 
■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■
*/
package ch07;

public class _07_Challenge01_Countable {
	
	public static void main(String[] args) {
		Countable[] m = {
				new Bird("뻐꾸기"),
				new Bird("독수리"),
				new Tree("사과나무"),
				new Tree("밤나무")
		};
		
		for (Countable e : m) {
			e.count();
		}
		
		System.out.println();
		for (Countable e : m) {
			if (e instanceof Bird) {
				((Bird) e).fly();
			} else if (e instanceof Tree) {
				((Tree) e).ripen();
			}
		}
		
	}
}


interface Countable {
	void count();
}


class Bird implements Countable {

	String name;
	
	public Bird(String name) {
		this.name = name;
	}
	
	@Override
	public void count() {
		// TODO Auto-generated method stub
		System.out.println(name+" 2마리 있다.");
	}
	
	public void fly() {
		System.out.println(name+" 2마리가 날아간다");
	}
}


class Tree implements Countable {
	String name;
	
	public Tree(String name) {
		this.name = name;
	}
	
	@Override
	public void count() {
		// TODO Auto-generated method stub
		System.out.println(name+" 5그루 있다.");
	}
	
	public void ripen() {
		System.out.println(name + " 5그루가 익었다");
	}
}