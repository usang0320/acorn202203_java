package test.main;

import test.auto.CampingCar;
import test.auto.Car;
import test.auto.Engine;
import test.auto.SuperCar;

public class MainClass07 {
	public static void main(String[] args) {
		
		Car car=new Car(new Engine());
		
		Car car3= new Car(null);
		car3.drive();	//Engine 인자를 넣어주지 않아 메소드가 중간에 멈춤
		
		CampingCar car1 = new CampingCar(new Engine());	// Car 을 상속 받았기 때문에 생성자를 super로 호출함
		car1.drive();
		car1.sleepInCar();
		
		Engine nice=new Engine();
		SuperCar mycar=new SuperCar(nice);
		mycar.autoDrive();
	}
}
