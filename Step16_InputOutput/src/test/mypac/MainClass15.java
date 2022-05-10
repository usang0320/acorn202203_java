package test.mypac;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

public class MainClass15 {
	public static void main(String[] args) {
		//필요한 참조값을 담을 지역변수를 미리 만든다.
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		try {
			fis=new FileInputStream("c:/acorn202203/myFolder/1.jpg");
			fos=new FileOutputStream("c:/acorn202203/myFolder/copied2.jpg");
			ArrayList<Integer> codes = new ArrayList<>();
			while(true) {
				int code = fis.read();
				if(code==-1) {
					break;
				}
				codes.add(code);
			}
			for(int i=0; i<codes.size(); i++) {
				fos.write(codes.get(i));
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if(fos!=null)fos.close();
				if(fis!=null)fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
	}
}
