/*
■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■
Path : 
	Chapter 06. 상속
	프로그래밍 문제 03. 상속 생성자
Description : 
	01. specification
		class           Point                         MovablePoint
		field           private int x, y              private int xSpeed, ySpeed
		method          getter(),setter(),toString() ~~~~~~~~~~~~~~~~~~~~~~~~~~~~
		Constructor     Point(x,y)                    MovalblePoint(int x, int y, int xSpeed, int ySpeed)
■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■
*/
package ch06;


public class _06_Programming03_PointTest {

	public static void main(String[] args) {
		Point p = new Point(10, 20);
		MovablePoint m = new MovablePoint(30, 40, 60, 70);
		System.out.println(p);
		System.out.println(m);
	}
}

class Point {
	private int x, y;

	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public String toString() {
		return "x : " + x + ", y : " + y;
	}
}

class MovablePoint extends Point {
	private int xSpeed, ySpeed;

	public int getxSpeed() {
		return xSpeed;
	}

	public int getySpeed() {
		return ySpeed;
	}
	
	public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
		super(x, y);
		this.xSpeed = xSpeed;
		this.ySpeed = ySpeed;
	}
	
	@Override
	public String toString() {
		return super.toString() + ", xspeed : " + xSpeed + ", yspeed : "+ySpeed;
	}
}