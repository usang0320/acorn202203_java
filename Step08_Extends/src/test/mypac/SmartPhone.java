package test.mypac;

public class SmartPhone extends HandPhone{
	//������
	public SmartPhone() {
		System.out.println("SmartPhone ������ ȣ���");
	}
	
	//�޼ҵ�
	public void doInternet() {
		System.out.println("���ͳ��� �ؿ�");
	}
	
	//�θ��� �޼ҵ� ������(Override)
	@Override	//������ ��������. ǥ�ÿ���
	public void takePicture() {
		System.out.println("100�� ȭ���� ��ȭ�� ������ ����!");
	}
	
}
