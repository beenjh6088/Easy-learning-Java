/*
■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■
Path : 
	Chapter 02. 자바 프로그램 구조와 기초 문법
	03 변수
Description : 
	01. 타입 변환 응용
	02. 7 / 4 vs 7 / (double) 4
■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■
*/
package ch02;

public class _02_03_01_CastDemo {
	
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		int i;
		double d;
		byte b;
		
		i = 7 / 4;
		System.out.println("i : " + i);
		d = 7 / 4;
		System.out.println("d : " + d);
		d = 7 / (double) 4;
		System.out.println("casting d : " + d);
		
		// i = 7 / (double) 4; 타입 불일치 오류 발생
		
		i = 300;
		if (i < Byte.MIN_VALUE || i > Byte.MAX_VALUE)
			System.out.println("byte 타입으로 변환할 수 없습니다.");
		else
			b = (byte) i;
	}
}
