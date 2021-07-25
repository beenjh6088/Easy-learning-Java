/*
■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■
Path : 
	Chapter 02. 자바 프로그램 구조와 기초 문법
	프로그래밍 문제 05. 대문자로 변환
Description : 
	01. 소문자로 초기화된 값을 대문자로
	02. ASCII 테이블에서는 대문자가 소문자 앞에 있다.
	03. 대문자와 소문자의 정숫값 차이는 (int)'A' - (int)'a'를 이용한다.
■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■
*/
package ch02;

public class _Programming05_Celsius {
	
	public static void main(String[] args) {

		char c, C;
		int distance = (int)'a' - (int)'A';
		c = 'z';
		C = (char)(c - distance);
		System.out.println("C : " + C);
	}
}