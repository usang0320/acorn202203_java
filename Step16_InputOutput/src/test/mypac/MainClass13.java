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
			//파일에서 문자열을 읽어들일 수 있는 객체 생성
			FileReader fr =new FileReader(memoFile);
			BufferedReader br = new BufferedReader(fr);
			
			while(true) {
				//한줄씩 읽어내고
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
