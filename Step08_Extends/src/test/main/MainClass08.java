package test.main;

import test.auto.Engine;
import test.auto.SuperCar;

public class MainClass08 {
	public static void main(String[] args) {
		SuperCar car1 = new SuperCar(new Engine());
		car1.drive();
		
	}
}
