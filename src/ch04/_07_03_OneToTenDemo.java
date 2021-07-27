/*
■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■
Path : 
	Chapter 04. 객체 지향
	07. 정적 멤버
Description : 
	01. 정적 블록
		01] 객체 실행 전에 실행되니까 주의하세요
■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■
*/
package ch04;

public class _07_03_OneToTenDemo {
	
	static int sumOneToTen;
	
	static {
		int sum = 0;
		
		for (int i = 1; i <= 10; i++)
			sum += i;
		
		sumOneToTen = sum;
	}
	
	public static void main(String[] args) {
		System.out.println(sumOneToTen);
	}
}