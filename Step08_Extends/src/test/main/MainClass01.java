package test.main;

import test.mypac.HandPhone;
import test.mypac.Phone;
/*
 *  Phone Ŭ������ ��ӹ��� HandPhone Ŭ������ ��ü�� �����ϸ�
 *  
 *  Phone ��ü�� �̸� ��������� HandPhone ��ü�� ���������.
 *  
 *  �׸��� �� �ΰ��� ��ü�� ������ heap ������ ����ż� ������ ���������� ������ �ȴ�.
 */
public class MainClass01 {
	public static void main(String[] args) {
		HandPhone p1 = new HandPhone();
		p1.call();	// �θ�κ��� ��� ���� ����� ����� �� �ִ�.
		p1.mobileCall();
		p1.takePicture();
		
		Phone p2 = p1;
		p2.call();
		// �θ�� �ڽ��� ����� ��� �� �� ����.
	}
}
