/*
■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■
Path : 
	Chapter 05. 문자열, 배열, 열거 타입
	프로그래밍 문제 07. 배열 비교
Description : 
	01. 2개의 1차원 배열 내용 비교
■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■
*/
package ch05;

public class _05_Programming07_compareWithinArr {

	public static void main(String[] args) {
		
		int[] a = {3,2,4,1,5};
		int[] b = {3,2,4,1};
		int[] c = {3,2,4,1,5};
		int[] d = {2,7,1,8,2};
		
		System.out.printf(" a vs b : %b\n", compareWithinArr(a, b));
		System.out.printf(" a vs c : %b\n", compareWithinArr(a, c));
		System.out.printf(" a vs d : %b\n", compareWithinArr(a, d));
		System.out.printf(" b vs c : %b\n", compareWithinArr(b, c));
		System.out.printf(" b vs d : %b\n", compareWithinArr(b, d));
		System.out.printf(" c vs d : %b\n", compareWithinArr(c, d));
		
	}
	
	public static boolean compareWithinArr(int[] a, int[] b) {
		int num_size = 0;
		boolean bln_isSame = true;
		
		if (a.length != b.length) {
			bln_isSame = false;
		} else {
			num_size = a.length;
			for (int i = 0; i < num_size; i++) {
				if (a[i] != b[i]) {
					bln_isSame = false;
					break;
				}
			}
		}
		
		return bln_isSame;
	}
	
}