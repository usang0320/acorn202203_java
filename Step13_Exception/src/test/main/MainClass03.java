package test.main;

public class MainClass03 {
	public static void main(String[] args) {
		System.out.println("main �޼ҵ尡 ���� �Ǿ����ϴ�.");
		
		try {
			//�����带 5�ʵ��� ��Ƴ���
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		
		System.out.println("main �޼ҵ尡 ���� �Ǿ����ϴ�.");
	}
}
