package test.mypac;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

public class MainClass16 {
	public static void main(String[] args) {
		//필요한 참조값을 담을 지역변수를 미리 만든다.
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		try {
			fis=new FileInputStream("c:/acorn202203/myFolder/1.jpg");
			fos=new FileOutputStream("c:/acorn202203/myFolder/copied3.jpg");
			//byte 알갱이를 읽어낼 byte[] 객체 생성
			byte[] buffer = new byte[1024];
			
			while(true) {
				int readedByte=fis.read(buffer);
				System.out.println("readedByte:"+readedByte);
				if(readedByte==-1) {
					break;	//반복문 탈출
				}
				//byte[] 에 있는 데이터를 0번방에서 부터 읽은 만큼(readedByte) 출력하기
				fos.write(buffer, 0, readedByte);
				fos.flush();	//flush 를 안해주면 한번에 방출하기 때문에 용량이 클 경우 메모리 차지 많이함
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
