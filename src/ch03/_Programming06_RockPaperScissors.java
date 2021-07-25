/*
■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■
Path : 
	Chapter 03. 제어문과 메서드
	프로그래밍 문제 06. 가위바위보
Description : 
	01. Scanner의 next() 메서드 사용
	02. String 클래스의 equals() 메서드 사용
■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■
*/
package ch03;

import java.util.Scanner;

public class _Programming06_RockPaperScissors {

	public static void main(String[] args) {
		
		String man = "", woman = "";
		String ROCK = "r", SCISSORS = "s", PAPER = "p";
		Scanner scan = new Scanner(System.in);
		
		// 남자 가위바위보 값 받기
		do {
			System.out.print("man : ");
			man = scan.next();
		} while(!(man.equals(ROCK) || man.equals(SCISSORS) || man.equals(PAPER)));
		
		// 여자 가위바위보 값 받기
		do {
			System.out.print("woman : ");
			woman = scan.next();
		} while(!(woman.equals(ROCK) || woman.equals(SCISSORS) || woman.equals(PAPER)));
		
		if (man.equals(ROCK) && woman.equals(SCISSORS)) {
			System.out.println("Man wins");
		} else if (man.equals(ROCK) && woman.equals(PAPER)) {
			System.out.println("Woman wins");
		} else if (man.equals(ROCK) && woman.equals(ROCK)) {
			System.out.println("Draw");
		} else if (man.equals(SCISSORS) && woman.equals(PAPER)) {
			System.out.println("Man wins");
		} else if (man.equals(SCISSORS) && woman.equals(ROCK)) {
			System.out.println("Woman wins");
		} else if (man.equals(SCISSORS) && woman.equals(SCISSORS)) {
			System.out.println("Draw");
		} else if (man.equals(PAPER) && woman.equals(ROCK)) {
			System.out.println("Man wins");
		} else if (man.equals(PAPER) && woman.equals(SCISSORS)) {
			System.out.println("Woman wins");
		} else if (man.equals(PAPER) && woman.equals(PAPER)) {
			System.out.println("Draw");
		}
		
		scan.close();
	}
}
