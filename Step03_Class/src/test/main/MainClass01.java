package test.main;

import test.mypac.Car;

public class MainClass01 {

	public static void main(String[] args) {
		Car car1=new Car();	//car1 은 지역변수
		car1.name="BMW 530i";	// name은 필드
		car1.drive();	//drive() 는 함수
		car1.stop();
		
		Car car2=new Car();
		car2.name="람보르기니";
		car2.drive();
		car2.stop();
	}

}
