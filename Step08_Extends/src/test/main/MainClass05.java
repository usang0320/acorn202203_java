package test.main;

import test.mypac.HandPhone;
import test.mypac.SmartPhone;

public class MainClass05 {
	public static void main(String[] args) {
		
		// �ڽĿ��� ���� �Ϲ� �ڵ���(���ͳ��� �ȵ�)
		HandPhone p1 =new HandPhone();
		
		// ������ ���ο� ������ ��� �Դ�. ������ ���� ����Ʈ��?
		SmartPhone p2 = (SmartPhone)p1;	//HandPhone �� ������ �ٲ۰Ŷ� �ȵ�
										//ClassCastException �߻�! �������� ��ü�� ���� type �� Ȯ��
		//���� ¯¯
		p2.doInternet();
	}
}
