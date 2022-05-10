package test.mypac;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class QuizMain_2 {
	public static void main(String[] args) {
		/*
		 *  Scanner 객체를 이용해서 문자열 한줄을 입력 받은 다음
		 *  c:/acorn202203/myFolder/quiz.txt 파일을 만들어서
		 *  해당 파일에 문자열을 저장해 보세요.
		 */
		File f = new File("c:/acorn202203/myFolder/quiz.txt");
		Scanner sc = new Scanner(System.in);
		FileWriter fw = null;
		
		try {
			if(!f.exists()) {
				f.createNewFile();
			}
			//new FileWriter(텍스트 파일의 위치, append 모드 여부)
			fw= new FileWriter(f,true);
			System.out.println("저장할 문자열을 입력해주세요");
			String str = sc.nextLine();
			fw.write(str);
			fw.write("\n");
			fw.flush();
			System.out.println("파일에 저장 했습니다.");
				
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
