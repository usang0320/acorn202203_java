package test.main;

import test.mypac.HandPhone;
import test.mypac.Phone;
import test.mypac.SmartPhone;

public class MainClass04 {
	public static void main(String[] args) {
		//SmartPhone ��ü�� �����ؼ� Phone type p1 �̶�� ���������� ��� ������.
		Phone p1 = new SmartPhone();
		//p1 �� ����ִ� �������� �̿��ؼ� ��ȭ�� �ɰ� �ʹٸ�?
		p1.call();
		//p1 �� ����ִ� �������� �̿��ؼ� �̵��߿� ��ȭ�� �ɰ� �ʹٸ�?
		HandPhone p2 = (HandPhone)p1;
		p2.mobileCall();
		
		boolean result= p1 ==p2;
		System.out.println(result);
		
		//p1 �� ����ִ� �������� �̿��ؼ� ���ͳ��� �ϰ� �ʹٸ�?
		SmartPhone p3 = (SmartPhone)p1;
		p3.doInternet();
		
	}
}	
