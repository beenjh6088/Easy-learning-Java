/*
■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■
Path : 
	Chapter 03. 제어문과 메서드
	프로그래밍 문제 03. 양의 정수 총합
Description : 
	01. do ~ while 문을 이용해서 양의 정수 총합 구하기
	02. 입력된 정수가 양의 정수가 아니면 입력을 종료
■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■
*/
package ch03;

import java.util.Scanner;

public class _Programming03_SumEven {

	public static void main(String[] args) {
		
		int sum = 0, num = 0;
		Scanner scan = new Scanner(System.in);
		
		do {
			System.out.print("양의 정수를 입력하세요 : ");
			num = scan.nextInt();
			
			if (num % 2 == 0)
				sum += num;
		}while(num > 0);
		
		System.out.println("짝수의 총합 : " + sum);
		
		scan.close();
	}
}
