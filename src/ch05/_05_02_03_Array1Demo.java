/*
■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■
Path : 
	Chapter 05. 문자열, 배열, 열거타입
	01. 배열
Description : 
	01. 배열 원소의 접근과 배열의 크기
■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■
*/
package ch05;

import java.util.Scanner;

public class _05_02_03_Array1Demo {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int scores[] = new int[5];
		int sum = 0;
		
		for (int i = 0; i < scores.length; i++) {
			System.out.print("score : ");
			scores[i] = in.nextInt();
		}
		
		for (int i = 0; i < scores.length; i++) {
			sum += scores[i];
		}
		
		System.out.println("average : " + sum / 5.0);
		
		in.close();
	}
}