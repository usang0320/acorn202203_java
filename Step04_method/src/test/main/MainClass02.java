package test.main;

import test.mypac.Messenger;
import test.mypac.Car;

public class MainClass02 {

	public static void main(String[] args) {
		//Messenger Ŭ������ ���� static �޼ҵ� 3���� ȣ���ϴ� code �� �ۼ��� ������
		Messenger.sendMessage("�޼���");
		System.out.println(Messenger.getMessage());
		Car car1 = new Car();
		car1.name="�غ�";
		Messenger.useCar(car1);
		
		
	}

}
