package test.mypac;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class MainClass03 {
	public static void main(String[] args) {
		//1byte ó�� ��Ʈ��
		InputStream is = System.in;
		//2byte ó�� ��Ʈ��
		InputStreamReader isr = new InputStreamReader(is);
		//���ڿ� 1�پ� �Է� ���� �� �ִ� ��ü
		BufferedReader br = new BufferedReader(isr);
		System.out.println("���ڿ� �Է�:");
		try {
			String line = br.readLine();
			System.out.println("line:"+line);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
