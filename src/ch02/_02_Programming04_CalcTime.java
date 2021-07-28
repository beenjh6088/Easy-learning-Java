/*
■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■
Path : 
	Chapter 02. 자바 프로그램 구조와 기초 문법
	프로그래밍 문제 04. 시간 환산
Description : 
	01. 초를 입력하면 시간, 분, 초로 환산하기
■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■
*/
package ch02;

import java.util.Scanner;

public class _02_Programming04_CalcTime {
	
	public static void main(String[] args) {

		int MINUTE_UNIT = 60;
		int HOUR_UNIT = 60;
		int input, h, m, s;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("초 단위 정수 입력 : ");
		input = scan.nextInt();
		
		h = input / (MINUTE_UNIT * HOUR_UNIT);
		
		m = input % (MINUTE_UNIT * HOUR_UNIT) / MINUTE_UNIT;
		
		s = input % (MINUTE_UNIT * HOUR_UNIT) % MINUTE_UNIT;

		System.out.printf("%d시간 %d분 %d초", h, m, s);
		
		scan.close();
	}
}
