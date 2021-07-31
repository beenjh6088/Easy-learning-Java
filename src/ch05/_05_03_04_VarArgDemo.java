/*
■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■
Path : 
	Chapter 05. 문자열, 배열, 열거타입
	01. 배열
Description : 
	01. 가변 개수 매개변수
		01] JAVA는 가변 변수를 매열로 취급함
		02] 데이터타입 ... 변수
■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■
*/
package ch05;

public class _05_03_04_VarArgDemo {

	public static void main(String[] args) {
		printSum(1,2,3,4,5);
		printSum(10,20,30);
		System.out.println(String.format("My Score is %.1f", 99.8));
		System.out.println(String.join(", ", "one", "two", "three"));
	}
	
	public static void printSum(int ... v) {
		int sum = 0;
		for (int i : v)
			sum += i;
		System.out.println(sum);
	}
}