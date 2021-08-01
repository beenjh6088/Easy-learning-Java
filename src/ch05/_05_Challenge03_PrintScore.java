/*
■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■
Path : 
	Chapter 05. 문자열, 배열, 열거 타입
	도전과제 01. 학생 수와 점수를 입력하면 각 학생의 성적을 출력하는 프로그램을 작성
Description : 
	01. 학생 수와 점수를 위한 배열 변수를 선언한다. 그리고 Scanner 클래스도 선언해서 키보드로 데이터를 받을 준비를 한다.
	02. 키보드로 학생 수를 입력하고 입력된 학생 수에 해당하는 크기의 scores 배열을 생성한다.
	03. for 문을 이용해 학생 수만큼 키보드로 성적을 입력받은 후 출력하도록 한다.
	-----------------------------------------------------------------------------------------------------------
	04. for ~ each 문으로 교체
	05. 점수 구간별로 등급 출력
	-----------------------------------------------------------------------------------------------------------
	06. 열거타입 추가
	07. 상수목록 출력시 한글 등급으로 출력
■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■
*/
package ch05;

import java.util.Scanner;

public class _05_Challenge03_PrintScore {
	
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
		
		
//		 // 03. for 문을 이용해 학생 수만큼 키보드로 성적을 입력받은 후 출력하도록 한다.
//		System.out.println(num_cntStudent+"명의 학생 성적은 다음과 같습니다.");
//		for (int i = 0; i < arr_score.length; i++) {
//			System.out.printf("%3d점\t", arr_score[i]);
//		}
		
		
		// 04. for ~ each 문으로 교체
		System.out.println(num_cntStudent+"명의 학생 성적은 다음과 같습니다.");
		for (int score : arr_score) {
			System.out.printf("%3d점\t", score);
		}
		System.out.println();
		
		
		// 05. 점수 구간별로 등급 출력
		System.out.println(num_cntStudent+"명의 학생 성적은 다음과 같습니다.");
		for (int i = 0; i < arr_score.length; i++) {
			int score = arr_score[i];
			if (score <= 100 && score >= 90) {
				System.out.println((i + 1)+ "번 학생의 등급은 " + Degree.A + "입니다.");
			} else if (score < 90 && score >= 80) {
				System.out.println((i + 1)+ "번 학생의 등급은 " + Degree.B + "입니다.");
			} else if (score < 80 && score >= 70) {
				System.out.println((i + 1)+ "번 학생의 등급은 " + Degree.C + "입니다.");
			} else if (score < 70 && score >= 60) {
				System.out.println((i + 1)+ "번 학생의 등급은 " + Degree.D + "입니다.");
			} else {
				System.out.println((i + 1)+ "번 학생의 등급은 " + Degree.F + "입니다.");
			}
		}
		
		
		in.close();
	}
}



enum Degree {
	// 06. 열거타입 추가
	A("최우수"), B("우수"), C("보통"), D("미흡"), F("탈락");
	
	String str_degreeDesc;
	
	private Degree(String str_degreeDesc){
		this.str_degreeDesc = str_degreeDesc;
	}
	
	// 07. 상수목록 출력시 한글 등급으로 출력
	public String toString() {
		return str_degreeDesc;
	}
}