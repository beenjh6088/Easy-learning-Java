/*
■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■
Path : 
	Chapter 02. 자바 프로그램 구조와 기초 문법
	05 연산자
Description : 
	01. 연산(Operation)			: 데이터를 계산해 결과를 얻어내는 과정
	02. 연산자(Operator)		: 연산 시 사용하는 기호
	03. 피연산자(Operand)		: 연산되는 데이터
	04. 연산식(Expression)	: 피연산자와 연산자들의 조합
	05. 연산자 우선순위 및 결합 규칙
		01] 단항 > 이항 > 삼항. 단항이 제일 높은 우선 순위
		02] 대부분 연산자는 왼쪽에서 오른쪽으로 연산. 그러나 전위 연산자(++)와 대입 연산자는 오른쪽에서 왼쪽으로 연산한다.
	06. a *= a + 1 >> a = a * (a + 1)
■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■
*/
package ch02;

public class _05_08_OperatorPrecedenceDemo {

	public static void main(String[] args) {
		
		/*
		int x, y, z;
		x = y = z = 3; // 3 = 3 = 3
		z = x * y / z % 2; // z = 3 * 3 / 3 % 2
		z = x++ + --y * x; // 3 + 2 * 4
		*/
		
		int x = 5;
		int y = 10;
		int z = ++x * y--;
		System.out.printf("%d\t%d\t%d\n", x, y, z);
		
		int year = 2020;
		System.out.println(year % 4 == 0 && year % 100 != 0 || year % 400 == 0);
		
		int a = 3;
		System.out.println("a : " + a);
		a *= a + 1;
		System.out.println("a : " + a);
		
	}
}