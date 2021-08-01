/*
■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■
Path : 
	Chapter 05. 문자열, 배열, 열거 타입
	프로그래밍 문제 02. sumExceptFirst
Description : 
	01. 가변 길이 변수를 이용해서 Sum값 구하기
	02. JAVA는 가변 길이 변수를 배열처럼 취급함
■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■
*/
package ch05;


public class _05_Programming02_sumExceptFirst {

	public static void main(String[] args) {
		
		System.out.println(sumExceptFirst(1,2,3,4));
		int arr[] = {2,3};
		System.out.println(sumExceptFirst(1, arr));
		System.out.println(sumExceptFirst(1,2,3,4,5));
	}
	
	public static int sumExceptFirst(int fst, int ... vars) {
		int sum = 0;
		for (int i : vars) {
			sum += i;
		}
		return sum;
	}
}
