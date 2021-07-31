/*
■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■
Path : 
	Chapter 05. 문자열, 배열, 열거타입
	01. 문자열
Description : 
	01. String 클래스의 정적 메서드 이용
		01] format()
		02] join()
		03] valueOf()
■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■
*/
package ch05;

public class _05_01_02_String5Demo {

	public static void main(String[] args) {
		
		String version = String.format("%s %d", "JDK", 14);
		System.out.println(version);
		
		String fruits = String.join(", ", "apple", "banana", "cherry", "durian");
		System.out.println(fruits);
		
		String pi = String.valueOf(3.14);
		System.out.println(pi);
	}
}