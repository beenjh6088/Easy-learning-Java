/*
■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■
Path : 
	Chapter 05. 문자열, 배열, 열거 타입
	프로그래밍 문제 06. reverse
Description : 
	01. 배열의 원소를 역순으로 변환한 배열을 반환
■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■
*/
package ch05;

public class _05_Programming06_reverse {

	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4};
		
		System.out.println("original");
		for (int i : arr) {
			System.out.println(i);
		}
		
		
		System.out.println("\nnew");
		for (int i : reverse(arr)) {
			System.out.println(i);
		}
		
	}
	
	
	
	public static int[] reverse(int[] org) {
		int[] arr_new = new int[org.length];
		int idx = 0;
		
		for(int i = org.length-1; i >= 0; i--) {
			arr_new[idx] = org[i];
			idx++;
		}
		
		return arr_new;
	}
}