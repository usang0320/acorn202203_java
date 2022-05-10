package test.mypac;

import java.io.File;

public class MainClass08 {
	public static void main(String[] args) {
		File f = new File("c:/");
		//파일객체 목록(File[]) 을 얻어내기
		File[] files = f.listFiles();
		
		//반복문 돌려서 File 객체를 하나씩 참조해서
		for(File tmp:files) {
			//해당 파일이 디렉토리라면
			if(tmp.isDirectory()) {
				System.out.println("[ "+tmp.getName()+" ]");
			}else {
				System.out.println(tmp.getName());
			}
		}
	}
}
