/*
■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■
Path : 
	Chapter 06. 상속
	07. final 클래스와 메서드
Description : 
	01. final 클래스
		01] 더 이상 상속할 수 업게함. 종단 클래스 역할.
		02] 목적 : 보안용. 대표적인 예로 String 클래스. extends String은 불가함.
■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■
*/
package ch06;



class Good {
}

class Better extends Good {
}

// final class
final class Best extends Better {
}

//class NumberOne extends Best {}

public class _06_07_01_FinalClassDemo {

	public static void main(String[] args) {
//		new NumberOne();
		new Best();
	}
}