/*
■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■
Path : 
	Chapter 07. 인터페이스와 특수 클래스 
	프로그래밍 문제 05. 인터페이스
Description : 
	01. 
■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■
*/
package ch07;

public class _07_Programming05_ControllerTest {

	public static void main(String[] args) {
		Controller[] c = { new TV01(false), new Radio(true) };
		
		for (Controller controller : c) {
			controller.show();
		}
	}
}

abstract class Controller {
	boolean power;
	public Controller() {}
	public Controller(boolean power) {
		this.power = power;
	}
	void show() {
		if (power == true) {
			System.out.printf("%10s : ■■■■■■■\n", getName());
		} else {
			System.out.printf("%10s : □□□□□□□\n", getName());
		}
	};
	abstract String getName();
}

class TV01 extends Controller {
	public TV01(boolean power) {
		super(power);
	}
	public String getName() {
		return "TV";
	}
}

class Radio extends Controller {
	public Radio(boolean power) {
		this.power = power;
	}
	public String getName() {
		return "Radio";
	}
}