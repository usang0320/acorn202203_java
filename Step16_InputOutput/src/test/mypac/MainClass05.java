package test.mypac;

import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintStream;

public class MainClass05 {
	public static void main(String[] args) {
		PrintStream ps=System.out;
		//�н��� ���ؼ� PrintStream ��ü�� �θ� type OutputStream ���� �޾ƺ���
		//OutputStream �� 1byte ó�� ��Ʈ���̴�.
		OutputStream os = ps;
		// 2byte ó�� ��Ʈ��
		OutputStreamWriter osw=new OutputStreamWriter(os);
		try {
			osw.write(48148);
			osw.write(48372);
			osw.write(46308);
			osw.write("\n�ƴϾ�");
			osw.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
