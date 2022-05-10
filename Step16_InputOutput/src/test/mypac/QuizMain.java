package test.mypac;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class QuizMain {
	public static void main(String[] args) {
		/*
		 *  Scanner 객체를 이용해서 문자열 한줄을 입력 받은 다음
		 *  c:/acorn202203/myFolder/quiz.txt 파일을 만들어서
		 *  해당 파일에 문자열을 저장해 보세요.
		 */
		File f = new File("c:/acorn202203/myFolder/quiz.txt");
		Scanner sc = new Scanner(System.in);
		
		try {
			if(!f.exists()) {
				f.createNewFile();
			}
			FileWriter fw = new FileWriter(f);
			
			System.out.println("저장할 문자열을 입력해주세요");
			String str = sc.nextLine();
			fw.write(str);
			
			fw.flush();
			fw.close();	//try문 안에서 close 할 경우 예외발생하면 close 실행 안될 수도 있음
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
