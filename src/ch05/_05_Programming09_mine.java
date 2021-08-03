/*
■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■
Path : 
	Chapter 05. 문자열, 배열, 열거 타입
	프로그래밍 문제 09. 지뢰찾기
Description : 
	01. 프로그램은 3개의 명령행 인수(m, n, p)를 받아들이고, m * n 크기의 배열을 생성해 지뢰를 숨긴다.
	02. 숨긴 지뢰가 있는 원소는 *로 표시하고 없는 원소는 -로 표시한다. 원소에 지뢰가 있을 확률은 세 번째 명령행 인수인 p이다.
	03. 지뢰 숨김 여부를 나타내는 2차원 배열을 출력하고, 지뢰를 숨기지 않은 원소를 -대신에 이웃한 지뢰 개수로 채운 2차원 배열도 함께 출력한다.
	04. 이웃한 지뢰는 상하좌우 및 대각선 원소에 숨긴 지뢰를 의미한다.
	05. 지뢰 숨긴 지역을 30%로 설정하려면, 난수 발생 정적 함수 Math.random() 값이 0.3보다 적은 원소에 지뢰를 숨긴다.
■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■
*/
package ch05;

import java.util.Random;

public class _05_Programming09_mine {
	
	private static final String MINE = " X ";
	private static final String NONE = " O ";
	private static final int ROW = 10;
	private static final int COL = 10;
	private static final int MINE_COUNT = 10;
	private String[][] mineBoard;
	
	
	public static void main(String[] args) {
		_05_Programming09_mine mineSweeper = new _05_Programming09_mine();
		mineSweeper.initBoard();
    mineSweeper.setMineLocation();
    mineSweeper.setBoardValues();
    mineSweeper.printBoard();
	}
	
	
	public _05_Programming09_mine() {
		this.mineBoard = new String[ROW][COL];
	}
	
	
	public void initBoard() {
		for (int i = 0; i < ROW; i ++) {
			for (int j = 0; j < COL; j++) {
				mineBoard[i][j] = NONE;
			}
		}
	}
	
	
  public void setMineLocation() {
    int mineCnt = MINE_COUNT;
    Random random = new Random();

    while (mineCnt-- > 0) {
	    int ranRow = random.nextInt(ROW);
	    int ranCol = random.nextInt(COL);
	
	    if (isMine(ranRow, ranCol)) {
	        mineCnt++;
	    } else {
	        mineBoard[ranRow][ranCol] = MINE;
	    }
    }
  }
	
	
	public void setBoardValues() {
		for (int i = 0; i < ROW; i++) {
			for (int j = 0; j < COL; j++) {
				if (isNotMine(i, j)) mineBoard[i][j] = getNearMineCount(i, j);
			}
		}
	}
	
	
	public String getNearMineCount(int row, int col) {
		int count = 0;
		
		if (isMine(row - 1, col - 1)) count++;
		if (isMine(row - 1, col)) count++;
		if (isMine(row - 1, col + 1)) count++;
		if (isMine(row, col - 1)) count++;
		if (isMine(row, col + 1)) count++;
		if (isMine(row + 1, col - 1)) count++;
		if (isMine(row + 1, col)) count++;
		if (isMine(row + 1, col + 1)) count++;
		
		return " " + count + " ";
	}
	
	
	private boolean isMine(int row, int col) {
		try {
			return mineBoard[row][col].equals(MINE);
		} catch (IndexOutOfBoundsException e) {
			return false;
		}
	}
	
	
	private boolean isNotMine(int i, int j) {
		return !isMine(i, j);
	}
	
	
	public void printBoard() {
		System.out.println("ROW : " + ROW);
		System.out.println("COL : " + COL);
		System.out.println("-----------------------------");
		
		for (int i = 0; i < ROW; i++) {
			for (int j = 0; j < COL; j++) {
				System.out.print(mineBoard[i][j]);
			}
			System.out.println();
		}
	}
	
}


