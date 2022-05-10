package test.mypac;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class MainClass14 {
	public static void main(String[] args) {
		File memoFile = new File("c:/acorn202203/myFolder/memo.txt");
		//필요한 객체의 참조값을 담을 지역변수를 미리 만든다.
		FileReader fr=null;
		BufferedReader br = null;
		try {
			//파일에서 문자열을 읽어들일 객체의 참조값을 얻ㅇ어내서 미리 만들어둔 지역변수에 담는다.
			fr =new FileReader(memoFile);
			br = new BufferedReader(fr);
			
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
		}finally {//예외가 발생하던 안하던 실행이 반드시 보장되는 블럭
			//마무리 작업을 한다.
			try {
				//오픈한 순서의 역순으로 닫는다.
				if(br!=null) {br.close();}
				if(br!=null)fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
