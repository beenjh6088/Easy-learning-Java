/*
■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■
Path : 
	Chapter 03. 제어문과 메서드
	06 메서드 04 메서드와 값 전달
Description : 
	01. 메서드를 호출하면 인숫값의 복사본을 매개변수로 전달하는데, 이를 값 전달(call by value)라고 한다.
			이 방식은  메서드를 실행하는 도중에 매개변수 값이 변하더라도 인수에는 영향을 미치지 않는다.
■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■
*/
package ch03;

public class _06_04_IncrementDemo {

	public static void main(String[] args) {
		int x = 0;
		System.out.println("increment() 메서드를 호출하기 전의 x : "+x);
		increment(x);
		System.out.println("increment() 메서드를 호출한 후의 x : "+x);
		
	}
	
	
	
	public static void increment(int n) {
		System.out.println("increment() 메서드를 시작할 때의 n : "+n);
		n++;
		System.out.println("increment() 메서드를 끝날 때의 n : "+n);
	}
	
}
