/*
■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■
Path : 
	Chapter 05. 문자열, 배열, 열거 타입
	프로그래밍 문제 08. 열거 타입
Description : 
	01. 
■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■
*/
package ch05;

import java.util.Scanner;

public class _05_Programming08_day {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		String str_day = "";
		
		do {
			System.out.print("Input Day : ");
			str_day = in.nextLine().toUpperCase();
			for (Day day : Day.values()) {
				if (day.code.equals(str_day)) {
					System.out.println(Day.valueOf(str_day));
				}
			}
		} while(!str_day.equalsIgnoreCase("q"));
		System.out.println("END");
		in.close();
	}
	
	enum Day {
		MONDAY("월요일"),
		TUESDAY("화요일"),
		WEDNESDAY("수요일"),
		THURSDAY("목요일"),
		FRIDAY("금요일"),
		SATURDAY("토요일"),
		SUNDAY("일요일");
		String code;
		String name;
		String desc;
		
		private Day(String name) {
			this.name = name;
			switch(name) {
			case "월요일" :
				code = "MONDAY";
				desc = "싫다"; break;
			case "화요일" :
				code = "TUESDAY";
				desc = "아직 힘들다"; break;
			case "수요일" :
				code = "WEDNESDAY";
				desc = "드디어 절반"; break;
			case "목요일" :
				code = "THURSDAY";
				desc = "내일 불금임"; break;
			case "금요일" :
				code = "FRIDAY";
				desc = "아자 불금임"; break;
			case "토요일" :
				code = "SATURDAY";
				desc = "마냥 좋음"; break;
			case "일요일" :
				code = "SUNDAY";
				desc = "뭔가 아쉬움"; break;
			}
		}
		
		public String toString() {
			return name + " " + desc;
		}
	}
	
}
