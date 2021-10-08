/*
■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■
Path : 
	Chapter 07. 인터페이스와 특수 클래스 
	프로그래밍 문제 01. 추상 클래스
Description : 
	01. 
■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■
*/
package ch07;


public class _07_Programming01_AbstractTest {

	public static void main(String[] args) {
		Concrete c = new Concrete(100, 50);
		c.show();
	}
}


abstract class Abstract {
	int i;
	public Abstract() {}
	public Abstract(int i) {
		this.i = i;
	}
	void show() {};
}

class Concrete extends Abstract {
	int j;
	public Concrete(int i, int j) {
		super(i);
//		this.i = i;
		this.j = j;
	}
	void show() {
		System.out.printf("i : %d, j : %d", i, j);
	}
}