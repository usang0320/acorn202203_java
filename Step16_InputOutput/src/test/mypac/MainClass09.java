package test.mypac;

import java.io.File;
import java.io.IOException;

public class MainClass09 {
	public static void main(String[] args) {
		//�̹� �����ϰų� Ȥ�� ���� ������ ������ ������ �� �ִ� File ��ü����
		File f1 = new File("c:/acorn202203/myFolder/gura.txt");
				
		try {
			//���� �ش� ������ �������� ������
			if(!f1.exists()) {
				f1.createNewFile();
				System.out.println("gura.txt ������ ��������ϴ�.");
			}else {
				f1.delete();
				System.out.println("gura.txt ������ ���� �߽��ϴ�.");
			}
		}catch(IOException ie) {
			ie.printStackTrace();
		}
	}
}
