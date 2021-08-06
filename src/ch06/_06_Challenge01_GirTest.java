/*
■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■
Path : 
	Chapter 06. 상속
	도전과제 01. 타입 변환과 동적 바인딩
Description : 
	01. 타입 변환과 동적 바인딩
	02. 
■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■
*/
package ch06;

public class _06_Challenge01_GirTest {
	
	public static void main(String[] args) {
//		Girl g1 = new Girl();
//		Girl g2 = new Girl();
//		GoodGirl gg = new BestGirl();
//		
//		g2.show(); // Girl class에 show()가 없을 떄 참조변수가 부모 타입인데 자식타입의 메서드를 쓰려고해서 컴파일 에러
//		gg.show(); // 동적 바인딩
		
		
		
		Girl[] girls = {
				new Girl("갑순이"),
				new GoodGirl("콩쥐"),
				new BestGirl("황진이")
		};
		for (Girl g : girls) {
			g.show();
		}
	}
}


class Girl {
	protected String name;
	void show() {
		System.out.println(name + " 자바 초보자이다.");
	}
	Girl(String name) {
		this.name = name;
	}
}

class GoodGirl extends Girl {
	public GoodGirl(String name) {
		super(name);
	}
	void show() {
		System.out.println("그녀는 자바를 잘 안다.");
	}
}

class BestGirl extends GoodGirl {
	public BestGirl(String name) {
		super(name);
	}
	@Override
	void show() {
		System.out.println("그녀는 자바를 무지하게 잘 안다.");
	}
}