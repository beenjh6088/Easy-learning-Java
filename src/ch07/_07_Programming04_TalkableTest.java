/*
■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■
Path : 
	Chapter 07. 인터페이스와 특수 클래스 
	프로그래밍 문제 04. 인터페이스
Description : 
	01. 
■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■
*/
package ch07;

public class _07_Programming04_TalkableTest {

	public static void main(String[] args) {
		speak(new Korean());
		speak(new American());
	}
	
	static void speak(Talkable t) {
		t.talk();
	}
}


interface Talkable {
	void talk();
}


class Korean implements Talkable {

	@Override
	public void talk() {
		// TODO Auto-generated method stub
		System.out.println("안녕");
	}
	
}


class American implements Talkable {

	@Override
	public void talk() {
		// TODO Auto-generated method stub
		System.out.println("hi");
	}
	
}