package test.mypac;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class MainClass02 {
	public static void main(String[] args) {
		//1byte ó�� ��Ʈ��
		InputStream is = System.in;
		//2byte ó�� ��Ʈ��
		InputStreamReader isr = new InputStreamReader(is);
		
		System.out.println("�Է�:");
		try {
			//�Է��� Ű�� �ڵ尪 �о����
			int code = isr.read();
			System.out.println("code:"+code);
			//�ڵ尪�� �����Ǵ� ���� ������
			char ch=(char)code;
			System.out.println("char:"+ch);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
