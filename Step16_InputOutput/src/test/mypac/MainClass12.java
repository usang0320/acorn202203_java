package test.mypac;
import java.io.BufferedReader;
/*
 *  c:/acorn202203/myFolder/memo.txt ���Ͽ� ��ϵ� ���ڿ��� �о
 *  �ܼ�â�� ����ϱ�
 *  
 *  -hint
 *  FileReader ��ü�� �� Ȱ���� ������
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class MainClass12 {
	public static void main(String[] args) {
		File f = new File("c:/acorn202203/myFolder/memo.txt");
		
		try {
			FileReader fr = new FileReader(f);
			BufferedReader br = new BufferedReader(fr);
			while(true) {
				String str =br.readLine();
				if(str==null) {
					break;
				}
				System.out.println(str);
			}
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
			
			
	}
}
