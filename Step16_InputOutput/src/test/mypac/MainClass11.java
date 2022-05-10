package test.mypac;

import java.io.File;
import java.io.FileWriter;

public class MainClass11 {
	public static void main(String[] args) {
		//���ڿ��� ������ ������ ����� ���� File ��ü
		File memoFile = new File("c:/acorn202203/myFolder/memo.txt");
		try {
			//������ �������� ������
			if(!memoFile.exists()) {
				//������ �����
				memoFile.createNewFile();
			}
			//memo.txt �� ���ڿ��� ����� �� �ִ� ��ü ����
			FileWriter fw = new FileWriter(memoFile);
			fw.write("�豸��");
			fw.write("\n");	//�����ȣ
			fw.write("\t�ذ�");	// \t�� tab �鿩���� �̴�.
			fw.write("\n");
			fw.write("������");
			fw.flush();
			fw.close();
			System.out.println("���Ͽ� ���ڿ��� �����߽��ϴ�.");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
