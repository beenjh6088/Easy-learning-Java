/*
■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■
Path : 
	Chapter 04. 객체 지향
	프로그래밍 문제 08. Dice
Description : 
	01. Dice
■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■
*/
package ch04;



class Dice {
	private int face;
	
	public int roll() {
		face = (int) Math.floor(Math.random()*6 + 1);
		return face;
	}
}


public class _04_Programming08_DiceTest {

	public static void main(String[] args) {
		Dice d = new Dice();
		System.out.println("주사위의 숫자 : " + d.roll());
	}
}
