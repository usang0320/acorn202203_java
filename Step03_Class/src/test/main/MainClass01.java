package test.main;

import test.mypac.Car;

public class MainClass01 {

	public static void main(String[] args) {
		Car car1=new Car();	//car1 �� ��������
		car1.name="BMW 530i";
		car1.drive();
		car1.stop();
		
		Car car2=new Car();
		car2.name="���������";
		car2.drive();
		car2.stop();
	}

}
