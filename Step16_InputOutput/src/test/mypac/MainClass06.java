package test.mypac;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintStream;

public class MainClass06 {
	public static void main(String[] args) {
		PrintStream ps=System.out;
		//�н��� ���ؼ� PrintStream ��ü�� �θ� type OutputStream ���� �޾ƺ���
		//OutputStream �� 1byte ó�� ��Ʈ���̴�.
		OutputStream os = ps;
		
		// 2byte ó�� ��Ʈ��
		OutputStreamWriter osw=new OutputStreamWriter(os);
		
		BufferedWriter bw=new BufferedWriter(osw);
		try {
			bw.write("�ϳ�");
			bw.write("\n");
			bw.write("��");
			bw.newLine();
			bw.write("����");
			bw.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
