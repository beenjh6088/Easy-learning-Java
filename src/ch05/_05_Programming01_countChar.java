/*
■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■
Path : 
	Chapter 05. 문자열, 배열, 열거 타입
	프로그래밍 문제 01. countChar
Description : 
	01. 문자열 s에 포함된 문자 c의 개수를 반환
■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■
*/
package ch05;


public class _05_Programming01_countChar {

	public static void main(String[] args) {
		
		String str = "ooh owe orange";
		System.out.println(countChar(str, 'o'));
	}
	
	public static int countChar(String s, char c) {
		
		int num_s_size = s.length();
		int num_cnt = 0;
		
		for (int i = 0; i < num_s_size; i++) {
			char chr_s_char = s.charAt(i);
			if(c == chr_s_char) {
				num_cnt++;
			}
		}
		
		return num_cnt;
	}
}
