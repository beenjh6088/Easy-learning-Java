/*
■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■
Path : 
	Chapter 03. 제어문과 메서드
	06 메서드 05 메서드 오버로딩
Description : 
	01. 자바는 메서드 시그니처를 사용해 메서드를 구분한다. 메서드 시그너처는 메서드 이름, 매개변수 개수, 매개변수 데이터 타입, 매개변수 순서를 의미한다.
	02. 메서드 이름은 같지만 메서드 시그너처가 다른 메서드를 정의하는 것을 메서드 오버로딩이라고 한다.
■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■
*/
package ch03;

public class _06_05_OverloadDemo {

	public static void main(String[] args) {
		
		int i1 = 3, i2 = 7, i3 = 10;
		double d1 = 7.0, d2 = 3.0;
		
		System.out.printf("max(%d, %d) = %d\n", i1, i2, max(i1, i2));
		System.out.printf("max(%.1f, %.1f) = %.1f\n", d1, d2, max(d1, d2));
		System.out.printf("max(%d, %d, %d) = %d\n", i1, i2, i3, max(i1, i2, i3));
	}
	
	
	
	public static int max(int n1, int n2) {
		int result = n1 > n2 ? n1 : n2;
		return result;
	}
	
	
	
	public static double max(double n1 , double n2) {
		double result = n1 > n2 ? n1 : n2;
		return result;
	}
	
	
	
	public static int max(int n1, int n2, int n3) {
		return max(max(n1, n2), n3);
	}
}
