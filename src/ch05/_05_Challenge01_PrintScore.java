/*
■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■
Path : 
	Chapter 05. 문자열, 배열, 열거 타입
	도전과제 01. 학생 수와 점수를 입력하면 각 학생의 성적을 출력하는 프로그램을 작성
Description : 
	01. 학생 수와 점수를 위한 배열 변수를 선언한다. 그리고 Scanner 클래스도 선언해서 키보드로 데이터를 받을 준비를 한다.
	02. 키보드로 학생 수를 입력하고 입력된 학생 수에 해당하는 크기의 scores 배열을 생성한다.
	03. for 문을 이용해 학생 수만큼 키보드로 성적을 입력받은 후 출력하도록 한다.
■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■
*/
package ch05;

import java.util.Scanner;

public class _05_Challenge01_PrintScore {
	
	public static void main(String[] args) {
		// 01. 학생 수와 점수를 위한 배열 변수를 선언한다. 그리고 Scanner 클래스도 선언해서 키보드로 데이터를 받을 준비를 한다.
		int num_cntStudent = 0;
		int[] arr_score = null;
		Scanner in = new Scanner(System.in);
		
		
		// 02. 키보드로 학생 수를 입력하고 입력된 학생 수에 해당하는 크기의 scores 배열을 생성한다.
		do {
			System.out.print("학생 수 : ");
			num_cntStudent = in.nextInt();
			arr_score = new int[num_cntStudent]; 
			System.out.println();
		} while(num_cntStudent > 10);
		
		
		System.out.println(num_cntStudent+"명의 학생 성적을 입력하세요.");
		for (int i = 0; i < arr_score.length; i++) {
			System.out.print((i+1) + "번 학생 점수 : ");
			arr_score[i] = in.nextInt();
		}
		
		
		// 03. for 문을 이용해 학생 수만큼 키보드로 성적을 입력받은 후 출력하도록 한다.
		System.out.println(num_cntStudent+"명의 학생 성적은 다음과 같습니다.");
		for (int i = 0; i < arr_score.length; i++) {
			System.out.printf("%3d점\t", arr_score[i]);
		}
		
		in.close();
	}
}