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

public class _05_Programming09_mine {

	public static void main(String[] args) {
		// Parameters
		int m = 5;
		int n = 10;
		double p = 0.3;
		
		
		// Initialize
		String NON_MINE = "-";
		String MINE = "*";
		String [][] arr_mines = new String[m][n];
		String [][] arr_print = new String[m][n];
		for (int i = 0; i < arr_mines.length; i++) {
			for (int j = 0; j < arr_mines[i].length; j++) {
				if (Math.random() < p) {
					arr_mines[i][j] = MINE;
				} else {
					arr_mines[i][j] = NON_MINE;
				}
			}
		}
		
		
		// Print Original
		System.out.println("PRINT ORIGINAL");
		for (int i = 0; i < arr_mines.length; i++) {
			for (int j = 0; j < arr_mines[i].length; j++) {
				System.out.printf("%2s", arr_mines[i][j]);
			}
			System.out.println("\n");
		}
		System.out.println();
		
		
		// Print Mine Position and Blank Position
		arr_print = arr_mines.clone();
		for (int i = 0; i < arr_mines.length; i++) {
			for (int j = 0; j < arr_mines[i].length; j++) {
				// for 문 한 번 더쓰는 방향으로 가보자
			}
		}
		
		
		// Print Original
		System.out.println("PRINT ORIGINAL");
		for (int i = 0; i < arr_print.length; i++) {
			for (int j = 0; j < arr_print[i].length; j++) {
				System.out.printf("%2s", arr_print[i][j]);
			}
			System.out.println("\n");
		}
		System.out.println();
		
	}
}
