/*
■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■
Path : 
	Chapter 05. 문자열, 배열, 열거타입
	01. 배열
Description : 
	01. 다차원 배열
■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■
*/
package ch05;

public class _05_02_04_Array2Demo {

	public static void main(String[] args) {
		
		double[][] interests = {
				{3.2, 3.1, 3.2, 3.0},
				{2.9, 2.8, 2.7, 2.6},
				{2.7, 2.6, 2.5, 2.7}
		};
		double[] sum = new double[3];
		double total = 0;
		
		for (int i = 0; i < interests.length; i++) {
			for (int j = 0; j < interests[i].length; j++) {
				sum[i] += interests[i][j]/interests[i].length;
			}
			System.out.println(i+"차년도 평균 이자율 : " + Math.round(sum[i]*100)/100.0);
			total += sum[i]/interests.length;
		}
		
		System.out.println(sum.length+"년간 평균 이자율 : "+Math.round(total*100)/100.0);
	}
}