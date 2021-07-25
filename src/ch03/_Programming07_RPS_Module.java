/*
■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■
Path : 
	Chapter 03. 제어문과 메서드
	프로그래밍 문제 07. 가위바위보 모듈화
Description : 
	01. 프롬프트와 r,p,s를 입력하는 부분 모듈화
	02. 데이터에 따른 승자 출력 부분 모듈화
■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■
*/
package ch03;

import java.util.Scanner;

public class _Programming07_RPS_Module {
	public static String ROCK = "r", SCISSORS = "s", PAPER = "p";
	public static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		String c = input("철수");
		String y = input("영희");
		whoWin(c, y);
		
		scan.close();
	}
	
	
	
	public static String input(String name) {
		String result = "";
		
		do {
			System.out.print(name+" : ");
			result = scan.next();
		} while(!(result.equals(ROCK) || result.equals(SCISSORS) || result.equals(PAPER)));
		
		return result;
	}
	
	
	
	public static void whoWin(String i1, String i2) {
		if (i1.equals(ROCK) && i2.equals(SCISSORS)) {
			System.out.println(i1 + " wins");
		} else if (i1.equals(ROCK) && i2.equals(PAPER)) {
			System.out.println(i2 + " wins");
		} else if (i1.equals(ROCK) && i2.equals(ROCK)) {
			System.out.println("Draw");
		} else if (i1.equals(SCISSORS) && i2.equals(PAPER)) {
			System.out.println(i1 + " wins");
		} else if (i1.equals(SCISSORS) && i2.equals(ROCK)) {
			System.out.println(i2 + " wins");
		} else if (i1.equals(SCISSORS) && i2.equals(SCISSORS)) {
			System.out.println("Draw");
		} else if (i1.equals(PAPER) && i2.equals(ROCK)) {
			System.out.println(i1 + " wins");
		} else if (i1.equals(PAPER) && i2.equals(SCISSORS)) {
			System.out.println(i2 + " wins");
		} else if (i1.equals(PAPER) && i2.equals(PAPER)) {
			System.out.println("Draw");
		}
	}
}
