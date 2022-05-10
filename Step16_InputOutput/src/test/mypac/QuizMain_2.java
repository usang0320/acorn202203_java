package test.mypac;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class QuizMain_2 {
	public static void main(String[] args) {
		/*
		 *  Scanner ��ü�� �̿��ؼ� ���ڿ� ������ �Է� ���� ����
		 *  c:/acorn202203/myFolder/quiz.txt ������ ����
		 *  �ش� ���Ͽ� ���ڿ��� ������ ������.
		 */
		File f = new File("c:/acorn202203/myFolder/quiz.txt");
		Scanner sc = new Scanner(System.in);
		FileWriter fw = null;
		
		try {
			if(!f.exists()) {
				f.createNewFile();
			}
			//new FileWriter(�ؽ�Ʈ ������ ��ġ, append ��� ����)
			fw= new FileWriter(f,true);
			System.out.println("������ ���ڿ��� �Է����ּ���");
			String str = sc.nextLine();
			fw.write(str);
			fw.write("\n");
			fw.flush();
			System.out.println("���Ͽ� ���� �߽��ϴ�.");
				
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if(fw!=null)fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
}
