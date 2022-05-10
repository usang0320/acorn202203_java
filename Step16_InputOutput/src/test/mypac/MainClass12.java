package test.mypac;
import java.io.BufferedReader;
/*
 *  c:/acorn202203/myFolder/memo.txt 파일에 기록된 문자열을 읽어서
 *  콘솔창에 출력하기
 *  
 *  -hint
 *  FileReader 객체를 잘 활용해 보세요
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
