package test.main;

import test.mypac.MyUtil;

public class MainClass02 {
	
	public String myName="�豸��";	//�ʵ�
	
	public static void test() {	//�޼ҵ�
		System.out.println("test() ȣ���");
	}

	public static void main(String[] args) {
		MainClass02 mn = new MainClass02();
		MyUtil.send();
		MyUtil.version="1.0";
		mn.myName="������";
		System.out.println(mn.myName);
		test();	//���� Ŭ�������� �ִ� static ������ �ٷ� ȣ�� ���� 
	}

}
