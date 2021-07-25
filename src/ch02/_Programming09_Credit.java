/*
■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■
Path : 
	Chapter 02. 자바 프로그램 구조와 기초 문법
	프로그래밍 문제 09. 학점으로 졸업여부 출력
Description : 
	01. 학점 최소 140 이상
	02. 전공은 70이상이고 교양과 일반은 각각 30학점 이상이거나 두 영역이 80학점 이상이어야 한다.
■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■
*/
package ch02;

import java.util.Scanner;

public class _Programming09_Credit {
	
	public static void main(String[] args) {

		int major, liberalArts, general;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("전공 이수 학점 : ");
		major = scan.nextInt();
		
		System.out.print("교양 이수 학점 : ");
		liberalArts = scan.nextInt();
		
		System.out.print("일반 이수 학점 : ");
		general = scan.nextInt();
		
		if (major >= 70 && ((liberalArts >= 30 && general >= 30) || (liberalArts + general >= 80))) {
			System.out.println("졸업 가능");
		} else {
			System.out.println("불가능");
		}
		
		scan.close();
	}
}
