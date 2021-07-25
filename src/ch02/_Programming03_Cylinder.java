/*
■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■
Path : 
	Chapter 02. 자바 프로그램 구조와 기초 문법
	프로그래밍 문제 03. 원기둥 부피
Description : 
	01. 키보드로 입력받은 값들로 원기둥 부피 구하기
■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■
*/
package ch02;

import java.util.Scanner;

public class _Programming03_Cylinder {
	
	public static void main(String[] args) {

		double r, h, v;
		double PI = 3.14;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("밑면의 반지름 : ");
		r = scan.nextDouble();
		
		System.out.print("높이 : ");
		h = scan.nextDouble();
		
		v = PI * r * r * h;
		
		System.out.println("부피 : " + v);
		
		scan.close();
	}
}
