package test.mypac;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class MainClass12_1 {
	public static void main(String[] args) {
		File memoFile = new File("c:/acorn202203/myFolder/memo.txt");
		
		try {
			//���Ͽ��� ���ڿ��� �о���� �� �ִ� ��ü ����
			FileReader fr =new FileReader(memoFile);
			//�ݺ��� ���鼭 
			while(true) {
				//���� code �ϳ��� �о��.
				int code = fr.read();
				//���� ���̻� ���� code ���� ������ 
				if(code==-1) {
					break;//�ݺ��� Ż��
				}
				//�ڵ尪�� ���ڷ� ��ȯ�ؼ�
				char ch = (char)code;
				//�����ȣ ���� ����ϱ�
				System.out.print(ch);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
