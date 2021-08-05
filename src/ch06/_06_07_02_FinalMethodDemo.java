/*
■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■
Path : 
	Chapter 06. 상속
	07. final 클래스와 메서드
Description : 
	01. final 메서드
		01] 더 이상 오버라이딩할 수 없음. 종단 메서드.
■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■
*/
package ch06;

class Chess {
	enum ChessPlayer {
		WHITE, BLACK;
	}
	
	// final method
	final ChessPlayer getFirstPlayer() {
		return ChessPlayer.WHITE;
	}
}



class WorldChess extends Chess {
	// final method는 Override 불가
	// ChessPlayer getFirstPlayer() {}
}



public class _06_07_02_FinalMethodDemo {

	public static void main(String[] args) {
		WorldChess w = new WorldChess();
		w.getFirstPlayer();
	}
}