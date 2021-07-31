/*
■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■
Path : 
	Chapter 05. 문자열, 배열, 열거타입
	01. 배열
Description : 
	01. 메인 메서드의 매개변수 전달
	02. cmd에서 java 실행시키기
		01] $ java Test string0 string1 string2
		02] 위 커맨드라인의 Test에는 확장자(.class)를 넣으면 안돼
■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■
*/
package ch05;

public class _05_03_03_MainArgumentDemo {

	public static void main(String[] args) {
		
		if (args.length == 2) {
			int i = Integer.parseInt(args[1]);
			nPrintln(args[0], i);
		} else {
			System.out.println("아이쿠!");
		}
	}
	
	public static void nPrintln(String s, int n) {
		for (int i = 0; i < n; i++)
			System.out.println(s);
	}
}