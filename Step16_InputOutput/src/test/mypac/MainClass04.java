package test.mypac;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;

public class MainClass04 {
	public static void main(String[] args) {
		PrintStream ps=System.out;
		//�н��� ���ؼ� PrintStream ��ü�� �θ� type OutputStream ���� �޾ƺ���
		//OutputStream �� 1byte ó�� ��Ʈ���̴�.
		OutputStream os = ps;
		
		try {
			os.write(97);
			os.write(98);
			os.write(99);			
			os.flush();	//����
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
