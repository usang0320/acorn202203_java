package test.mypac;

import java.io.IOException;
import java.io.InputStream;

public class MainClass01 {
	public static void main(String[] args) {
		//Ű����� ����� InputStream type �� �������� kbd ��� ���������� ���
		//InputStream ��ü�� 1byte ���� ó�� ��Ʈ���̴�.
		//������ ��ҹ���, ����, Ư�����ڸ� ó���� �� �ִ�.
		//�ѱ� ó�� �Ұ�
		InputStream kbd = System.in;
		System.out.println("�Է�:");
		try {
			//�Է��� Ű�� �ڵ尪 �о����
			int code = kbd.read();
			System.out.println("code:"+code);
			//�ڵ尪�� �����Ǵ� ���� ����
			char ch=(char)code;
			System.out.println("char:"+ch);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
