package test.mypac;

public class Messenger {
	//String type �� ���ڷ� ���޹޴� static �޼ҵ�
	public static void sendMessage(String msg) {
		System.out.println(msg+" �� ���� �մϴ�.");
	}
	//String type �� �������ִ� static �޼ҵ�
	public static String getMessage() {
		return "hello";
	}
	//Car type �� ���ڷ� ���� �޴� static �޼ҵ�
	public static void useCar(Car c) {
		c.drive();
	}
}
