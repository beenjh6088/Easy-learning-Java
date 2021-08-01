/*
■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■
Path : 
	Chapter 05. 문자열, 배열, 열거 타입
	프로그래밍 문제 03. Direction
Description : 
	01. 열거타입 활용
■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■
*/
package ch05;


public class _05_Programming03_DirectionDemo {

	public static void main(String[] args) {
		
		for(Direction01 d : Direction01.values()) {
			System.out.print(d + " ");
		}
	}
}



enum Direction01 {
	EAST("동"), WEST("서"), SOUTH("남"), NORTH("북");
	
	String desc;
	
	private Direction01(String desc) {
		this.desc = desc;
	}
	
	public String toString() {
		return desc;
	}
}