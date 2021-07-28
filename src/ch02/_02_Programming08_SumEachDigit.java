/*
■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■
Path : 
	Chapter 02. 자바 프로그램 구조와 기초 문법
	프로그래밍 문제 08. 각 자리수 더한 결과 출력
Description : 
	01. 
■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■
*/
package ch02;

import java.util.Scanner;

public class _02_Programming08_SumEachDigit {
	
	public static void main(String[] args) {

		int num, sum;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("0~999 사이의 숫자를 입력하세요 : ");
		num = scan.nextInt();
		sum = 0;
		
		sum += num / 100;				// 100의 자리
		sum += num % 100 / 10;	// 10의 자리
		sum += num % 10;				// 1의 자리
    
		System.out.println("각 자릿수의 합 : "+sum);
		
		scan.close();
	}
}
