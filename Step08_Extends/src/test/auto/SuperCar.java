package test.auto;

public class SuperCar extends Car{

	public SuperCar(Engine engine) {
		super(engine);	//�θ��� ������ ȣ��
	}
	
	public void autoDrive() {
		System.out.println("�������� ���Դϴ�.");
	}
	
	@Override
	public void drive() {
		/*
		 * ������(�������̵�) �� �θ� �޼ҵ带 ȣ���ؾ� ���� ������
		 * ��Ȳ�� ���� �ٸ���.
		 * � ��쿡�� �θ��� �޼ҵ带 ȣ���� ���� ������ ��ü��
		 * ����� ������ ���ϴ� ��찡 �ִ�.
		 * �׷� ��쿡�� �θ��� �޼ҵ带 �ݵ�� ȣ���� �־�� �Ѵ�.
		 */
		super.drive();	//�θ��� �޼ҵ����� ����ڴ�.
		System.out.println("���� �� ������ �ٿ��� ��û ������ �޷���");
	}

}
