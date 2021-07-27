/*
■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■
Path : 
	Chapter 04. 객체 지향
	도전과제 01. 프린터 모델링
Description : 
	01. 프린터의 상태와 동작을 클래스로 작성하고 테스트하기
		01] Printer 객체를 생성한다.
		02] 프린터에 용지 100장을 추가한다.
		03] 프린터로 70장을 출력한다.
		04] 프린터에 남아 있는 용지를 조사한다.
	02. 프린터 테스트 개선
		01] numOfPapers 필드를 private로 지정하고, 초기화하는 생성자를 추가한다.
		02] print() 기능 추가
			01} 출력할 떄 남아있는 용지가 없다면 용지가 없다고 알려준다.
			02} 남아 있는 용지보다 많은 출력을 요구하면 남아 있는 용지만큼 출력하고, 부족한 용지 매수를 알려준다.
			03} 출려한 후 남아 있는 용지 매수를 알려준다.
	03. 양면 출력이 가능한 Printer 클래스로 수정하되 접근자와 설정자도 추가하기
		01] 양면 출력 여부를 나타내는 필드는 private으로 선언하고, 이 필드를 초기화하는 생성자와 외부에서 이 필드를 사용할 수 있도록 접근자와 설정자를 추가한다.
		02] print() 메서드를 양면 여부에 따라 출력할 수 있도록 수정한다.
■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■
*/
package ch04;



class Printer {
	private int numOfPapers = 0;
	private boolean duplex;
	
	public Printer(int numOfPapers, boolean duplex) {
		this.numOfPapers = numOfPapers;
		this.duplex = duplex;
	}
	
	public void print(int amount) {
		if (this.numOfPapers <= 0) {
			System.out.println("용지가 없습니다.");
		} else {
			if (this.numOfPapers < amount) {
				System.out.println((duplex == true ? "양면으로 " : "단면으로 " ) + "모두 출력하려면 용지가 "+ (amount - numOfPapers) + "매 부족합니다. " + numOfPapers + "장만 출력합니다.");
				this.numOfPapers = 0;
			} else {
				System.out.println((duplex == true ? "양면으로 " : "단면으로 " ) + amount + "장 출력했습니다. 현재 " + numOfPapers + "장 남아 있습니다.");
				this.numOfPapers -= amount;
			}
		}
	}
	
	public boolean getDuplex() {
		return this.duplex;
	}
	
	public void setDuplex(boolean duplex) {
		this.duplex = duplex;
	}
}



public class _Challenge01_PrinterTest {
	
	public static void main(String[] args) {
		Printer p = new Printer(20, true);
		p.print(25);
		p.setDuplex(false);
		p.print(10);
	}
}