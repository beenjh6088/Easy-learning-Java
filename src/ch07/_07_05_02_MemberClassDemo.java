/*
■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■
Path : 
	Chapter 07. 인터페이스와 특수 클래스
	05. 중첩 클래스와 중첩 인터페이스
Description : 
	05_01. 중첩 클래스와 중첩 인터페이스의 개념과 종류
		                                      ___ Static Member Class
		                 ___ Member Class ___|
		                |                    |___ Instance Member Class
		Nested Class ---|
		                |___ Local Class
		                
  05_02. 중첩 클래스와 중첩 인터페이스 사용
  	class OuterClass {
  		class MemberClass {
  		}
  		
  		interface NestedInterface {
  		}
  	}
  	
  	class OuterClass {
  		void method() {
  			class LocalClass {
  			}
  		}
  	}
■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■
*/
package ch07;

public class _07_05_02_MemberClassDemo {

	private String secret = "비공개";
	String s = "외부";
	
	class MemberClass {
		String s = "내부";
		
		public void show1() {
			System.out.println("내부 클래스");
			System.out.println(secret);
			System.out.println(s); // 내부 클래스의 s
			System.out.println(_07_05_02_MemberClassDemo.this.s); // 외부 클래스의 s
			
			// 내부 클래스 내부에 정적 변수나 메서드 작성 불가
			// static String ss = "정적 멤버 필드"; 
			// static void show2();
		}
	}
	public static void main(String[] args) {
		_07_05_02_MemberClassDemo m = new _07_05_02_MemberClassDemo();
		_07_05_02_MemberClassDemo.MemberClass m1 = m.new MemberClass(); // 내부 클래스 생성
		
		System.out.println(m1.s);
		m1.show1();
	}

}
