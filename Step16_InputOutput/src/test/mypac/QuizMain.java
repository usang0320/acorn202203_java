package test.mypac;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class QuizMain {
	public static void main(String[] args) {
		/*
		 *  Scanner ��ü�� �̿��ؼ� ���ڿ� ������ �Է� ���� ����
		 *  c:/acorn202203/myFolder/quiz.txt ������ ����
		 *  �ش� ���Ͽ� ���ڿ��� ������ ������.
		 */
		File f = new File("c:/acorn202203/myFolder/quiz.txt");
		Scanner sc = new Scanner(System.in);
		
		try {
			if(!f.exists()) {
				f.createNewFile();
			}
			FileWriter fw = new FileWriter(f);
			
			System.out.println("������ ���ڿ��� �Է����ּ���");
			String str = sc.nextLine();
			fw.write(str);
			
			fw.flush();
			fw.close();	//try�� �ȿ��� close �� ��� ���ܹ߻��ϸ� close ���� �ȵ� ���� ����
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
