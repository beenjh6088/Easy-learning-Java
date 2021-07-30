/*
■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■
Path : 
	Chapter 04. 객체 지향
	프로그래밍 문제 06. Complex
Description : 
	01. Complex
■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■
*/
package ch04;



class Complex {
	private double a;
	private double b;
	
	public Complex(double a) {
		this.a = a;
	}
	
	public Complex(double a, double b) {
		this(a);
		this.b = b;
	}

	public void print() {
		System.out.printf("%.1f + %.1fi\n", a, b);
	}
}


public class _04_Programming06_ComplexTest {

	public static void main(String[] args) {
		Complex c1 = new Complex(2.0);
		c1.print();
		Complex c2 = new Complex(1.5, 2.5);
		c2.print();
	}
}
