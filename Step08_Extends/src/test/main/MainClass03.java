package test.main;

import test.mypac.HandPhone;
import test.mypac.Phone;

public class MainClass03 {
	public static void main(String[] args) {
		//HandPhone ��ü�� �����ؼ� �� �������� p1 �̶�� �̸��� HandPhone type ���������� �����ϱ�
		HandPhone p1 = new HandPhone();
		
		//p1 �ȿ� �ִ� �������� p2 ��� Phone type ���������� �����ϱ�
		Phone p2 = p1;
		
		//p1 �ȿ� �ִ� �������� p3 ��� Object type ���� ������ �����ϱ�
		Object p3 = p1;
		
		//�ڽ� ��ü�� �������� �θ� type ������ �ʵ忡 �ڿ������� ����.
		
		Object a= 10;
		
	
	}
}
