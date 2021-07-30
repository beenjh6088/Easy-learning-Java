/*
■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■
Path : 
	Chapter 04. 객체 지향
	프로그래밍 문제 07. GolfClub
Description : 
	01. GolfClub
■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■
*/
package ch04;



class GolfClub {
	private int iron;
	private String putter;
	
	public GolfClub(int iron, String putter) {
		this.iron = iron;
		this.putter = putter;
	}
	
	public GolfClub(int iron) {
		this();
		this.iron = iron;
	}
	
	public GolfClub(String putter) {
		this();
		this.putter = putter;
	}
	
	public GolfClub() {
		this.iron = 7;
		this.putter = "";
	}
	
	public void print() {
		if(putter.equals("퍼터")) {
			System.out.println(putter + "입니다.");
		} else {
			System.out.println(iron + "번 아이언입니다.");
		}
	}
}


public class _04_Programming07_GolfClubTest {

	public static void main(String[] args) {
		GolfClub g1 = new GolfClub();
		g1.print();
		
		GolfClub g2 = new GolfClub(8);
		g2.print();
		
		GolfClub g3 = new GolfClub("퍼터");
		g3.print();
	}
}
