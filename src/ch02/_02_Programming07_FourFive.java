/*
■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■
Path : 
	Chapter 02. 자바 프로그램 구조와 기초 문법
	프로그래밍 문제 07. 나누어 떨어지는지 확인
Description : 
	01. 4와 5로 나누어지는지
	02. 4 또는 5로 나누어지는지
	03. 4나 5 중 하나로 나누어지지만 두 수 모두로는 나누어지지 않는지
	04. 배타적 논리합
■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■
*/
package ch02;

import java.util.Scanner;

public class _02_Programming07_FourFive {
	
	public static void main(String[] args) {

		int num;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		num = scan.nextInt();
		
		System.out.print("① 정수가 4 와 5로 나누어지는가 : ");
    System.out.println((num % 4 == 0) && (num % 5 == 0));
    
    System.out.print("② 정수가 4 또는 5로 나누어지는가 : ");
    System.out.println((num % 4 == 0) || (num % 5 == 0));
    
    System.out.print("③ 정수가 4 나 5로 나누어지지만 두 수 모두로는 나누어지지 않는가 : ");
    System.out.println((num % 4 == 0) ^ (num % 5 == 0));    
    
		scan.close();
	}
}
