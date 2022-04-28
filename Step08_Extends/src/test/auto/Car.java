package test.auto;
/*
 * ���������� ���ٹ���
 * 
 * public : ��𿡼��� ���ٰ���
 * protected : ������ package Ȥ�� ��Ӱ����� �ڽĿ��� ���ٰ���
 * default : ������ package �ȿ����� ���ٰ���
 * private : ������ Ŭ���� Ȥ�� ������ ��ü �ȿ����� ���ٰ���
 * 
 * -���� �����ڸ� ���̴� ��ġ
 * 
 * 1. Ŭ������ ������ ��
 * 2. ������
 * 3. �ʵ�
 * 4. �޼ҵ�
 * 
 * Ŭ������ default �� public �ΰ����� ���� �����ڸ� ���� �����ϴ�
 * ���� �����ڸ� �����Ѱ��� default ���� �����ڴ�
 */
public class Car {
	//�ʵ�
	protected Engine engine;	//protected �� ���� ��Ű�� �������� ���ٰ���
	
	//Engine ��ü�� ���ڷ� ���� �޴� ������
	public Car(Engine a) {	//Car class�� ��ü ���� �� �� Engine���ڸ� �� �־���� ��
		this.engine= a;
	}
	
	//�޼ҵ�
	public void drive() {
		if(this.engine==null) {
			System.out.println("Engine ��ü�� ��� �޸� ���� �����");
			return; //�޼ҵ� ������
		}
		System.out.println("�޷���~");
	}
}
