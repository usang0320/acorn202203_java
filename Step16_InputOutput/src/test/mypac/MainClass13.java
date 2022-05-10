package test.mypac;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class MainClass13 {
	public static void main(String[] args) {
		File memoFile = new File("c:/acorn202203/myFolder/memo.txt");
		
		try {
			//���Ͽ��� ���ڿ��� �о���� �� �ִ� ��ü ����
			FileReader fr =new FileReader(memoFile);
			BufferedReader br = new BufferedReader(fr);
			
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
		}
	}
}
