/*
■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■
Path : 
	Chapter 05. 문자열, 배열, 열거 타입
	프로그래밍 문제 04. URL 확인
Description : 
	01. 'java', 'com'으로 끝나는지 확인
■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■
*/
package ch05;

import java.util.Scanner;

public class _05_Programming04_URL {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		String str_url = null;
		String[] arr_postfix = {"com", "java"};
		int num_postfixIdx = 0;
		
		do {
			System.out.print("URL : ");
			str_url = in.nextLine();
			
			for (int i = 0; i < arr_postfix.length; i++) {
				num_postfixIdx = str_url.indexOf(arr_postfix[i]);
				if (str_url.endsWith(arr_postfix[i])) {
					System.out.printf("%s은 '%s'로 끝납니다.\n", str_url, arr_postfix[i]);
				} else if (num_postfixIdx > -1 && !str_url.endsWith(arr_postfix[i])) {
					System.out.printf("%s은 '%s'을 포함합니다.\n", str_url, arr_postfix[i]);
				}
				num_postfixIdx = 0;
			}
		} while(!str_url.equalsIgnoreCase("bye"));
		
		in.close();
	}
}