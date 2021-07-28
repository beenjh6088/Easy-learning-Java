/*
■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■
Path : 
	Chapter 03. 제어문과 메서드
	도전과제 01. 팩토리얼 구하기
Description : 
	01. 팩토리얼 값을 계산하는 프로그램을 반복문, 조건문 메서등 등을 사용해서 작성해 보자
	02. 메서드 오버로딩으로 구간 팩토리얼 메서드 만들기
■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■
*/
package ch03;

public class _03_Challenge01_Factorial {
	
	public static void main(String[] args) {
		
		System.out.println("factorial(5)     : "+factorial(5));
		System.out.println("factorial(1, 5)  : "+factorial(1, 5));
		System.out.println("factorial(3, 5)  : "+factorial(3, 5));
		System.out.println("factorial(10, 5) : "+factorial(10, 5));
		
	}
	
	
	
	public static int factorial(int num) {
		int result = 1;
		
		// 매개변수 유효성 검사
		if (num < 0) {
			return -1;
		}
		
		// 팩토리얼 메인 로직
		for (int i = num; i >= 1; i--){
			result *= i;
		}
		
		return result;
	}
	
	
	// 메서드  오버로딩
	public static int factorial(int num1, int num2) {
		int result = 1;
		
		// 매개변수 유효성 검사
		if (num1 < 0 || num2 < 0) {
			return -1;
		}
		
		// 팩토리얼 메인 로직
		for (int i = num2; i >= num1; i--){
			result *= i;
		}
		
		return result;
	}
}
