/*
■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■
Path : 
	Chapter 03. 제어문과 메서드
	프로그래밍 문제 10. 소수 확인
Description : 
	01. 소수는 1보다 크면서 자신 외에는 나누어지지 않는 수
■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■
*/
package ch03;

import java.util.Scanner;

public class _03_Programming10_isPrime {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		System.out.print("양의 정수를 입력하세요 : ");
		int num = new Scanner(System.in).nextInt();
		
		if (isPrime(num)) 
			System.out.println(num + "은 소수입니다.");
		else
			System.out.println(num + "은 소수가 아닙니다.");
	}
	
	public static boolean isPrime(int num) {
		boolean result = false;
		
		if (num > 1) {
			for (int i = num; i > 1; i--) {
				if (i < num && num % i == 0) {
					result = false;
					break;
				} else {
					result = true;
				}
			}
		}
		
		return result;
	}

}