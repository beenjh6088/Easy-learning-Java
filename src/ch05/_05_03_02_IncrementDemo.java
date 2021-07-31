/*
■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■
Path : 
	Chapter 05. 문자열, 배열, 열거타입
	01. 배열
Description : 
	01. 메서드의 인수로 배열 전달
■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■
*/
package ch05;

public class _05_03_02_IncrementDemo {

	public static void main(String[] args) {
		
		int[] x = { 0 };
		System.out.println("호출 전의 x[0] : " + x[0]);
		
		increment(x);
		System.out.println("호출 후의 x[0] : " + x[0]);
	}
	
	public static void increment(int[] n) {
		System.out.print("increment() 메서드 안에서 ");
		System.out.print("n[0] : " + n[0] + " ---> ");
		n[0]++;
		System.out.println("n[0] : "+n[0]);
	}
}