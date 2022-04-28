package test.mypac;
/*
 * [�޼ҵ带 ���� �� ����ؾ� �ϴ� ��]
 * 
 * 1. ���� ������
 * 2. static or non static
 * 3. ���� type
 * 4. �޼ҵ��
 * 5. �޼ҵ忡 �����ϴ� ������ ������ ������ type
 */
public class MyObject {
	/*
	 * public => �� �޼ҵ�� ��𿡼��� ���� �����ϴ�
	 * void => �� �޼ҵ�� � ���� �������� �ʴ´�.
	 * walk => �޼ҵ��
	 * walk() => �� �޼ҵ�� ����� ���ڷ� ���� ���� �ʴ´�.
	 */
	public void walk() {
		System.out.println("������ �ɾ��");
	}
	// int type �� �������ִ� �޼ҵ�
	public int getNumber() {
		return 10;
	}
	//String type �� �������ִ� �޼ҵ�
	public String getGreeting() {
		return "�ȳ��ϼ���";
	}
	//Car type ��  �������ִ� �޼ҵ�
	public Car getCar() {
		return new Car();
	}
	// int type �� �޼ҵ��� ���ڷ� ���� �޴� �޼ҵ�
	public void setNum(int num) {
		System.out.println("num:"+num);
	}
	// String type �� �޼ҵ��� ���ڷ� ���� �޴� �޼ҵ�
	public void setName(String name) {
		System.out.println("name:"+name);
	}
	// Car type �� �޼ҵ��� ���ڷ� ���� �޴� �޼ҵ�
	public void useCar(Car car) {
		car.drive();
	}
	
	//Radio type �� Speaker type �� ���޹޴� �޼ҵ�
	public void  listenMusic(Radio r, Speaker s) {
		System.out.println("������ ����");
	}
}
