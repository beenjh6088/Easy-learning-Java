/*
■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■
Path : 
	Chapter 03. 제어문과 메서드
	프로그래밍 문제 04. 직각삼각형
Description : 
	01. for 문을 사용해서 직각삼각형 만들기
■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■
*/
package ch03;

public class _Programming04_RightTriangle {

	public static void main(String[] args) {
		
		for (int i = 1; i <= 5; i++) {
			
			for (int j = 1; j <= i; j++) {
				
				System.out.print("*");
				
			}
			
			System.out.println();
			
		}
	}
}
