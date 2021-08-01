/*
■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■
\Path : 
	Chapter 05. 문자열, 배열, 열거타입
	01. 배열
Description : 
	01. 열거 타입 활용1
	02. 열거타입의 상수 목록은 실제로는 열거 타입의 인스턴스 객체이다.
	03. 객체 비교시 equals()와 ==으로 비교가 가능하다.
	04. 열거 타입의 상수 출력시 값대신 상수의 이름이 출력된다.
■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■
*/
package ch05;

public class _05_04_02_EnumDemo {

	public static void main(String[] args) {
		
		
//		// 열거 타입 활용 1
//		Gender gender = Gender.FEMALE;
//		if (gender == Gender.MALE) { // 03. 객체 비교시 equals()와 ==으로 비교가 가능하다.
//			System.out.println(Gender.MALE + "는 병역의 의무가 있다.");
//		} else {
//			System.out.println(Gender.FEMALE + "는 병역의 의무가 없다."); // 04. 열거 타입의 상수 출력시 값대신 상수의 이름이 출력된다.
//		}
		
		
		// 열거 타입 활용 2
		Gender gender = Gender.FEMALE;
		if (gender.equals(Gender.MALE) || gender == Gender.MALE) { // 03. 객체 비교시 equals()와 ==으로 비교가 가능하다.
			System.out.println(Gender.MALE + "은 병역 의무가 있다.");
		} else {
			System.out.println(Gender.FEMALE+"은 병역 의무가 없다.");
		}
		for (Gender g : Gender.values()) {
			System.out.println(g.name());
		}
		System.out.println(Gender.valueOf("MALE"));
		
	}
}



enum Gender {
	MALE("남성"), FEMALE("여성"); // 02. 열거타입의 상수 목록은 실제로는 열거 타입의 인스턴스 객체이다.
	
	private String s;
	
	Gender(String s) {
		this.s = s;
	}
	
	public String toString() {
		return s;
	}
}
enum Direction { EAST, WEST, SOUTH, NORTH }