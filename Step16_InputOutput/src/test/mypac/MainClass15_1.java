package test.mypac;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

public class MainClass15_1 {
	public static void main(String[] args) {
		//필요한 참조값을 담을 지역변수를 미리 만든다.
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		try {
			fis=new FileInputStream("c:/acorn202203/myFolder/1.jpg");
			fos=new FileOutputStream("c:/acorn202203/myFolder/copied3.jpg");
			//읽어낸 int 값을 그대로 출력하면 됨
			while(true) {
				int data=fis.read();
				if(data==-1) {
					break;
				}
				fos.write(data);
				fos.flush();
			}
			System.out.println("작업성공!");
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(fos!=null)fos.close();
				if(fis!=null)fis.close();
			}catch	(Exception e) {
				
			}
		}
	}
}
