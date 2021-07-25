/*
■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■
Path : 
	Chapter 02. 자바 프로그램 구조와 기초 문법
	도전과제 01. 직사각형 넓이
Description : 
	01. 
■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■
*/
package ch02;

import java.util.Scanner;

public class _Challenge01_RectangleArea {

	public static void main(String[] args) {
		
		double w, h, area;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("넓이를 입력하세요 : ");
		w = scan.nextDouble();
		
		System.out.print("높이를 입력하세요 : ");
		h = scan.nextDouble();
		
		area = (w * h);
		
		System.out.printf("직사각형의 넓이는 %.2f입니다.", area);
		
		scan.close();
	}
}
