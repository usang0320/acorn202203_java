package test.mypac;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class MainClass14 {
	public static void main(String[] args) {
		File memoFile = new File("c:/acorn202203/myFolder/memo.txt");
		//�ʿ��� ��ü�� �������� ���� ���������� �̸� �����.
		FileReader fr=null;
		BufferedReader br = null;
		try {
			//���Ͽ��� ���ڿ��� �о���� ��ü�� �������� �򤷾�� �̸� ������ ���������� ��´�.
			fr =new FileReader(memoFile);
			br = new BufferedReader(fr);
			
			while(true) {
				//���پ� �о��
				String line= br.readLine();
				if(line==null) {
					break;
				}
				System.out.println(line);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {//���ܰ� �߻��ϴ� ���ϴ� ������ �ݵ�� ����Ǵ� ��
			//������ �۾��� �Ѵ�.
			try {
				//������ ������ �������� �ݴ´�.
				if(br!=null) {br.close();}
				if(br!=null)fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
