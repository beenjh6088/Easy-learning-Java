/*
■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■
Path : 
	Chapter 02. 자바 프로그램 구조와 기초 문법
	프로그래밍 문제 06. 섭씨온도로 환산
Description : 
	01. C = 5/9(F-32)
■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■
*/
package ch02;

import java.util.Scanner;

public class _Programming06_UpperCase {
	
	public static void main(String[] args) {

		double c, f;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("F : ");
		f = scan.nextDouble();
		
		c = 5.0 / 9.0 * (f - 32);
		
		System.out.println("C : "+c);
		
		scan.close();
	}
}
