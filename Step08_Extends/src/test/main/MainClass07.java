package test.main;

import test.auto.CampingCar;
import test.auto.Car;
import test.auto.Engine;
import test.auto.SuperCar;

public class MainClass07 {
	public static void main(String[] args) {
		
		Car car=new Car(new Engine());
		
		Car car3= new Car(null);
		car3.drive();	//Engine ���ڸ� �־����� �ʾ� �޼ҵ尡 �߰��� ����
		
		CampingCar car1 = new CampingCar(new Engine());	// Car �� ��� �޾ұ� ������ �����ڸ� super�� ȣ����
		car1.drive();
		car1.sleepInCar();
		
		Engine nice=new Engine();
		SuperCar mycar=new SuperCar(nice);
		mycar.autoDrive();
	}
}
