package test.main;

public class MainClass10 {
	public static void main(String[] args) {
		//Ư�� ���ǿ��� ����Ǵ� �ݺ���
		int count = 0;
		//��Ȯ�� �ݺ� Ƚ���� �� �� ���� �� ����� �� �ִ� �ݺ���
		while(true) {
			count++;
			System.out.println("�ݺ�Ƚ��:"+count);	
			if(count==1000) {
				break;
			}
		}
	}
}
