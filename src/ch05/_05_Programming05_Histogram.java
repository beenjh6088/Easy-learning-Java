/*
■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■
Path : 
	Chapter 05. 문자열, 배열, 열거 타입
	프로그래밍 문제 05. Histogram
Description : 
	01. 0~99 사이의 정수를 키보드에서 10개 입력받아 10 단위 간격의 히스토그램을 출력하는 프로그램을 작성하시오.
	02. 입력된 수가 음수이면 무시하시오.
■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■
*/
package ch05;

import java.util.Scanner;

public class _05_Programming05_Histogram {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int num_endRange = 10;
		int[] arr_histogram = new int[num_endRange];
		
		System.out.println("■■■■■■■■■■■■ 숫자 " + num_endRange + "개를 입력하세요 ■■■■■■■■■■■■");
		for (int i = 0; i < num_endRange; i++) {
			int num_rawData = -1;
			int num_group = -1;
			do {
				System.out.printf("%15d번째 입력 : ", i);
				num_rawData = in.nextInt();
				num_group = num_rawData / 10;
			} while(num_rawData > 99 || num_rawData < 0);
			arr_histogram[num_group]++;
		}
		
		System.out.println("\n■■■■■■■■■■■■ PRINT OUT AS MANY AS YOUR INPUT ■■■■■■■■■■■■");
		for (int i = 0; i < arr_histogram.length; i++) {
			System.out.printf("%18d ~ %2d : %s\n", (i * 10), (i * 10 + 9), printOutAsManyAs(arr_histogram[i], '*'));
		}
		
		in.close();
	}
	
	
	
	public static String printOutAsManyAs(int leng, char crtl) {
		String str_result = "";
		for (int i = 0; i < leng; i++){
			str_result += crtl;
		}
		return str_result;
	}
}