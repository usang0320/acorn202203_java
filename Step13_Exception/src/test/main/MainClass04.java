package test.main;

import java.io.File;
import java.io.IOException;

public class MainClass04 {
	public static void main(String[] args) {
		File f=new File("c:/acorn202203/myFolder/memo.txt");
		try {
			f.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		//���� ��ο� ������ ������ ����� �ִ� File ��ü�� �޼ҵ带 ã�Ƽ� �����ϰ�
		//������ ������ ����������� Ȯ���غ�����.
		
		System.out.println("main �޼ҵ尡 ���� ���� �˴ϴ�.");
	}
}
