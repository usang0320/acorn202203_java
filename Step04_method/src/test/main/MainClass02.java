package test.main;

import test.mypac.Messenger;
import test.mypac.Car;

public class MainClass02 {

	public static void main(String[] args) {
		//Messenger Ŭ������ ���� static �޼ҵ� 3���� ȣ���ϴ� code �� �ۼ��� ������
		Messenger.sendMessage("�޼���");
		Messenger.getMessage();
		Messenger.useCar(new Car());
		
		
	}

}
