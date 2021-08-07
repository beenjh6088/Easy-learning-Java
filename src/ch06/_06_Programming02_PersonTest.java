/*
■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■
Path : 
	Chapter 06. 상속
	프로그래밍 문제 01. 상속 테스트
Description : 
	01. specification
		class           Person                 Student                 ForeignStudent
		field           name, age              studentNum              nationality
		method          getter(), setter(), show() ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
		Constructor     constructor ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■
*/
package ch06;


public class _06_Programming02_PersonTest {

	public static void main(String[] args) {
		Person01[] people = {
			new Person01("길동이", 22),
			new Student01("황진이", 23, "100"),
			new ForeignStudent01("Amy", 30, "200", "USA")
		};
		for (Person01 p : people) {
			p.show();
		}
	}
}


class Person01 {
	String name;
	int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Person01(String name, int age) {
		this.name = name;
		this.age = age;
	}
	void show() {
		System.out.printf("사람[이름 : %s, 나이 : %d]\n", name, age);
	}
}

class Student01 extends Person01 {
	String studentNum;
	public Student01(String name, int age, String studentNum) {
		super(name, age);
		this.studentNum = studentNum;
	}
	public String getStudentNum() {
		return studentNum;
	}
	public void setStudentNum(String studentNum) {
		this.studentNum = studentNum;
	}
	@Override
	void show() {
		System.out.printf("학생[이름 : %s, 나이 : %d, 학번 : %s]\n", name, age, studentNum);
	}
}

class ForeignStudent01 extends Student01 {
	String nationality;
	public ForeignStudent01(String name, int age, String studentNum, String nationality) {
		super(name, age, studentNum);
		this.nationality = nationality;
	}
	public String getNationality() {
		return nationality;
	}
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	@Override
	void show() {
		System.out.printf("외국학생[이름 : %s, 나이 : %d, 학번 : %s, 국적 : %s]\n", name, age, studentNum, nationality);
	}
}