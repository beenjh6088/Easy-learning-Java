/*
■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■
Path : 
	Chapter 04. 객체 지향
	프로그래밍 문제 04. Car
Description : 
	01.생산된 모든 자동차와 빨간색 자동차의 개수를 출력하는 Car 클래스를 작성하시오. 그리고 다음 코드를 사용해 테스트하시오.
■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■
*/
package ch04;



class Car {
	static private int numOfCar = 0;
	static private int numOfRedCar = 0;
	@SuppressWarnings("unused")
	private String Color;
	
	Car(String color) {
		this.Color = color;
		numOfCar++;
		if("red".equalsIgnoreCase(color)){
			numOfRedCar++;
		}
	}
	
	static int getNumOfCar() {
		return numOfCar;
	}
	
	static int getNumOfRedCar() {
		return numOfRedCar;
	}
}



public class _04_Programming04_CarTest {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Car c1 = new Car("red");
		Car c2 = new Car("blue");
		Car c3 = new Car("RED");
		
		System.out.printf("자동차 수 : %d, 빨간색 자동차 수 : %d", Car.getNumOfCar(), Car.getNumOfRedCar());
	}
}
