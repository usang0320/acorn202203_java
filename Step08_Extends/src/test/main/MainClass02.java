package test.main;

import test.mypac.HandPhone;
import test.mypac.Phone;

/*
 *  ���������� �ʵ�տ� �����ϴ� data type �� (���������� type)
 *  �� �ȿ� ����ִ� �������� ��� ���� ��� �����ϸ� �ȴ�.
 *  
 *  �׷��� ������ �� ���������� �ʵ忡 . �� ������ ��� ������ ��õ� ��ɸ� ��� �� �� �ִ�.
 *  
 *  java �� ��� ��ü�� �������� ���� �� �ִ�.
 *  
 *  �������� type �� ��������� �ǹ��̴�.
 */
public class MainClass02 {
	public static void main(String[] args) {
		HandPhone p1=new HandPhone();
		//� ��ü�� �������� �θ� type ���� ���� �� �ִ�.
		Phone p2 = new HandPhone();	//������ �����̶� ���ο� ����� ������� ���Ѵٰ� ��������.
		Object p3 = new HandPhone();
		
		p1.takePicture();
		p2.call();
		
		p1.name="������11"; //HandPhone �̶� Ʋ�� p1�̶� �ڵ����� �����, �� �� �̸��� ������11�̶� �ϰڴ�
		
		
		
	}
}
