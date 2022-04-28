package test.main;

import test.mypac.Drill;

public class MainClass06 {
	public static void main(String[] args) {
		
		useDrill(new Drill() {
			@Override
			public void hole() {
				System.out.println("�ٴڿ��� ������ �վ��!");
			}
		});
		
		useDrill(()->{
			System.out.println("õ�忡 ������ �վ��!");
		});	//�߻�޼ҵ尡 1���� �� ����
	}
	//1���� �߻�޼ҵ�� �����Ǿ� �ִ� Drill ��ü�� ���ڷ� ���޹޴� �޼ҵ�
	public static void useDrill(Drill d) {
		d.hole();
	}
}
