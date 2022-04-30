package test.main;

import test.mypac.Messenger;
import test.mypac.Car;

public class MainClass02 {

	public static void main(String[] args) {
		//Messenger 클래스에 만든 static 메소드 3개를 호출하는 code 를 작성해 보세요
		Messenger.sendMessage("메세지");
		System.out.println(Messenger.getMessage());
		Car car1 = new Car();
		car1.name="붕붕";
		Messenger.useCar(car1);
		
		
	}

}
