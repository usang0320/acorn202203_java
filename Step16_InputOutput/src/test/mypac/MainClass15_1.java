package test.mypac;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

public class MainClass15_1 {
	public static void main(String[] args) {
		//�ʿ��� �������� ���� ���������� �̸� �����.
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		try {
			fis=new FileInputStream("c:/acorn202203/myFolder/1.jpg");
			fos=new FileOutputStream("c:/acorn202203/myFolder/copied3.jpg");
			//�о int ���� �״�� ����ϸ� ��
			while(true) {
				int data=fis.read();
				if(data==-1) {
					break;
				}
				fos.write(data);
				fos.flush();
			}
			System.out.println("�۾�����!");
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(fos!=null)fos.close();
				if(fis!=null)fis.close();
			}catch	(Exception e) {
				
			}
		}
	}
}
