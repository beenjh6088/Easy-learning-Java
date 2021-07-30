/*
■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■
Path : 
	Chapter 05. 문자열, 배열, 열거타입
	01. 문자열
Description : 
	01. 문자 리터럴이 같으면 동일 객체
	02. 생성자를 쓰면 다른 객체
■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■
*/
package ch05;

public class _05_01_02_String1Demo {

	public static void main(String[] args) {
		String s1 = "Hi, Java!";
		String s2 = "Hi, Java!";
		String s3 = new String("Hi, Java!");
		String s4 = new String("Hi, Java!");
		
		System.out.println("s1 == s2 : " + (s1 == s2)); // true
		System.out.println("s1 == s3 : " + (s1 == s3)); // false
		System.out.println("s3 == s4 : " + (s3 == s4)); // false
		System.out.println("s2 == s3 : " + (s2 == s3)); // false
		
		s1 = s3;
		System.out.println("s1 == s3 : " + (s1 == s3)); // true
		
		
	}
}
