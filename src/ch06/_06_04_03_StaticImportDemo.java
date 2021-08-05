/*
■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■
Path : 
	Chapter 06. 상속
	04. 패키지
Description : 
	01. 패키지 사용
		01] 정적 import 문
		02] 단순 import 문
■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■
*/
package ch06;

import static java.util.Arrays.sort;

import java.util.Calendar;

public class _06_04_03_StaticImportDemo {

	public static void main(String[] args) {
		int[] data = {3,5,1,7};
		sort(data); // 정적 import 문으로 인해 클래스 이름없이 바로 멤버를 사용할 수 있다.
		System.out.println(Calendar.JANUARY); // 단순 import시 정적 멤버를 사용하려면 클래스 이름이 필요하다.
		Calendar.getInstance();
	}

}