/*
■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■
Path : 
	Chapter 05. 문자열, 배열, 열거타입
	01. 배열
Description : 
	01. 동적 배열
■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■
*/
package ch05;

import java.util.ArrayList;
import java.util.Scanner;

public class _05_02_05_ArrayListDemo {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		ArrayList<Integer> scores = new ArrayList<>();
		int data;
		int sum = 0;
		
		do {
			System.out.print("score : ");
			data = in.nextInt();
			if(data >= 0) {
				scores.add(data);
			}
		} while(data >= 0);
		
		
		for (int i = 0; i < scores.size(); i++) {
			sum += scores.get(i);
		}
		
		System.out.println("평균 : " + (double)sum / scores.size());
		in.close();
	}
}