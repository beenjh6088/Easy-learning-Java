/*
■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■
Path : 
	Chapter 05. 문자열, 배열, 열거타입
	01. 문자열
Description : 
	01. String의 다양한 메서드
		01] length()
		02] charAt()
		03] concat()
		04] toLowerCase()
		05] substring()
		06] isEmpty() : 길이가 0이면 true
		07] isBlank() : 길이가 0 혹은 공백 있으면 true
		08] repeat()
		09] trim()
		10] indexOf()
■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■
*/
package ch05;

public class _05_01_02_String3Demo {

	public static void main(String[] args) {
		String s1 = new String("Hi,");
		String s2 = new String(" Java");
		
		System.out.println("문자열 길이(s1) : " + s1.length());		// 3
		System.out.println(s1.charAt(1));											// i
		
		s1 = s1.concat(s2);
		
		System.out.println(s1.concat(s2) + "!");							// Hi, Java!
		System.out.println(s1.toLowerCase() + "!");						// hi, java!
		System.out.println(s1.substring(4,8) + "!");					// Java!
		
		String s3 = " ";
		System.out.println(s3.isEmpty());											// false
		//System.out.println(s3.isBlank());										// true
		String s4 = "";
		System.out.println(s4.isEmpty());											// true
		//System.out.println(s4.isBlank());										// true
		
		//String s5 = "*-*";
		//System.out.println(s5.repeat(10));									// *-**-**-**-**-**-**-**-**-**-*
		
		System.out.println(s2.trim().indexOf("v"));						// 2
		
	}
}
