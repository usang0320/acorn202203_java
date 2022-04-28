package test.main;

import test.mypac.Messenger;
import test.mypac.Car;

public class MainClass02 {

	public static void main(String[] args) {
		//Messenger 클래스에 만든 static 메소드 3개를 호출하는 code 를 작성해 보세요
		Messenger.sendMessage("메세지");
		Messenger.getMessage();
		Messenger.useCar(new Car());
		
		
	}

}
